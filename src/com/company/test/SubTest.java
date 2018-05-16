package com.company.test;

import com.company.main.Sub;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class SubTest {
    static Sub subObj;

    @BeforeClass
    public static void setUpSub() {
        subObj = new Sub();
    }

    @Test (expected = IllegalArgumentException.class)
    public void sub_PasswordInputNull() {
        subObj.checkPassword(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void sub_PasswordLengthNull() {
        subObj.checkPassword("");
    }

    @Test
    public void sub_PasswordL_engthLessThanEight_ReturnFalse() {
        Assert.assertEquals(false, subObj.checkPassword("huy"));
    }

    @Test
    public void sub_PasswordValid_ReturnTrue() {
        Assert.assertEquals(true, subObj.checkPassword("huynguyen123"));
    }

    @Test
    public void sub_PasswordWithInvalidCharacter_ReturnFalse() {
        Assert.assertEquals(false, subObj.checkPassword("huynguyen123!@#@!"));
    }
}
