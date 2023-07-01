package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

public class DurationOfStayPage extends Utility {
    //7.DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators
    //and create methods
    //'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select
    //moreOrLess stay) and
    //'void clickNextStepButton()'
    By longerthan6months=By.xpath("//label[@for='response-1']");
    public void longerthan6months(){ clickOnElement(longerthan6months);}
}

