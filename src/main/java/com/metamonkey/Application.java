package com.metamonkey;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        HashMap<String,Integer> product=new HashMap<>();

        productAddChange productAddChange = new productAddChange();

        productAddChange.addProduct(product);
        productAddChange.printProduct(product);
        productAddChange.deleteProduce(product);
        productAddChange.printProduct(product);
    }
}
