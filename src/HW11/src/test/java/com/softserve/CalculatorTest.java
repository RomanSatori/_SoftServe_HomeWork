package com.softserve;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.parallel.Execution;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    int x = 4;
    int y = 5;
    @BeforeEach
    void init() {
        calculator = new Calculator();
        System.out.println("Before each test");
    }

    @AfterEach
    void afterTests() {
        System.out.println("after each tests");
    }

    @DisplayName("Get sum")
    @Test
    public void testGetSum() {

        int actual = calculator.getSum(7, 8);
        assertEquals(15, actual, "sum 7+8 = 15");
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(20, calculator.getDiv(100, 5));
    }

    @Test
    public void testGetMultiple() throws Exception {
        assertEquals(60, calculator.getMultiple(30, 2));
    }

    @Test
    public void testGetDifference() {
        assertEquals(30, calculator.getDifference(70, 40));
    }

    @Test
    public void testDivByZero(){
        assertEquals(ArithmeticException.class, new Executable(){
            public void execute() throws Throwable{
                calculator.getDiv(x, 0);
            }
        });
    }
}
