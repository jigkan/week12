package gov.uk.check.visa.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import gov.uk.check.visa.Pages.ComputerPage;
import gov.uk.check.visa.Pages.HomePage;
import gov.uk.check.visa.testbase.TestBase;

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
