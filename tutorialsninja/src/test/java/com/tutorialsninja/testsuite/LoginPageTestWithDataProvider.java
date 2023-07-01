package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComputerPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

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
