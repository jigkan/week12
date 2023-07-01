package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {
   ComputerPage computerPage=new ComputerPage();
   @Test
    public void name(){
       //1.1 Click on Computer Menu.
       computerPage.clickoncomputerButton();
       // 1.2 Click on Desktop
       computerPage.clickondesktops();
       //1.3 Select Sort By position "Name: Z to A"
       computerPage.clickonproductorderbybuttton();
       computerPage.selectZtoA();
       //  1.4 Verify the Product will arrange in Descending order.
       String actualsorttext=computerPage.discendingtext();
       String expectedsorttext="Name: Z to A";
       Assert.assertEquals(expectedsorttext,actualsorttext);
   }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
//2.1 Click on Computer Menu.
        computerPage.clickoncomputerButton();
        //  2.2 Click on Desktop
        clickOnElement(By.linkText("Desktops"));
        //2.3 Select Sort By position "Name: A to Z"
        computerPage.clickonproductorderbybuttton();
        computerPage.selectAtoZ();
        //2.4 Click on "Add To Cart" of build your own computer
        computerPage.addtoCart();
        // 2.5 Verify the Text "Build your own computer"
        String actualbuiltttext=computerPage.builtextmethod();
        String expectedbuilttext="Build your own computer";
        Assert.assertEquals(expectedbuilttext,actualbuiltttext);
       // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
               computerPage.processermethod();
               computerPage.selectprocessermethod();
        //2.7.Select "8GB [+$60.00]" using Select class.

        computerPage.RAMmethod();
               computerPage.selectRAMmethod();
       // 2.8 Select HDD radio "400 GB [+$100.00]"
       computerPage.HDDmethod();

         //            2.9 Select OS radio "Vista Premium [+$60.00]"
      computerPage.osradiomethod();
         //    A 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
             computerPage.checkbox2method();
         //            2.11 Verify the price "$1,475.00"
        String actualpricettext=computerPage.pricemethod();
        String expectedpricetext="$1,475.00";
        //Assert.assertEquals(expectedpricetext,actualpricettext);
         //            2.12 Click on "ADD TO CARD" Button.
          computerPage.addto_cartmethod();
          //2.13 Verify the Message "The product has been added to your shopping cart" on Top  green Bar
        String actualaddedtext=computerPage.adddto_carttextmethod();
        String expectedaddedtext="The product has been added to your shopping cart";
        Assert.assertEquals(expectedaddedtext,actualaddedtext);
       //    After that close the bar clicking on the cross button.
       computerPage.closebarmethod();
       //            2.14 Then MouseHover on "Shopping cart" and Click on //////////"GO TO CART" button.
       computerPage.mousehovershoppingcartmethod();
       computerPage.clickoncartmethod();
       //2.15 Verify the message "Shopping cart"
        String actualshoppingcartmsg=computerPage.shoppingcarmsgmethod();
        String expectedshoppingcartmsg="Shopping cart";
       Assert.assertEquals(expectedshoppingcartmsg,actualshoppingcartmsg);
        //            2.16 Change the Qty to "2" and Click on "Update shopping cart"
        computerPage.qtymethod();
        computerPage.qtyreplacemetod("2");
        computerPage.updatebuttonmethod();
        // 2.17 Verify the Total"$2,950.00"

        String actualtotal=computerPage.totalmethod();
        String expectedtotl="$2,950.00";
        Assert.assertEquals(expectedtotl,actualtotal);
        //  2.18 click on checkbox “I agree with the terms of service”
        computerPage.termcheckboxmethod();
         // 2.19 Click on “CHECKOUT”
       computerPage.chechoutbutton();
        //            2.20 Verify the Text “Welcome, Please Sign In!”

              String expectedweltext1=computerPage.welcometextmethod();
              String actuallweltext1="Welcome, Please Sign In!";
              Assert.assertEquals(expectedweltext1,actuallweltext1);
              //            2.21Click on “CHECKOUT AS GUEST” Tab
        computerPage.chechoutguestmethod();
        //        //2.22 Fill the all mandatory field
               computerPage.registerentery("juhil","pater","julil@gmail.com","teso","uk","london","20,frantbank","123454", "3454323323");
        //2.23 Click on “CONTINUE”
           computerPage.cotinuebutton1method();
        //            2.24 Click on Radio Button “Next Day Air($0.00)”
        computerPage.shippingoption_1method();
        //            2.25 Click on “CONTINUE”
      computerPage.shipping_method1();
        //            2.26 Select Radio Button “Credit Card”
       computerPage.radiobuttonmethod();
       computerPage.paymethodbuttonmethod();
       //            2.27 Select “Master card” From Select credit card dropdown
        //        selectmastercard.click();
      computerPage.selectmastercardmethod();

        //        Select selectcard=new Select(selectmastercard);
        //        selectcard.selectByVisibleText("Master card");
         computerPage.mastercard();
        //2.28 Fill all the details
        computerPage.carddetailmethod("juhil pate","2345678998766789", "12","2023","1234");
        //2.29 Click on “CONTINUE”
        computerPage.paymentcontinuebuttonmethod();
        //            2.30 Verify “Payment Method” is “Credit Card”
        String expectedpaymentmethodtext=computerPage.paymenttextmethod();
                String actualpayentmethodtext="\n" +
                        "                                Credit Card\n" +
                      "                            ";
        // Assert.assertEquals(expectedpaymentmethodtext,actualpayentmethodtext);
         //            2.32 Verify “Shipping Method” is “Next Day Air”
                       String expectedshippingtext=computerPage.shippingtextmethod();
                    String actualshippingtext="(Next Day Air)";
               Assert.assertEquals(expectedshippingtext,actualshippingtext);
        //            2.33 Verify Total is “$2,950.00”
                        String totaltext3=computerPage.totaltextingmethod();
                        String actualtotaltext3="$2,850.00";
              // Assert.assertEquals(totaltext3,actualtotaltext3);
        //        //            2.34 Click on “CONFIRM”
        computerPage.confirmmethod();
        //        //            2.35 Verify the Text “Thank You”
               String expectedthankyoutext=computerPage.thanktextmethod();
                   String actualthankyoutext="Thank you";
        //Assert.assertEquals(expectedthankyoutext,actualthankyoutext);
        //        //            2.36 Verify the message “Your order has been successfully processed!”
               String expectedsucctext=computerPage.successtextmethod();
                 String actualsucctext="Your order has been successfully processed!";
        Assert.assertEquals(expectedsucctext,actualsucctext);
        //        //            2.37 Click on “CONTINUE”
       computerPage.continuefinalmethod();
        //        //            2.37 Verify the text “Welcome to our store”

          String expectedstoretext=computerPage.welcomestoretextmethod();

             String actualstoretext="Welcome to our store";
        Assert.assertEquals(expectedstoretext,actualstoretext);
    }

}
