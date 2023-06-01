package com.metamonkey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class productTest {
    HashMap<String,Integer>product;

    private productAddChange productaddchange;

    @BeforeEach
    public void setup(){
        this.productaddchange=new productAddChange();
    }

    @DisplayName("추가, 출력이 잘 되는지 확인")
    @Test
    public void checkAdd(){
        productaddchange.addProduct(product);
        productaddchange.printProduct(product);
    }

//    @DisplayName("제거가 잘 되는지 확인")
//    @Test
//    public void checkDelete(){
//        productaddchange.deleteProduce(product);
//        Assertions.assertThrows(
//                NoClassDefFoundError.class,
//                () -> productaddchange.deleteProduce(product)
//        );
//    }

}
