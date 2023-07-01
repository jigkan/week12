package com.tutorialsninja.homepage;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    // Mouse hover on “Desktops” Tab and click
    By Desktopclick = By.xpath("//ul[@class='nav navbar-nav']/li[1]/a");

    public void Descktopclickmethod() {
        mouseHoverToElementAndClick(Desktopclick);
    }

    //1.2 call selectMenu method and pass the menu = “Show All Desktops”
    //  selectmenu("Show AllDesktops");
    By showall = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul[1]/li[1]/div[1]/a");

    public void showallmethod() {
        clickOnElement(showall);
    }

    // 1.3 Verify the text ‘Desktops’
    By desktoptext = By.xpath("//*[@id=\"content\"]/h2");

    public String descktoptextmethod() {
        return getTextFromElement(desktoptext);
    }

    //Mouse hover on “Laptops & Notebooks” Tab and click
    By Laptopsclick = By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");

    public void laptopclickmethod() {
        mouseHoverToElementAndClick(Laptopsclick);
    }

    // call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    // selectmenu("Show AllLaptops & Notebooks");
    By showall_lap = By.xpath("//nav[@id='menu']/div[2]/ul[1]/li[2]/div[1]/a");

    public void showall_lapmethod() {
        clickOnElement(showall_lap);
    }

    //Verify the text ‘Laptops & Notebooks’
    By Laptoptext = By.xpath("//*[@id=\"content\"]/h2");

    public String laptoptextmethod() {
        return getTextFromElement(Laptoptext);
    }

    // Mouse hover on “Components” Tab and click
    By componentsclick = By.xpath("//ul[@class='nav navbar-nav']/li[3]/a");

    public void componenetsclickmethod() {
        mouseHoverToElementAndClick(componentsclick);
    }

    //call selectMenu method and pass the menu = “Show All Components”
    // selectmenu("Show AllComponents");
    By showall_com = By.xpath("//nav[@id='menu']/div[2]/ul[1]/li[3]/div[1]/a");

    public void showall_commethod() {
        clickOnElement(showall_com);
    }

    //Verify the text ‘Components’
    By componenetstext = By.xpath("//*[@id=\"content\"]/h2");

    public String componentstextmethod() {
        return getTextFromElement(componenetstext);
    }


}
