package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by jignesh
 */
public class LoginPage extends Utility {

    By welcomeText = By.xpath("//div[@id='rightPanel']/div[1]/div[1]/h1");
    By emailfield = By.xpath("//div[@id='loginPanel']/form[1]/div[1]/input");
    By passwordField = By.xpath("//div[@id='loginPanel']/form[1]/div[2]/input");
    By loginButton = By.xpath("//div[@id='loginPanel']/form[1]/div[3]/input");
    By errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");
    By logoutButton = By.xpath("//div[@id='leftPanel']/ul[1]/li[8]/a");

    By logouttext = By.xpath("//div[@id='leftPanel']/h2");

    public String getWelcomeText() {

        Reporter.log("get welcome text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        Reporter.log("Enter email ID" + email.toString());
        sendTextToElement(emailfield, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void clickoutLoginButton() {

        clickOnElement(logoutButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMag);
    }

    public String logouttext() {
        Reporter.log("logout  text" + logouttext.toString());
        return getTextFromElement(logouttext);
    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();

    }


    private class exception extends Exception {
    }
}
