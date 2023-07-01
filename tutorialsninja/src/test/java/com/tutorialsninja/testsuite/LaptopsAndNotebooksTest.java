package com.tutorialsninja.testsuite;

import com.tutorialsninja.laptopsandnotebooks.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksTest extends TestBase {
    LaptopsAndNotebooksPage laptopsAndNotebooksTest=new LaptopsAndNotebooksPage();
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //Mouse hover on laptopandnotebook Tab.and click
        laptopsAndNotebooksTest.Laptopandnotebookclickmethod();
        //Click on “Show All Desktops”
        laptopsAndNotebooksTest.showallmethod1();
        // Select Sort By "Price (High > Low)"
        laptopsAndNotebooksTest.sortbymethod2();
      String expectedhoghtolowtext=laptopsAndNotebooksTest.hightolowtextmethod();
      String actulahightolowtext="Price (High > Low)";
      Assert.assertEquals(expectedhoghtolowtext,actulahightolowtext);
            }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        //Mouse hover on Laptops & Notebooks Tab and click
        laptopsAndNotebooksTest.Laptopandnotebookclickmethod();
        //2.2 Click on “Show All Laptops & Notebooks”
        laptopsAndNotebooksTest.showallmethod1();
        // 2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksTest.sortbymethod2();
        //2.4 Select Product “MacBook”
        laptopsAndNotebooksTest.selectmethod();
        //2.5 Verify the text “MacBook”
      String expectedmacprodcut=laptopsAndNotebooksTest.macproductmethod();
        String actualmacprodcut="MacBook";
        Assert.assertEquals(expectedmacprodcut,actualmacprodcut);

        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNotebooksTest.clickaddchartmethod();

        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”

        ///////////////verify text not done
        //2.8 Click on link “shopping cart” display into success message
        laptopsAndNotebooksTest.shopingchartclickmethod();
        //2.9 Verify the text "Shopping Cart"
        String expectedshoppingtext=laptopsAndNotebooksTest.shoppingcarttext();
        String actulashoppingtext="Shopping Cart  (0.00kg)";
        Assert.assertEquals(expectedshoppingtext,actulashoppingtext);
        //2.10 Verify the Product name "MacBook"
       String expectedprodcutname=laptopsAndNotebooksTest.macproductmethod();
        String actualprodcutname="MacBook";
       Assert.assertEquals(expectedprodcutname,actualprodcutname);
        //2.11 Change Quantity "2"remove 1 and add2   //*[@id="content"]/form/div/table/tbody/tr/td[4]/div/input
        laptopsAndNotebooksTest.quantitychangemethod();
        laptopsAndNotebooksTest.quantitysend2("2");

        //2.12 Click on “Update” Tab
      laptopsAndNotebooksTest.updatebuttonmethod();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
       String expectedmodifiedtext=laptopsAndNotebooksTest.modifiedyourshoppingcarttextmethod();
        String actualmodifiedyourshoppingcarttext="Success: You have modified your shopping cart!\n" +
                "×";
        Assert.assertEquals(expectedmodifiedtext,actualmodifiedyourshoppingcarttext);
        //2.14 Verify the Total $1,204.00
        String expectedtotaltext=laptopsAndNotebooksTest.totaltextmethod();
        String actualtotaltext="$1,204.00";
        Assert.assertEquals(expectedtotaltext,actualtotaltext);
        //2.15 Click on “Checkout” button
       laptopsAndNotebooksTest.checkoutburronmethod();

        //2.16 Verify the text “Checkout”
        String expecteedcheckouttext1=laptopsAndNotebooksTest.checouttextmethod();
        String expectedchechouttext1="Checkout";
        Assert.assertEquals(expecteedcheckouttext1,expectedchechouttext1);
        //2.17 Verify the Text “New Customer”
        String expectedcustomertext=laptopsAndNotebooksTest.customertextmethod();
        String actualcustomertext="New Customer";
        Assert.assertEquals(expectedcustomertext,actualcustomertext);
        //2.18 Click on “Guest Checkout” radio button
     laptopsAndNotebooksTest.guestcheckoutmethod();
        //2.19 Click on “Continue” tab
        laptopsAndNotebooksTest.continuemethod1();

        //2.20 Fill the mandatory fields
        laptopsAndNotebooksTest.registerfieldmethod("paresh","patel","paresh@gmail.com","09876543212","8,maybanke avenue","london","3456");
      laptopsAndNotebooksTest.selectcountrybymethod();
      laptopsAndNotebooksTest.selectregionbymethod();
        //2.21 Click on “Continue” Button
        laptopsAndNotebooksTest.continuebutton2method();
        //2.22 Add Comments About your order into text area
        laptopsAndNotebooksTest.addcommentmethod("when i will get my order");
        //2.23 Check the Terms & Conditions check box
       laptopsAndNotebooksTest.termclickmethod();
        //2.24 Click on “Continue” button
       laptopsAndNotebooksTest.continueburron3method();

        //2.25 Verify the message “Warning: Payment method required!”

     // String expectedwaringtext=laptopsAndNotebooksTest.warningtextmethod();
      //  String actualwarningtext="Warning: Payment method required!";
       //  Assert.assertEquals(expectedwaringtext,actualwarningtext);


    }
}
