package com.metamonkey;

public class randomM {

    public int sendRandom(int insertCoin,String[][] product) {

    double random= Math.random();
    int rand=(int)(random* product.length);
    
    if(insertCoin<Integer.parseInt(product[rand][1])){

        throw new IllegalArgumentException("투입된 돈보다 비싼 상품입니다");
    }
    else{
        insertCoin-=Integer.parseInt(product[rand][1]);
    }

        return insertCoin;
    }
}