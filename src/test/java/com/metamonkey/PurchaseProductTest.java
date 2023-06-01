package com.metamonkey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PurchaseProductTest {

    private PurchaseProduct purchase;

    @BeforeEach
    public void setUp() {this.purchase = new PurchaseProduct();}

    @DisplayName("돈이 적을 때 상품 구매하면 예외 발생하게 테스트")
    @Test
    public void purchaseProduct() {

        //given
        int money = 50000;
        int item = 100000;

        //when & then
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> purchase.purchaseProduct(money, item));
    }
}
