package com.tutorialsninja.testsuite;

import com.tutorialsninja.desktops.Descktopspage;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPageTest extends TestBase {
    Descktopspage desktopsTest = new Descktopspage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //Mouse hover on Desktops Tab.and click
        desktopsTest.Descktopclickmethod();

        //Click on “Show All Desktops”
        desktopsTest.showallmethod();

        //Select Sort By position "Name: Z to A"
        desktopsTest.sortbymethod1();
        // WebElement sortby = driver.findElement(By.xpath("//div[@id='content']/div[3]/div[3]/div[1]/select[1]"));
        // sortby.click();
        //  WebElement dorpdown=driver.findElement(By.xpath("div[@id='content']/div[3]/div[3]/div[1]/select[1]/option[3]"));
        //  dorpdown.click();
        ///// Verify the Product will arrange in Descending order.
        List<WebElement> beforeSortFilter = driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
        List<String> beforeSortFilters = new ArrayList<>();
        for (WebElement s : beforeSortFilter) {
            System.out.print(s.getText());
        }

        WebElement sort = driver.findElement(By.xpath("//select[@id='input-sort']"));
        sort.click();

        Select t = new Select(sort);
        t.selectByVisibleText("Name (Z - A)");
        List<WebElement> afterSortFilter = driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
        List<String> afterSortFilters = new ArrayList<>();
        for (WebElement as : afterSortFilter) {
            System.out.print(as.getText());
        }

        Collections.sort(beforeSortFilters);
        //Assert.assertNotEquals(beforeSortFilters, afterSortFilters);

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //Mouse hover on Desktops Tab.and click
        desktopsTest.Descktopclickmethod();

        //Click on “Show All Desktops”
        desktopsTest.showallmethod();

        //2.3 Select Sort By position "Name: A to Z"
        desktopsTest.sortbymethod();
        //2.4 Select product “HP LP3065”
        desktopsTest.selectHPLP3065();
        //Verify the Text "HP LP3065"
        String LPexpecctedtext = desktopsTest.Lp3065textmethod();
        String LPactualtext = "HP LP3065";
        Assert.assertEquals(LPexpecctedtext,LPactualtext);
        //2.6 Select Delivery Date "2022-11-30"
        desktopsTest.dateclearmethod();
        desktopsTest.datemethod1("2023-11-22");

        //2.7.Enter Qty "1” using Select class.
        desktopsTest.qntclearmethod();
        desktopsTest.qntmethod1("1");
        //verify msg add to cart
        // String actualtext1=driver.findElement(By.xpath("//div[@id='product-product']/div[1]/a")).getText();
        // System.out.println(actualtext1); verify not done
        // click on add chart
        desktopsTest.cliclonchrtmethod();
        //2.8 Click on “Add to Cart” button on success msg
        desktopsTest.shopingchartclickmethod();

        /// // 2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”


        //2.12 Verify the Product name "HP LP3065"
        String expectedprodcuttext =desktopsTest.HPLPtextmethod();
        String actualprodcuttext = "HP LP3065";
        Assert.assertEquals(expectedprodcuttext,actualprodcuttext);
        //2.13 Verify the Delivery Date "2022-11-30"
        String expecteddate =desktopsTest.datetestmethod();
         String actualdate = "Delivery Date:2023-11-22";
        Assert.assertEquals(expecteddate,actualdate);
        //2.14 Verify the Model "Product21"
        String expectedmodel =desktopsTest.modelmethod();
        String actualmodel = "Product 21";
        Assert.assertEquals(expectedmodel,actualmodel);
        //2.15 Verify the Todat "£74.73"
        String expectedtotal = desktopsTest.totalmethod();
         String actualtotal = "$122.00";
        Assert.assertEquals(expectedtotal,actualtotal);

    }
}