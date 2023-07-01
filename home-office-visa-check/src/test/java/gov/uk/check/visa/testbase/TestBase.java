package gov.uk.check.visa.testbase;

import org.testng.annotations.BeforeMethod;
import gov.uk.check.visa.propertyreader.PropertyReader;
import gov.uk.check.visa.utility.Utility;

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

  //  @AfterMethod
   // public void tearDown(){
      //  closeBrowser();
    //}

}
