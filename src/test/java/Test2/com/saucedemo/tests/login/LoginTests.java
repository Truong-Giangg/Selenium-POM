package Test2.com.saucedemo.tests.login;

import Test2.com.saucedemo.base.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("123xua");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
