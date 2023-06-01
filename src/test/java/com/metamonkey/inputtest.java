package com.metamonkey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class inputtest {
    private input divideCalc;

    @BeforeEach
    public void Setup(){
        this.divideCalc = new input();
    }

    @Test
    @DisplayName("나눌 수가 0이면 예외 발생하는지 확인")
    public void testZeroArgument(){
        //given
        Scanner sc = new Scanner(System.in);
        System.out.println("안녕하세요 금액을 입력해주세요");
        int num = sc.nextInt();
        Assertions.assertThrows(IllegalArgumentException.class,()->divideCalc.inputTwoNumbers(num));
        //then
    }
}
