package uk.co.library.testsuite;

import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {

    HomePage homePage = new HomePage();
    ResultPage resultPage=new ResultPage();
    @Test(dataProvider = "Resultdata", dataProviderClass = Dataset.class)
   public void verifyJobSearchResultUsingDifferentDataSet (String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,String result)throws InterruptedException{
        homePage.iframeHandle();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        resultPage.verifyTheResults(result);
    }
}
