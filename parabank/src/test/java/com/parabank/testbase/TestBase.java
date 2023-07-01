package com.parabank.testbase;

import com.parabank.propertyreader.PropertyReader;
import com.parabank.utility.Utility;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Bhavesh
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    //@Parameters("browser")
    public void setUp(){
        selectBrowser(browser);
    }

    //@AfterMethod
   // public void tearDown(){
        //closeBrowser();
   // }

}
