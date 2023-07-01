package gov.uk.check.visa.testsuite;

import org.testng.annotations.Test;
import gov.uk.check.visa.Pages.HomePage;
import gov.uk.check.visa.Pages.ResultPage;
import gov.uk.check.visa.testbase.TestBase;

public class JobSearchTest extends TestBase {

    HomePage homePage = new HomePage();
    ResultPage resultPage=new ResultPage();
    @Test
   public void verifyJobSearchResultUsingDifferentDataSet (String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result)throws InterruptedException{
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
       // resultPage.verifyTheResults(result);
    }
}
