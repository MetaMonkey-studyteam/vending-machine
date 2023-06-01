package com.metamonkey;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class random {
    @DisplayName("투입한 금액내에 맞는 상품 찾기")
    @Test
    public void randomProd(){
        //given
    int insertCoin=7000;
    String[][] product={{"1","2000","국수"},{"2","5000","사과"},{"3","6000","바나나"},{"4","8000","멜론"}};

    //when
        randomM rand=new randomM();
        int result=rand.sendRandom(insertCoin,product);

    //then

            System.out.println(result);



    }
}
