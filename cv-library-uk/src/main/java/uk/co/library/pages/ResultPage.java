package uk.co.library.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    By resultText=By.xpath("//h1[@class='search-header__title']");
    public void verifyTheResults(String expected){

        String actualMsg = driver.findElement(resultText).getText();
        Assert.assertEquals(actualMsg,expected); }


}

