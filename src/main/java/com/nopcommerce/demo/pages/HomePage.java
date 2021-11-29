package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utility {

    By topMenuList = By.xpath("//ul[@class='top-menu notmobile']//li");
    By computerTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktopSubTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhonesSubTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    public void selectMenu(String menu) throws InterruptedException {

        // clickOnElement(menu);

        List<WebElement> names = driver.findElements(topMenuList);

        for (WebElement name : names) {
            //Thread.sleep(2000);
            if (name.getText().equalsIgnoreCase(menu)) {
                Thread.sleep(2000);
                name.click();
                break;
            }
        }

    }

    public void clickOnComputerTab() throws InterruptedException{
        selectMenu("Computer");
    }

    public void clickOnElectronicsTab() throws InterruptedException{
        selectMenu("Electronics");
    }

    public void clickOnApparelTab() throws InterruptedException{
        selectMenu("Apparel");
    }

    public void clickOnBooksTab() throws InterruptedException{
        selectMenu("Books");
    }

    public void clickOnJewelryTab() throws InterruptedException{
        selectMenu("Jewelry");
    }

    public void clickOnGiftCardsTab() throws InterruptedException{
        selectMenu("Gift Cards");
    }

    public void clickOnDigitalDownloadsTab() throws InterruptedException{
        selectMenu("Digital downloads");
    }

    public void clickOnDesktopSubTab() throws InterruptedException {
        useMouseHoverAction(computerTab);
        useMouseHoverAndClickAction(desktopSubTab);
    }

    public void clickOnCellPhonesSubTab() throws InterruptedException {
        useMouseHoverAction(electronicsTab);
        useMouseHoverAndClickAction(cellPhonesSubTab);
    }

    public void verifyUserIsOnHomePage() throws InterruptedException{
        Assert.assertEquals(driver.getCurrentUrl(),baseUrl);
    }

}
