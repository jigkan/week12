package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComputerPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage loginPage= new ComputerPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String actualtext=loginPage.getWelcomeText();
        String expectedTest= "Welcome, Please Sign In!";
        Assert.assertEquals(actualtext,expectedTest);

    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("bhav12@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actualMessage =loginPage.getErrorMessage();
        String expectedMessage ="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

}
