package com.parabank.testsuite;

import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    /*
        @Test
        public void verifyUserShouldNavigateToLoginPage() {
            //homePage.clickOnLoginLink();
           String actualtext=loginPage.getWelcomeText();
            String expectedTest= "Welcome, Please Sign In!";
            Assert.assertEquals(actualtext,expectedTest);

        }
    */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // homePage.clickOnLoginLink();
        loginPage.enterEmailId("jayeshpatel");
        loginPage.enterPassword("Jignesh123");
        loginPage.clickOnLoginButton();

        // String actualtext=loginPage.getWelcomeText();
        // String expectedTest= "Accounts Overview";
        // Assert.assertEquals(actualtext,expectedTest);
    }

    @Test
    public void verifyTheErrorMessage() {
        loginPage.enterEmailId("jayeshpate");
        loginPage.enterPassword("1234544354");
        loginPage.clickOnLoginButton();
    }

    // String actualMessage =loginPage.getErrorMessage();//update path
    // String expectedMessage ="The username and password could not be verified.";
    // Assert.assertEquals(actualMessage,expectedMessage);
    @Test
    public void userShouldLogOutSuccessfully() {
        loginPage.enterEmailId("abcd1234");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
      // loginPage.clickoutLoginButton();

        // driver.findElement(By.xpath("//div[@id='leftPanel']/ul[1]/li[8]/a")).click();
        // String actualtext = driver.findElement(By.xpath("//div[@id='leftPanel']/h2")).getText();
        String actuallogouttext = loginPage.logouttext();
        String expectedlogouttext = "Customer Login";
        Assert.assertEquals(expectedlogouttext, actuallogouttext);


    }
}