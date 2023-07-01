package com.tutorialsninja.testsuite;

import com.tutorialsninja.myaccounts.MyAccountPage;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountPageTest extends TestBase {
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //Click on My Account Link.
        myAccountPage.clickonaccount();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccountPage.selectMyAccountOptions("Register");
        //selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
        String expectedregistertext1 = myAccountPage.Registertextmethod();
        String actualegistertext1 = "Register Account";
        Assert.assertEquals(expectedregistertext1, actualegistertext1);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //2.1 Click on My Account Link.
        myAccountPage.clickonaccount();
        // 2.2 Call the method “selectMyAccountOptions” method and pass the parameter“Login”
        myAccountPage.selectMyAccountOptions("Login");
        //selectMyAccountOptions("Login");
        //  2.3 Verify the text “Returning Customer”.

        String expectedlogintext = myAccountPage.logintextmethod();
        String actuallogintext = "Returning Customer";
        Assert.assertEquals(expectedlogintext, actuallogintext);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        //3.1 Click on My Account Link.
        myAccountPage.clickonaccount();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter“Register”
        myAccountPage.selectMyAccountOptions("Register");
        // selectMyAccountOptions("Register");
        //3.3 Enter First Name
        myAccountPage.inpufirstnamemethod("Hiren");
        // 3.4 Enter Last Name
        myAccountPage.inpulastnamemethod("patel");
        ///3.5 Enter Email
        myAccountPage.inputemailmethod("hiren23@gmail.com");
        //3.6 Enter Telephone
        myAccountPage.inpuphonemethod("8767542386");
        //3.7 Enter Password
        myAccountPage.inputpasswordmethod("123456");
        //3.8 Enter Password Confirm
        myAccountPage.inpuconfirmpassmethod("123456");
        //3.9 Select Subscribe Yes radio button
        myAccountPage.radiobutton();
        //3.10 Click on Privacy Policy check box
        myAccountPage.checkboxm();
        // 3.11 Click on Continue button
        By continuebutton1 = By.xpath("//Div[@class='pull-right']/input[2]");
        myAccountPage.continuebuttonmethod();
        // 3.12 Verify the message “Your Account Has Been Created!”
        String expectedcreatedtext = myAccountPage.createdtextmethod();
        String actualcreatedtext = "Your Account Has Been Created!";
        Assert.assertEquals(expectedcreatedtext, actualcreatedtext);
        // 3.13 Click on Continue button
        myAccountPage.continuebuttonmethod2();
        //3.14 Clicke on My Account Link.
        myAccountPage.clickonaccount();
        // 3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        // selectMyAccountOptions("Logout");
        myAccountPage.selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”

        String expectedlogouttext = myAccountPage.logouttextmethod2();
        String actuallogouttext = "Account Logout";
        Assert.assertEquals(expectedlogouttext, actuallogouttext);
        //3.17 Click on Continue button
        myAccountPage.continuebuttonmethod3();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        // 4.1 Click on My Account Link.
        myAccountPage.clickonaccount();
        // 4.2 Call the method “selectMyAccountOptions” method and pass the parameter“Login”
        //selectMyAccountOptions("Login");
        myAccountPage.selectMyAccountOptions("Login");
        // 4.3 Enter Email address
        myAccountPage.emailloginmethod("hiren@gmail.com");
        // 4.5 Enter Password
        myAccountPage.emailpasswordmethod("123456");

        // 4.6 Click on Login button
        myAccountPage.loginbuttonmethod3();

        // 4.7 Verify text “My Account”
        String expectedmyaccounttext=myAccountPage.myaccounttextmethod();
         String actualyaccounttext = "My Account";
        Assert.assertEquals(expectedmyaccounttext,actualyaccounttext);
        // 4.8 Clickr on My Account Link.
        myAccountPage.clickonaccount();
        // 4.9 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        // selectMyAccountOptions("Logout");
        myAccountPage.selectMyAccountOptions("Logout");
        // 4.10 Verify the text “Account Logout”
        String expectedlogouttext = myAccountPage.logouttextmethod2();
        String actuallogouttext = "Account Logout";
        Assert.assertEquals(expectedlogouttext, actuallogouttext);
        // 4.11 Click on Continue button
       myAccountPage.continuebutton4();

    }


}
