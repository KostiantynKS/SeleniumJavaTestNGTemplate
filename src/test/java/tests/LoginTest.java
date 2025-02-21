package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.LoginPage;
import utils.ConfigurationReader;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(ConfigurationReader.getProperty("username"));
        loginPage.enterPassword(ConfigurationReader.getProperty("password"));
        loginPage.clickLogin();
        System.out.println("Title of the page is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(), ConfigurationReader.getProperty("pageTitle"));


    }


}
