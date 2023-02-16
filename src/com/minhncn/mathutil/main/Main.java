/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhncn.mathutil.main;

import com.minhncn.mathutil.core.MathUtility;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentThrowException();
    }

    //THIS METHOD WILL BE TESTED WRONG ARGUMENT
    //THIET KE HAM getF() LA CHI TINH N! TOI 0..20 
    //NEU DUA N < 0 HOAC N > 20 THI HAM SE KHONG TINH VA NEM RA NGOAI LE
    //THUC TE HAM getF() LUC CHAY CO LAM NHU THIET KE HAY KHONG CHAY THU MOI BIET DUOC
    public static void testFactorialGivenWrongArgumentThrowException() {
        //TEST CASE 4 : TEST getF() WITH N = -5 ( WRONG ARGUMENT ) 
        //EXPECTED VALUE : AN EXCEPTION IS THROW ( IllegalArgumentException ) 
        //ngoai le duoc nem ra dung theo mong muon
        System.out.println("Test n! -5!: expected =  IllegalArgumentException is thrown ");
        MathUtility.getFactorial(-5);
    }

    // tên hàm bao gồm ý nghĩa của việc kiểm thử
    // hàm dưới kiểm thử với n đúng
    public static void testFactorialGivenRightArgumentRunsWell() {

        //Test Case #1: Test getFactorial with n = 0
        //Expected value:1 - hy vọng đưa n=0 thì hàm trả về 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);

        System.out.println("Test n! " + n + "!: expected = " + expectedValue
                + " | actual: " + actualValue);

        //TEST CASE 2 : Test getFactorial with n = 1
        //Expected value: 1 - Hope 1! app will be returned 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n); // hien thuc ham chay
        System.out.println("Test n! " + n + "!: expected = " + expectedValue
                + " | actual: " + actualValue);

        //TEST CASE 3 : TEST GET FACTORIAL WITH N = 3
        //EXPECTED VALUE : 6 
        actualValue = MathUtility.getFactorial(3);
        System.out.println("Test n! 3!: expected = 6 " + "| actual: " + actualValue);
    }
}
