/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhncn.mathutil.core.test;

import com.minhncn.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author minh2
 */
public class MathUtilityTest {

    // Test exception
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowException() {
        //TESTCASE 5: with n = -5, expected value = Exception
        //Check does it throws exception
        //JUnit 4 does not use Assert to check exception, JUnit 5 does
        MathUtility.getFactorial(-5);
    }
    
    @Test
    //Trong hàm này sẽ chứa các testcase để chứa getF() với n hợp lệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReturnsWell(){
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); // thuc te getF() tra ve may
        //TESTCASE 1 : Test getF() with n = 0, expected result = 1
        //HOPE THAT : 0! = 1
        Assert.assertEquals(expectedValue, actualValue);
        
        //TESTCASE 2 : Test getF() with n = 5, expected result 5! = 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
        //TESTCASE 3 : Test getF() with n = 6, expected 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
        //TESTCASE 4 : Test getF() with n = 4, expected 24
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        
    }
}
