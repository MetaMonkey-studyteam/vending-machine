package com.metamonkey;

public class PurchaseProduct {
    public void purchaseProduct(int money, int item) {

        if (money > item) {
            System.out.println("돈이 넉넉하여 상품 구매 성공!");
            int result = money - item;
            System.out.println("남은 돈 : " + result);
        } else if (money < item) {
            throw new IllegalArgumentException("돈이 부족합니다.");
        }
    }
}
