package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    By register = By.xpath("//div[@id='loginPanel']/p[2]/a");

    public void clickonRegisterButton() {
        clickOnElement(register);
    }


    By registertext = By.xpath("//div[@id='rightPanel']/h1");

    public String registertextmessage() {
        Reporter.log("get welcome text" + registertext.toString());

        return getTextFromElement(registertext);
    }


    By firstnameField = By.id("customer.firstName");
    By lastnameField = By.id("customer.lastName");

    By streetField = By.id("customer.address.street");
    By cityField = By.id("customer.address.city");
    By stateField = By.id("customer.address.state");

    By zipField = By.id("customer.address.zipCode");

    By phoneField = By.id("customer.phoneNumber");

    By ssnField = By.id("customer.ssn");

    By re_usernameField = By.id("customer.username");

    By re_passwordField = By.id("customer.password");

    By re_repeatedpasswordField = By.id("repeatedPassword");

    By regiserbutton2 = By.xpath("//form[@id='customerForm']/table[1]/tbody[1]/tr[13]/td[2]/input");

    public void enterfirstname(String firstname, String lastname, String street, String city, String state, String Zip, String phone, String snn, String re_username, String re_password, String repeatpassword) {
        sendTextToElement(firstnameField, firstname);
        sendTextToElement(lastnameField, lastname);
        sendTextToElement(streetField, street);
        sendTextToElement(cityField, city);
        sendTextToElement(stateField, state);
        sendTextToElement(zipField, Zip);
        sendTextToElement(phoneField, phone);
        sendTextToElement(ssnField, snn);
        sendTextToElement(re_usernameField, re_username);
        sendTextToElement(re_passwordField, re_password);
        sendTextToElement(re_repeatedpasswordField, repeatpassword);
    }

    public void clickonregisterbutton2() {
        clickOnElement(regiserbutton2);
    }

    By account_created_text = By.xpath("//div[@id='rightPanel']/p");

    public String accountctetedtextmessage() {
        Reporter.log("account ctreated text" + account_created_text.toString());

        return getTextFromElement(account_created_text);
    }


}

