package gov.uk.check.visa.Pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import gov.uk.check.visa.utility.Utility;

/**
 * Created by Bhavesh
 */
public class ComputerPage extends Utility {
    //2.1 Click on Computer Menu.
    By computerbutton=By.linkText("Computers");
    public void clickoncomputerButton() {
        clickOnElement(computerbutton);
    }
    //  2.2 Click on Desktop
    By  Desltopbutton=By.linkText("Desktops");
    public void clickondesktops(){clickOnElement(Desltopbutton);}
    //2.3 Select Sort By position "Name: A to Z"
    By productorderbybuttton=By.id("products-orderby");
    public void clickonproductorderbybuttton(){ clickOnElement(productorderbybuttton);}
     By  select_ZtoA=By.cssSelector("select#products-orderby>option:nth-of-type(3)");
     public void selectZtoA(){clickOnElement(select_ZtoA);}
    //  1.4 Verify the Product will arrange in Descending order.
    By discendingorder=By.xpath("//select[@id='products-orderby']/option[3]");

    public String discendingtext() {
        return getTextFromElement(discendingorder);
    }
    //2.3 Select Sort By position "Name: A to Z"
    By  select_AtoZ=By.cssSelector("select#products-orderby>option:nth-of-type(2)");
    public void selectAtoZ(){clickOnElement(select_AtoZ);
        }
    //2.4 Click on "Add To Cart" of build your own computer
    By addtocartbutton=By.xpath("//div[@class='item-grid']/div[1]//button[@class='button-2 product-box-add-to-cart-button']");

    public void addtoCart() throws InterruptedException {

        Thread.sleep(2000);
        clickOnElement(addtocartbutton);
    }
    // 2.5 Verify the Text "Build your own computer"
    By builttext=By.xpath("//div[@class='center-1']/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/h1");
    public String builtextmethod(){ return getTextFromElement(builttext);}
    // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By processer= By.id("product_attribute_1");
    public void processermethod() { clickOnElement(processer);}
    By selectprocesser=By.xpath("//dd[@id='product_attribute_input_1']/select[1]/option[2]");
    public void selectprocessermethod(){clickOnElement(selectprocesser);}
    //2.7.Select "8GB [+$60.00]" using Select class.
    By RAM=By.id("product_attribute_2");
    public void RAMmethod(){ clickOnElement(RAM);}
    By selectRAM=By.xpath("//dd[@id='product_attribute_input_2']/select[1]/option[4]");
    public void selectRAMmethod(){clickOnElement(selectRAM);}
    // 2.8 Select HDD radio "400 GB [+$100.00]"
    By HDD=By.id("product_attribute_3_7");
    public void HDDmethod(){clickOnElement(HDD);}

    //            2.9 Select OS radio "Vista Premium [+$60.00]"
    By osradio=By.id("product_attribute_4_9");
    public void osradiomethod(){ clickOnElement(osradio);}
    //    A 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    By chechbox2=By.id("product_attribute_5_12");
    public void checkbox2method(){clickOnElement(chechbox2);}

    //            2.11 Verify the price "$1,475.00"
    By price=By.xpath("//div[@class='product-price']/span[1]");
    public String pricemethod(){ return getTextFromElement(price); }

    //            2.12 Click on "ADD TO CARD" Button.
    By addto_cart=By.id("add-to-cart-button-1");
    public void addto_cartmethod(){clickOnElement(addto_cart);}

    //2.13 Verify the Message "The product has been added to your shopping cart" on Top  green Bar
    By addto_carttext=By.xpath("//div[@id='bar-notification']/div[1]/p[1]");
    public String adddto_carttextmethod(){return getTextFromElement(addto_carttext);}
    By closebar=By.xpath("//div[@id='bar-notification']/div[1]/span[1]");
    public void closebarmethod(){clickOnElement(closebar);}
    //            2.14 Then MouseHover on "Shopping cart" and Click on //////////"GO TO CART" button.
    By mouseHovershoppingcart=By.xpath("//div[@class='header-upper']/div[2]/div[1]/ul[1]/li[4]/a[1]");
    public void mousehovershoppingcartmethod(){mouseHoverToElementAndClick(mouseHovershoppingcart);}
    By clickoncart=By.cssSelector("div.mini-shopping-cart>div:nth-of-type(4)>button");
    public void clickoncartmethod() { clickOnElement(clickoncart);}
    //2.15 Verify the message "Shopping cart"
    By shoppingcartmsg=By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[1]/h1");
 public String shoppingcarmsgmethod(){ return getTextFromElement(shoppingcartmsg);}
    //2.16 Change the Qty to "2" and Click on "Update shopping cart"
    By qty=By.className("qty-input");
    public void qtymethod(){clearTextFromField(qty);}

    public void qtyreplacemetod(String number) {
        sendTextToElement(qty,number);    }

    By updatebutton=By.id("updatecart");
    public void updatebuttonmethod(){clickOnElement(updatebutton); }
    // 2.17 Verify the Total"$2,950.00"
    By total=By.xpath("//div[@class='center-1']/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody/tr[1]/td[6]/span[1]");
    public String totalmethod(){ return getTextFromElement(total);}
    //  2.18 click on checkbox “I agree with the terms of service”
    By termcheckbox=By.id("termsofservice");
    public void termcheckboxmethod(){ clickOnElement(termcheckbox);}
    // 2.19 Click on “CHECKOUT”
    By chechoutbutton=By.id("checkout");
    public void chechoutbutton(){clickOnElement(chechoutbutton);}
    //            2.20 Verify the Text “Welcome, Please Sign In!”
    By welcometext2=By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[1]/h1");
    public String welcometextmethod(){return getTextFromElement(welcometext2); }
//            2.21Click on “CHECKOUT AS GUEST” Tab

    By checkoutguest=By.xpath("//div[@class='master-wrapper-page']/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]");
    public void chechoutguestmethod(){clickOnElement(checkoutguest);}

    //        //2.22 Fill the all mandatory field
    By firstnamefield=By.id("BillingNewAddress_FirstName");
    By lastnamefield=By.id("BillingNewAddress_LastName");
    By emailfield1=By.id("BillingNewAddress_Email");
    By billaddcomany=By.id("BillingNewAddress_Company");
    By billaddcountry=By.id("BillingNewAddress_CountryId");
    By billaddcity=By.id("BillingNewAddress_City");
    By billadd1=By.id("BillingNewAddress_Address1");
    By billaddzip=By.id("BillingNewAddress_ZipPostalCode");
    By billaddphone=By.id("BillingNewAddress_PhoneNumber");
    public void registerentery(String firstname,String lastname,String email,String company,String country,String city,String add1,String zip, String phone){
        sendTextToElement(firstnamefield,firstname);
        sendTextToElement(lastnamefield,lastname);
        sendTextToElement(emailfield1,email);
        sendTextToElement(billaddcomany,company);
        sendTextToElement(billaddcountry,country);
        sendTextToElement(billaddcity,city);
        sendTextToElement(billadd1,add1);
        sendTextToElement(billaddzip,zip);
        sendTextToElement(billaddphone,phone);
    }
    //2.23 Click on “CONTINUE”
    By cotinuebutton1=By.id("billing-buttons-container");
    public void cotinuebutton1method(){ clickOnElement(cotinuebutton1);}
    //2.24 Click on Radio Button “Next Day Air($0.00)”
    By shippingoption_1=By.id("shippingoption_1");
    public void shippingoption_1method(){clickOnElement(shippingoption_1); }
    //            2.25 Click on “CONTINUE”
    By shipping_method=By.id("shipping-method-buttons-container");
    public void shipping_method1(){clickOnElement(shipping_method);}
    //            2.26 Select Radio Button “Credit Card”
    By radiobutton=By.id("paymentmethod_1");
    public void radiobuttonmethod(){ clickOnElement(radiobutton);}
    By paymethodbutton=By.id("payment-method-buttons-container");
    public void paymethodbuttonmethod() {clickOnElement(paymethodbutton);}

    //            2.27 Select “Master card” From Select credit card dropdown
    //        selectmastercard.click();
    By selectmastercard= By.id("CreditCardType");
    public void selectmastercardmethod(){clickOnElement(selectmastercard);}
    //        Select selectcard=new Select(selectmastercard);
    //        selectcard.selectByVisibleText("Master card");

    By mastercard=By.xpath("//select[@id='CreditCardType']/option[2]");
    public void mastercard(){ clickOnElement(mastercard);}

    //2.28 Fill all card the details
    By cardhodername=By.id("CardholderName");
    By carnumber=By.id("CardNumber");
    By expiremonth=By.id("ExpireMonth");
    By expireyear=By.id("ExpireYear");
    By cardcode=By.id("CardCode");
    public void carddetailmethod(String nane, String number, String month,String year, String code){
        sendTextToElement(cardhodername, nane);
        sendTextToElement(carnumber,number);
        sendTextToElement(expiremonth, month);
        sendTextToElement(expireyear,year);
        sendTextToElement(cardcode,code);}
//2.29 Click on “CONTINUE”
        By paymentcontinuebutton=By.xpath("//div[@id='payment-info-buttons-container']/button[1]");
        public void paymentcontinuebuttonmethod(){clickOnElement(paymentcontinuebutton);}
    //            2.30 Verify “Payment Method” is “Credit Card”
    By paymenttext=By.xpath("//div[@id='checkout-step-confirm-order']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[2]");
    public String paymenttextmethod(){return getTextFromElement(paymenttext);}
    //            2.32 Verify “Shipping Method” is “Next Day Air”
    By shippingtext=By.xpath("//div[@class='cart-footer']/div/div[1]/table/tbody/tr[2]/td/span[1]");
    public String shippingtextmethod(){return getTextFromElement(shippingtext);}
    //        //            2.33 Verify Total is “$2,950.00”
    By totaltexting=By.xpath("//div[@class='cart-footer']/div/div[1]/table/tbody/tr[4]/td[2]/span[1]");
    public String totaltextingmethod(){return getTextFromElement(totaltexting);}
    //        //            2.34 Click on “CONFIRM”
    By confirm=By.xpath("//div[@id='confirm-order-buttons-container']/button");
    public void confirmmethod(){ clickOnElement(confirm);}

    //        //            2.35 Verify the Text “Thank You”
    By thanktext=By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[1]/div[1]/div[1]/h1");
    public String thanktextmethod(){return getTextFromElement(thanktext);}
    //        //            2.36 Verify the message “Your order has been successfully processed!”
    By successtext=By.xpath("//div[@class='center-1']/div[1]/div[2]/div[1]/div[1]");
    public String successtextmethod(){return getTextFromElement(successtext);}
    //        //            2.37 Click on “CONTINUE”
    By continuefinal=By.xpath("//div[@class='center-1']/div[1]/div[2]/div[1]/div[3]/button");
    public void continuefinalmethod(){ clickOnElement(continuefinal);}

    //        //            2.37 Verify the text “Welcome to our store”
    By welcomestoretext=By.xpath("//div[@class='topic-block-title']/h2");
    public String welcomestoretextmethod(){return getTextFromElement(welcomestoretext);}




    By welcomeText = By.xpath("//div[@id='rightPanel']/div[1]/div[1]/h1");
    By emailfield = By.xpath("//div[@id='loginPanel']/form[1]/div[1]/input");
    By passwordField = By.xpath("//div[@id='loginPanel']/form[1]/div[2]/input");
    By loginButton = By.xpath("//div[@id='loginPanel']/form[1]/div[3]/input");
    By errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");
    By logoutButton=By.xpath("//div[@id='leftPanel']/ul[1]/li[8]/a");

    By logouttext=By.xpath("//div[@id='leftPanel']/h2");

    public String getWelcomeText() {

        Reporter.log("get welcome text" +welcomeText.toString());return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        Reporter.log("Enter email ID" +email.toString());
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
        return getTextFromElement(logouttext);
    }
    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();

    }






}















