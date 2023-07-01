package com.tutorialsninja.desktops;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Descktopspage extends Utility {
    //Mouse hover on Desktops Tab.and click
    By Desktopclick = By.xpath("//ul[@class='nav navbar-nav']/li[1]/a");

    public void Descktopclickmethod() {
        mouseHoverToElementAndClick(Desktopclick);
    }

    //Click on “Show All Desktops”
    By showall = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul[1]/li[1]/div[1]/a");

    By sortby1 = By.xpath("//div[@id='content']/div[3]/div[3]/div[1]/select[1]");

    public void sortbymethod1() {
        selectByVisibleTextFromDropDown(sortby1, "Name (Z - A)");
    }


    public void showallmethod() {
        clickOnElement(showall);
    }
    ///// Verify the Product will arrange in Descending order.

    //2.3 Select Sort By position "Name: A to Z"
    By sortby = By.xpath("//div[@id='content']/div[3]/div[3]/div[1]/select[1]");

    public void sortbymethod() {
        selectByVisibleTextFromDropDown(sortby, "Name (A - Z)");
    }

    By dorpdown = By.xpath("//div[@id='content']/div[4]/div[3]/div[1]");

    public void selectHPLP3065() {
        clickOnElement(dorpdown);
    }

    //Verify the Text "HP LP3065"
    By LP3065text = By.xpath("//div[@id='product-product']/div[1]/div[1]/div[1]/div[2]/h1");

    public String Lp3065textmethod() {
        return getTextFromElement(LP3065text);
    }

    By datefield = By.xpath("//input[@id='input-option225']");

    //2.6 Select Delivery Date "2022-11-30"
    public void dateclearmethod() {
        clearTextFromField(datefield);
    }

    public void datemethod1(String date) {
        sendTextToElement(datefield, date);
    }

    //2.7.Enter Qty "1” using Select class.
    By qnt=By.cssSelector("input#input-quantity");
    public void qntclearmethod() {
        clearTextFromField(qnt);
    }

    public void qntmethod1(String number) {
        sendTextToElement(qnt, number);
    }

   // click on chrtbutton
    By clickonchrtbutton= By.xpath("//button[@id='button-cart']");

    public void cliclonchrtmethod() {clickOnElement(clickonchrtbutton);
    }

    //2.8 Click on “Add to Cart” button on successmsg
    By shoplingchartclick = By.xpath("/html/body/div[2]/div[1]/a[2]");
    public void shopingchartclickmethod() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElementAndClick(shoplingchartclick);
    }
   // public void addtoCart() throws InterruptedException {

       // Thread.sleep(2000);
       // clickOnElement(addtocartbutton);
   // }
    // 2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”



    //2.12 Verify the Product name "HP LP3065"
    By HPLPtext=By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[2]/a");
    public String HPLPtextmethod() {  return getTextFromElement(HPLPtext);    }
    //2.13 Verify the Delivery Date "2022-11-30"
    By datetext=By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[2]/small[1]");
    public String datetestmethod() {        return getTextFromElement(datetext);    }
    //2.14 Verify the Model "Product21"
    By modeltext=By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[3]");
    public String modelmethod() {        return getTextFromElement(modeltext);    }
    //2.15 Verify the Todat "£74.73"
    By totaltext=By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[6]");
    public String totalmethod() {        return getTextFromElement(totaltext);    }
}