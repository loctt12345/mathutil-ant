/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhncn.mathutil.core.test;

import com.minhncn.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author loc12345
 */
//Bao voi JUnit, tach data va ham test rieng biet (data driven testing)
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {
    //Mang 2 chieu de chua data trong test case
    //Quy uoc mang phai la static public
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    
    //Map tung cap data o tren vao 2 bien cuc bo
    //Day 2 bien nay vao ham assertEquals
    @Parameterized.Parameter(value = 0) // lay cot 0 cua mang gan vao n
    public int n;
    
    @Parameterized.Parameter(value = 1) // lay cot 1 cua mang gan vao expected
    public int expected;
    
    //Test function
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
