package uk.co.library.testsuite;

import uk.co.library.excelutility.ExcelUtility;
import uk.co.library.pages.ComputerPage;
import uk.co.library.pages.HomePage;
import uk.co.library.testbase.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestWithExcelData extends TestBase {
    public static final String FILE_PATH = System.getProperty("user.dir") + "/src/test/java/resources/testdata/ExcelData.xlsx";

    HomePage homePage = new HomePage();
    ComputerPage loginPage = new ComputerPage();

    @BeforeClass
    public void setExcel(){
        //Tell the code about the location of Excel file
        try {
            ExcelUtility.setExcelFile(FILE_PATH, "LoginTests");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DataProvider
    public Object[][] getData(){
        return ExcelUtility.getTestData("Invalid_Login");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(String username, String password) {

    }

}
