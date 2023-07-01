package gov.uk.check.visa.testsuite;

import org.testng.annotations.Test;
import resources.testdata.TestData;
import gov.uk.check.visa.Pages.ComputerPage;
import gov.uk.check.visa.Pages.HomePage;
import gov.uk.check.visa.testbase.TestBase;

/**
 * Created by Bhavesh
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    ComputerPage loginPage= new ComputerPage();



    @Test (dataProvider = "logindata", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
    homePage.clickOnLoginLink();
    loginPage.loginToApplication(username,password);

    }

}
