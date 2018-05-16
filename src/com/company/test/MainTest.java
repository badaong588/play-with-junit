package com.company.test;

import com.company.main.Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MainTest {

    @Parameter
    public int a;
    @Parameter(1)
    public int b;
    @Parameter(2)
    public int result;
    @Parameter(3)
    public int wrongA;
    @Parameter(4)
    public int wrongB;
    @Parameter(5)
    public int wrongResult;

    @Parameters
    public static Collection<Object[]> generateData() {
        Object[][] objects = new Object[][] { {10, 5, 2, 10, 5, 3}, {8, 4, 2, 22, 2, 12}, {100, 25, 4, 100, 20, 6}};
        return Arrays.asList(objects);
    }

    Main mainObj;

    @Before
    public void setUpMainTest() {
        mainObj = new Main();
    }

    @Test
    public void main_DevideMethodExists() {
        Assert.assertEquals(2, mainObj.divide(10, 5));
    }

    @Test
    public void main_DevideMethodInput_ReturnTrue() {
        Assert.assertEquals("Devide with generated data", result, mainObj.divide(a, b));
    }

    @Test
    public void main_DevideMethodInput_ReturnFalse() {
        Assert.assertNotEquals("Devide wrong with generated data", wrongResult, mainObj.divide(wrongA, wrongB));
    }

    @Test(expected = IllegalArgumentException.class)
    public void main_DevideMethodZeroMauso() {
        mainObj.divide(10, 0);
    }
}
