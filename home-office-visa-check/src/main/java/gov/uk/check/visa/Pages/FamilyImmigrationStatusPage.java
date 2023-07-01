package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

public class FamilyImmigrationStatusPage extends Utility {
    //6.FamilyImmigrationStatusPage - nextStepButton, yes, no locators and create methods 'void
    //selectImmigrationStatus(String status)'
    //(Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'


    //Select reason 'Join partner or family for a long stay'
    By joinpartner =By.xpath("//div[@class='govuk-radios']/div[5]/input[1]");
    public void Joinpartnerorfamilyforalongstay(){clickOnElement(joinpartner);}

    //select yes
    By yes=By.cssSelector("input#response-0");

    public void yesmethod(){clickOnElement(yes);}
    By jointext=By.xpath("//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']");


    public String YouwillneedavisatojoinyourfamilyorpartnerintheUK(){ return  getTextFromElement(jointext);}

    //public void selectImmigrationStatus(String status) {
    //        List<WebElement> option = driver.findElements(selectOption);
    //        String s = option.toString();
    //        switch (status) {
    //            case "Yes":
    //                s.equals(status);
    //                clickOnElement(yes);
    //                break;
    //
    //
    //            default:
    //                clickOnElement(no);
    //                break;
    //
    //
    //        }
    //
    //    }




}
