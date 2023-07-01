package com.tutorialsninja.testsuite;

import com.tutorialsninja.homepage.TopMenuPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuPageTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();

    @Test


    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // Mouse hover on “Desktops” Tab and click
        topMenuPage.Descktopclickmethod();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        //  selectmenu("Show AllDesktops");
        topMenuPage.showallmethod();
        // 1.3 Verify the text ‘Desktops’
        String actualtext = topMenuPage.descktoptextmethod();
        String expectedtext = "Desktops";
        Assert.assertEquals(expectedtext, actualtext);
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //Mouse hover on “Laptops & Notebooks” Tab and click
        topMenuPage.laptopclickmethod();
        // call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        // selectmenu("Show AllLaptops & Notebooks");
        topMenuPage.showall_lapmethod();
        //Verify the text ‘Laptops & Notebooks’

        String actualtext_lap = topMenuPage.laptoptextmethod();
        String expectedtext_lap = "Laptops & Notebooks";
        Assert.assertEquals(expectedtext_lap, actualtext_lap);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        // Mouse hover on “Components” Tab and click
        topMenuPage.componenetsclickmethod();
        //call selectMenu method and pass the menu = “Show All Components”
        // selectmenu("Show AllComponents");
        topMenuPage.showall_commethod();
        //Verify the text ‘Components’
        String actualtext_com = topMenuPage.componentstextmethod();
        String expectedtext_com = "Components";
        Assert.assertEquals(expectedtext_com, actualtext_com);


   /* mousehover(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a"));
    selectmenu("Show AllLaptops & Notebooks");
    WebElement desktops=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[2]/a"));
    desktops.click();
    String actualtext=driver.findElement(By.xpath("//div[@id='product-category']/div[1]/div[1]/h2")).getText();
    System.out.println(actualtext);
    String expectedtext="Laptops & Notebooks";
    Assert.assertEquals("verifying text", expectedtext,actualtext);
    System.out.println(actualtext);*/


    }
}