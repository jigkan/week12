package gov.uk.check.visa.Pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import gov.uk.check.visa.utility.Utility;

/**
 * Created by Bhavesh
 */
public class HomePage extends Utility {

    By jobTitlefield =By.cssSelector("input#keywords");
    public void enterJobTitle(String jobTitle){sendTextToElement(jobTitlefield, jobTitle); }
    By locationfield=By.xpath("//input[@placeholder='Location']");
    public void enterLocation(String location){sendTextToElement(locationfield,location); }

    By distanceDropDownfield =By.cssSelector("select#distance");
    public void selectDistance(String distance){sendTextToElement(distanceDropDownfield,distance);}
    By    moreSearchOptionsLinkfield=By.cssSelector("button#toggle-hp-search");
    public void clickOnMoreSearchOptionLink(){clickOnElement(moreSearchOptionsLinkfield);}

    By salaryMinfield =By.cssSelector("input#salarymin");
    public void enterMinSalary(String minSalary){sendTextToElement(salaryMinfield,minSalary);}
    By    salaryMaxfield =By.cssSelector("input#salarymax");
    public void enterMaxSalary(String maxSalary){sendTextToElement(salaryMaxfield,maxSalary);}
    By salaryTypeDropDownfield =By.cssSelector("select#salarytype");
    public void selectSalaryType(String sType){sendTextToElement(salaryTypeDropDownfield,sType);}
    By    jobTypeDropDownfield=By.cssSelector("select#tempperm");
    public void selectJobType(String jobType){sendTextToElement(jobTypeDropDownfield,jobType);}

    By findJobsBtnfield =By.cssSelector("input#hp-search-btn");
    public void clickOnFindJobsButton(){clickOnElement(findJobsBtnfield);}
            By  loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        Reporter.log("Click on Login Link" + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
    }


}
