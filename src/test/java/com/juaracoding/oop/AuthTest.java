package com.juaracoding.oop;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AuthTest {

    Auth auth;

    @BeforeClass
    public void setup() {
        auth = new Auth();
        System.out.println("Setup before running Auth tests");
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"admin", "Indonesia", true},
                {"admin", "WrongPassword", false},
                {"user", "Indonesia", false},
                {"user", "WrongPassword", false}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, boolean expected) {
        boolean result = auth.login(username, password);
        Assert.assertEquals(result, expected);
        System.out.println("Test login success passed");
    }

    @DataProvider(name = "registerData")
    public Object[][] registerData() {
        return new Object[][]{
                {"1234567890123451", "newuser1", "password123"},
                {"1234567890123452", "newuser2", "password123"},
                {"1234567890123453", "newuser3", "password123"},
                {"1234567890123454", "newuser4", "password123"},
                {"1234567890123455", "newuser5", "password123"},
                {"1234567890123456", "newuser6", "password123"},
                {"1234567890123457", "newuser7", "password123"}
        };
    }

    @Test(dataProvider = "registerData")
    public void testRegister(String nik, String username, String password) {
        boolean result = auth.register(nik, username, password);
        Assert.assertTrue(result);
        System.out.println("Test register success passed");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testRegisterWithInvalidNik() {  
        auth.register("invalidNik", "user", "password123");
        System.out.println("Test register with invalid NIK passed");
    }

    @DataProvider(name = "registerInvalidData")
    public Object[][] registerDataInvalid() {
        return new Object[][]{
                {null, "user", "password123"},
                {"1234567890123456", null, "password123"},
                {"1234567890123456", "user", null},
                {"1234567890123456", "user", "short"},
                {"invalidNik", "user", "password123"}
        };
    }

    @Test(dataProvider = "registerInvalidData", expectedExceptions = IllegalArgumentException.class)
    public void testRegisterInvalid(String nik, String username, String password) {
        boolean result = auth.register(nik, username, password);
        Assert.assertFalse(result);
        System.out.println("Test register with invalid data passed");
    }

}
