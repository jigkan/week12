package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.Pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    StartPage startPage = new StartPage();
    SelectNationalityPage selectNationalityPage = new SelectNationalityPage();
    ResultPage resultPage = new ResultPage();
    ReasonForTravelPage reasonForTravelPage = new ReasonForTravelPage();
    DurationOfStayPage durationOfStayPage = new DurationOfStayPage();
    FamilyImmigrationStatusPage familyImmigrationStatusPage=new FamilyImmigrationStatusPage();

    @Test
    public void anAustralianCominToUKForTourism() {
        //Click on start button
        startPage.clickStartNow();
        //Select a Nationality 'Australia'
        selectNationalityPage.selectnationality("Australia");
        //Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //Select reason 'Tourism'
        selectNationalityPage.selectreasonturisam();
        ;
        //Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //verify result 'You will not need a visa to come to the UK'}

        String expectedverifttext = resultPage.getResultMessage();
        resultPage.confirmResultMessage("Check if you need a UK visa:");
        if (expectedverifttext.equalsIgnoreCase("Check if you need a UK visa:")) {

        }
    }

    @Test
    public void ChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        //Click on start button
        startPage.clickStartNow();
        //Select a Nationality 'Chile'
        selectNationalityPage.selectnationality("Chile");
        //Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit();
        //Click on Continue button
        selectNationalityPage.clickNextStepButton();
        // Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.longerthan6months();
        // Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //Select have planning to work for 'Health and care professional'
        reasonForTravelPage.heathandcareprofessional();
        //Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //verify result 'You need a visa to work in health and care'
        String expectedtext = reasonForTravelPage.Youneedavisatoworkinhealthandcare();
        String actualtext = "You need a visa to work in health and care";
        Assert.assertEquals(expectedtext, actualtext);

    }


    @Test
    public void ColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArti() {

        //Click on start button
        startPage.clickStartNow();
        //Select a Nationality 'Colombia'
        selectNationalityPage.selectnationality("Colombia");
        //Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //Select reason 'Join partner or family for a long stay'
        familyImmigrationStatusPage.Joinpartnerorfamilyforalongstay();
                //Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //Select state My partner of family member have uk immigration status 'yes'
        familyImmigrationStatusPage.yesmethod();
        //Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //verify result 'You’ll need a visa to join your family or partner in the UK'
       String expectedjointext= familyImmigrationStatusPage.YouwillneedavisatojoinyourfamilyorpartnerintheUK();
        String actualjointext= "You’ll need a visa to join your family or partner in the UK";
        Assert.assertEquals(expectedjointext,actualjointext);

    }
}