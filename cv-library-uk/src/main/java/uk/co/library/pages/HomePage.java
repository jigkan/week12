package uk.co.library.pages;

import uk.co.library.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

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
    By moreSearchOptionsLinkfield= By.cssSelector("div.hp-search-more>#toggle-hp-search");
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

    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }


            By  loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        Reporter.log("Click on Login Link" + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
    }


}
