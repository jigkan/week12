package com.parabank.testsuite;

import com.parabank.pages.RegisterPage;
import com.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {


    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        registerPage.clickonRegisterButton();

        String actualtextregistertext = registerPage.registertextmessage();
        String expectedtextregistertext = "Signing up is easy!";
        Assert.assertEquals(expectedtextregistertext, actualtextregistertext);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        registerPage.clickonRegisterButton();
        registerPage.enterfirstname("1biyan", "1panani", "7,maybank Avenue", "london", "uk", "232323", "09658756696", "ffggr", "abcd1234", "123456", "123456");
        registerPage.clickonregisterbutton2();

        String actualaccountcteredtext = registerPage.accountctetedtextmessage();
        String expectedaccountcreatedtext = "Your account was created successfully. You are now logged in.";
        //Assert.assertEquals(expectedaccountcreatedtext,actualaccountcteredtext);


    }
}
