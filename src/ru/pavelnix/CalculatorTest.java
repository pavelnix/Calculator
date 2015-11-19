package ru.pavelnix;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class Calculator
 */
public class CalculatorTest {

    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        float result = calculator.div(1.8f,2.5f);
        float delta = 0.00000001f;
        Assert.assertEquals(0.7199, result, delta);
    }

    @Test
    public void testMinus() throws Exception {
        Calculator calculator = new Calculator();
        float result = calculator.minus(1, 1);
        float delta = 0;
        Assert.assertEquals(0, result, delta);
    }

    @Test
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        float result = calculator.sum(1, 1);
        float delta = 0;
        Assert.assertEquals(2, result, delta);
    }

    @Test
    public void testMult() throws Exception {
        Calculator calculator = new Calculator();
        float result = calculator.mult(1, 1);
        float delta = 0;
        Assert.assertEquals(1, result, delta);
    }
}