package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

public class ResultPage extends Utility {
    //4.ResultPage - resultMessage locator and create methods 'String getResultMessage()' and
    //'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)

    By youwillnotneedavisatocometotheuk=By.xpath("//span[@class='govuk-caption-l']");
    public String getResultMessage(){ return getTextFromElement(youwillnotneedavisatocometotheuk);}
    public void confirmResultMessage(String expectedMessage){}

}
