package tests;

import base.BaseTest;
import constants.ConfigConstants;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(ConfigConstants.USERNAME);
        loginPage.enterPassword(ConfigConstants.PASSWORD);
        loginPage.clickLogin();
        System.out.println("Title of the page is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(), ConfigConstants.PAGE_TITLE);


    }


}
