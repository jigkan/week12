package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

public class ReasonForTravelPage extends Utility {
    //5.ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods
    //'void selectReasonForVisit(String reason)'
    //and 'void clickNextStepButton()'

    By resonforvisit=By.cssSelector("input#response-1");
    public void selectReasonForVisit(){ clickOnElement(resonforvisit);}
    //Select have planning to work for 'Health and care professional'


    By heathandcareprofessional= By.xpath("//input[@id='response-0']");
    public void heathandcareprofessional(){clickOnElement(heathandcareprofessional);}
   By verifytext=By.xpath("//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']");
    public String Youneedavisatoworkinhealthandcare(){ return getTextFromElement(verifytext);}
}
