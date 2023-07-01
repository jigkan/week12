package com.tutorialsninja.laptopsandnotebooks;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LaptopsAndNotebooksPage extends Utility {
    //Mouse hover on laptopandnotebook Tab.and click
    By Laptopandnotebookclick = By.linkText("Laptops & Notebooks");

    public void Laptopandnotebookclickmethod() {
        mouseHoverToElementAndClick(Laptopandnotebookclick);
    }

    //Click on “Show All Desktops”
    By showalllap = By.linkText("Show AllLaptops & Notebooks");

    public void showallmethod1() {
        clickOnElement(showalllap);
    }

    //select high to low
    By sortby2 = By.xpath("//select[@id='input-sort']");

    public void sortbymethod2() {
        selectByVisibleTextFromDropDown(sortby2, "Price (High > Low)");
    }
    //////////////////verify high to low by printing high to low selected field

    By hightolowlex = By.cssSelector("select#input-sort>option:nth-of-type(5)");

    public String hightolowtextmethod() {
        return getTextFromElement(hightolowlex);
    }

    //2.4 Select Product “MacBook”
    By selecmackbook = By.linkText("MacBook");

    public void selectmethod() {
        clickOnElement(selecmackbook);
    }

    //2.5 Verify the text “MacBook”
    By macprodcut = By.linkText("MacBook");

    public String macproductmethod() {
        return getTextFromElement(macprodcut);
    }

    //2.6 Click on ‘Add To Cart’ button
    By AddtoCart = By.xpath("//div[@id='product']/div[1]/button[1]");

    public void clickaddchartmethod() {
        clickOnElement(AddtoCart);
    }

    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    //2.8 Click on link “shopping cart” display into success message
    By shoplingchartclick = By.linkText("shopping cart");

    public void shopingchartclickmethod() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElementAndClick(shoplingchartclick);
    }

    //2.9 Verify the text "Shopping Cart"
    By shoppingcarttext = By.cssSelector("div#content>h1");

    public String shoppingcarttext() {
        return getTextFromElement(shoppingcarttext);
    }

    //2.10 Verify the Product name "MacBook"
    By actualprodcutname = By.linkText("MacBook");

    public String macbookproductmethod() {
        return getTextFromElement(actualprodcutname);
    }

    //2.11 Change Quantity "2"remove 1 and add2
    By quantitychange = By.xpath("//div[@id='content']/form/div[1]/table/tbody/tr/td[4]/div[1]/input");

    public void quantitychangemethod() {
        clearTextFromField(quantitychange);
    }

    public void quantitysend2(String number) {
        sendTextToElement(quantitychange, number);
    }

    //2.12 Click on “Update” Tab
    By updatebutton = By.xpath("//button[@type='submit']");

    public void updatebuttonmethod() {
        clickOnElement(updatebutton);
    }

    //2.13 Verify the message “Success: You have modified your shopping cart!”
    By modifiedyourshoppingcarttext = By.xpath("//*[@id=\"checkout-cart\"]/div[1]");

    public String modifiedyourshoppingcarttextmethod() {
        return getTextFromElement(modifiedyourshoppingcarttext);
    }

    //2.14 Verify the Total $1,204.00
    By totaltext = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]");

    public String totaltextmethod() {
        return getTextFromElement(totaltext);
    }

    //2.15 Click on “Checkout” button
    By chechoutbutton = By.xpath("//div[@id=\"content\"]/div[3]/div[2]/a");

    public void checkoutburronmethod() {
        clickOnElement(chechoutbutton);
    }

    //2.16 Verify the text “Checkout”
    By checkouttext = By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/h1");

    public String checouttextmethod() {
        return getTextFromElement(checkouttext);
    }

    //2.17 Verify the Text “New Customer”
    By customertext = By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2");

    public String customertextmethod() {
        return getTextFromElement(customertext);
    }

    //2.18 Click on “Guest Checkout” radio button
    By guestchechout = By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/input");

    public void guestcheckoutmethod() {
        clickOnElement(guestchechout);
    }

    //2.19 Click on “Continue” tab
    By continuetab = By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");

    public void continuemethod1() {
        clickOnElement(continuetab);
    }

    //2.20 Fill the mandatory fields
    By paymentfirstname = By.id("input-payment-firstname");
    By paymentlastname = By.id("input-payment-lastname");
    By paymentemail = By.id("input-payment-email");
    By paymenttelephone = By.id("input-payment-telephone");
    By paymentaddress1 = By.id("input-payment-address-1");
    By paymentcity = By.id("input-payment-city");
    By paymentostcode = By.id("input-payment-postcode");
    By paymentreion = By.id("input-payment-zone");

    public void registerfieldmethod(String firstname, String lastname, String email, String phone, String add1, String city, String code) {
        sendTextToElement(paymentfirstname, firstname);
        sendTextToElement(paymentlastname, lastname);
        sendTextToElement(paymentemail, email);
        sendTextToElement(paymenttelephone, phone);
        sendTextToElement(paymentaddress1, add1);
        sendTextToElement(paymentcity, city);
        sendTextToElement(paymentostcode, code);

    }

    By selectcountryby = By.id("input-payment-country");

    public void selectcountrybymethod() {
        selectByVisibleTextFromDropDown(selectcountryby, "United Kingdom");
    }

    By selectregionyby = By.id("input-payment-zone");

    public void selectregionbymethod() {
        selectByVisibleTextFromDropDown(selectregionyby, "Devon");
    }

    //2.21 Click on “Continue” Button
    By continuebutton2 = By.id("button-guest");

    public void continuebutton2method() {
        clickOnElement(continuebutton2);
    }

    By addcomments = By.xpath("//div[@id='collapse-payment-method']/div[1]/p[2]/textarea");
    //2.22 Add Comments About your order into text area
    public void addcommentmethod(String commentwrite) {
        sendTextToElement(addcomments, commentwrite);
    }
    //2.23 Check the Terms & Conditions check box
    By Termclick=By.xpath("//div[@id='collapse-payment-method']/div[1]/div[2]/div[1]/input[1]");
    public void termclickmethod(){ clickOnElement(Termclick);}
    //2.24 Click on “Continue” button
    By continuebutton3=By.xpath("//div[@id='collapse-payment-method']/div[1]/div[2]/div[1]/input[2]");
    public void continueburron3method(){clickOnElement(continuebutton3);}
    //2.25 Verify the message “Warning: Payment method required!”
    By warningtext=By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[1]/text()");
    public String warningtextmethod() throws InterruptedException{
        Thread.sleep(2000);
        return getTextFromElement(warningtext);
    }


}