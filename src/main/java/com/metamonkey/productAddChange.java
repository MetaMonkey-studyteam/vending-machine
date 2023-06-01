package com.metamonkey;

import javax.xml.namespace.QName;
import java.nio.channels.Pipe;
import java.security.KeyPair;
import java.security.PublicKey;
import java.util.*;

public class productAddChange {
        public void addProduct(HashMap<String,Integer> product){
            Scanner sc=new Scanner(System.in);

            Integer num=Integer.parseInt("2000");
            System.out.println(num);

            System.out.print("몇개의 상품을 추가할까요? : ");
            int number=sc.nextInt();
            for (;number>0;number--){
                System.out.println("추가할 상품의 이름과 가격을 입력해 주세요");
                System.out.print("상품 이름 : ");
                String name = sc.next();

                System.out.print("상품 가격 : ");
                int price = sc.nextInt();

                product.put(name, price);
            }
        }

        public void deleteProduce(HashMap<String,Integer> product){
            System.out.println("제거할 상품의 이름을 입력해주세요 : ");
            Scanner sc=new Scanner(System.in);
            System.out.print("상품 이름 : ");
            String name= sc.next();

            if(!product.containsKey(name)){
                throw new NoSuchElementException("존재하지 않는 제품입니다");
            }
            else{
                product.remove(name);
            };
        }

        public void printProduct(HashMap<String,Integer> product) {
            for (String key : product.keySet()) {
                Integer value = product.get(key);
                System.out.println("제풀 : "+key + ", 가격 : " + value);
            }
        }
}
