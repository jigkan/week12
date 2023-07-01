package com.tutorialsninja.myaccounts;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class MyAccountPage extends Utility {
    //Clickr on My Account Link.
    By clickaccount = By.linkText("My Account");

    public void clickonaccount() {
        clickOnElement(clickaccount);
    }

    //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
    By Registertext = By.linkText("Register");
    By Logintext = By.linkText("Login");
    By logottext = By.xpath("//div[@id='top-links']/ul[1]/li[2]/ul[1]/li[5]/a");

    public void selectMyAccountOptions(String option) {
        if (Objects.equals(option, "Register")) {
            clickOnElement(Registertext);
        } else if (Objects.equals(option, "Login")) {
            clickOnElement(Logintext);
        } else if (Objects.equals(option, "Logout")) {
            clickOnElement(logottext);
        }
    }

    //1.3 Verify the text “Register Account”.
    By Registertext1 = By.xpath("//div[@id='account-register']/div[1]/div[1]/h1");

    public String Registertextmethod() {
        return getTextFromElement(Registertext1);
    }
    //  2.3 Verify the text “Returning Customer”.

    By logintext1 = By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/h2");

    public String logintextmethod() {
        return getTextFromElement(logintext1);
    }

    //3.3 Enter First Name
    By inputfirstname = By.id("input-firstname");

    public void inpufirstnamemethod(String firstname) {
        sendTextToElement(inputfirstname, firstname);
    }

    // 3.4 Enter Last Name
    By inputlastname = By.id("input-lastname");

    public void inpulastnamemethod(String lastname) {
        sendTextToElement(inputlastname, lastname);
    }

    ///3.5 Enter Email
    By inputemail = By.id("input-email");

    public void inputemailmethod(String email) {
        sendTextToElement(inputemail, email);
    }

    //3.6 Enter Telephone
    By inputtelephone = By.id("input-telephone");

    public void inpuphonemethod(String phone) {
        sendTextToElement(inputtelephone, phone);
    }

    //3.7 Enter Password
    By inputpassword = By.id("input-password");

    public void inputpasswordmethod(String password) {
        sendTextToElement(inputpassword, password);
    }

    //3.8 Enter Password Confirm
    By inputconfirmpassword = By.id("input-confirm");

    public void inpuconfirmpassmethod(String confimpass) {
        sendTextToElement(inputconfirmpassword, confimpass);
    }

    //3.9 Select Subscribe Yes radio button
    By radiobutton = By.xpath("//Div[@class='form-group']/div[1]/label[1]/input");

    public void radiobutton() {
        clickOnElement(radiobutton);
    }

    //3.10 Click on Privacy Policy check box
    By checkbox = By.xpath("//Div[@class='pull-right']/input[1]");

    public void checkboxm() {
        clickOnElement(checkbox);
    }

    // 3.11 Click on Continue button
    By continuebutton1 = By.xpath("//Div[@class='pull-right']/input[2]");

    public void continuebuttonmethod() {
        clickOnElement(continuebutton1);
    }

    // 3.12 Verify the message “Your Account Has Been Created!”
    By createdtext = By.xpath("//div[@id='common-success']/div[1]/div[1]/h1");

    public String createdtextmethod() {
        return getTextFromElement(createdtext);
    }

    // 3.13 Click on Continue button
    By cotinuebutton2 = By.xpath("//div[@id='common-success']/div[1]/div[1]/div[1]/div[1]/a");

    public void continuebuttonmethod2() {
        clickOnElement(cotinuebutton2);
    }

    //3.16 Verify the text “Account Logout”
    By logouttext = By.xpath("//div[@id='common-success']/div[1]/div[1]/h1");

    public String logouttextmethod2() {
        return getTextFromElement(logouttext);
    }

    //3.17 Click on Continue button
    By continuebutton3 = By.xpath("//div[@id='common-success']/div[1]/div[1]/div[1]/div[1]/a");

    public void continuebuttonmethod3() {
        clickOnElement(continuebutton3);
    }

    // 4.3 Enter Email address
    By emaillogin = By.id("input-email");

    public void emailloginmethod(String loginemail) {
        sendTextToElement(emaillogin, loginemail);
    }

    // 4.5 Enter Password
    By emailpassword = By.id("input-password");

    public void emailpasswordmethod(String loginpassword) {
        sendTextToElement(emailpassword, loginpassword);
    }

    // 4.6 Click on Login button
    By loginbutbutton = By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");

    public void loginbuttonmethod3() {
        clickOnElement(loginbutbutton);
    }

    // 4.7 Verify text “My Account”
    By myaccounttext = By.xpath("//div[@id='account-account']/div[1]/div[1]/h2");

    public String myaccounttextmethod() {
        return getTextFromElement(myaccounttext);
    }

    // 4.11 Click on Continue button
    By continuebutton4 = By.xpath("//div[@id='common-success']/div[1]/div[1]/div[1]/div[1]/a");

    public void continuebutton4() {
        clickOnElement(continuebutton4);
    }
}