package com.metamonkey;

import java.util.Scanner;

public class input {
    public int inputTwoNumbers(int num) {
        int name = num;
        checkZero(num);
        return name;
    }
    private static void checkZero(int num2){
        if(num2<=0){
            throw new IllegalArgumentException("안녕하세요 돈이 최소화 되어 투입못해요");
        }
        else if(num2>100000){
            throw new IllegalArgumentException("안녕하세요 돈이 초과되어 투입못해요");

        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("안녕하세요 금액을 입력해주세요");
        int num = sc.nextInt();
        checkZero(num);

    }
}
