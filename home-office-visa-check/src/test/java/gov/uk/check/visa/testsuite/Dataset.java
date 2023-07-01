package gov.uk.check.visa.testsuite;

import org.testng.annotations.DataProvider;

public class Dataset {
    @DataProvider(name = "Resultdata")
    public Object[][] getdata() throws InterruptedException{
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","500000","Per annum"," Permanent"},
                {"Tester","Wembley","up to  1 miles","40000","500000","Per annum"," Permanent"},
                {"Tester","Southharrow","up to 2 miles","45000","500000","Per annum"," Permanent"},
                {"Tester","Northolt","up to 5 miles","20000","500000","Per annum"," Permanent"},
                {"Tester","Wembely","up to 10 miles","10000","500000","Per annum"," Permanent"},
                {"Tester","Wembely","up to 15 miles","25000","500000","Per annum"," Permanent"},

        };
        return data;
    }
}