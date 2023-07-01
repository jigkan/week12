package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

public class SelectNationalityPage extends Utility {
  // 3.SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create
    //methods 'void selectNationality(String nationality)'
    //and 'void clickNextStepButton()'

    //Select a Nationality 'Australia'
    By select_nationality=By.cssSelector("select#response");
    public void selectnationality(String nationality){ }
    // Click on Continue button
    By ClickonContinuebutton = By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']");
    public void clickNextStepButton(){clickOnElement(ClickonContinuebutton);}
    By selectreasonTurisam= By.xpath("//input[@id='response-0']");
    public void selectreasonturisam(){clickOnElement(selectreasonTurisam);}
    //verify result 'You will not need a visa to come to the UK'}
    By youwillnotneedavisatocometotheuk=By.xpath("//span[@class='govuk-caption-xl gem-c-title__context']");
    public String youwillnotneedavisatocometheuk(){ return getTextFromElement(youwillnotneedavisatocometotheuk);}

}
