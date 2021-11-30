package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {

    By buildYourOwnComputer = By.xpath("//div[@class='picture']//img[@title='Show details for Build your own computer']");
    By productList = By.xpath("//select[@id='products-orderby']");
    By sortByDropDown = By.xpath("//select[@id='products-orderby']");
    By sortByZtoAText = By.xpath("//select[@id='products-orderby']");

    public void clickOnBuildYourOwnComputer() {
        useMouseHoverAndClickAction(buildYourOwnComputer);
    }

    public void clickOnSortByZtoAAndVerifyBestSellers() throws InterruptedException {
        List<WebElement> originalList = driver.findElements(productList);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        //Collections.sort(originalProductNameList,Collections.reverseOrder());
        originalProductNameList.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        //useMouseHoverAction(sortByDropDown);
        //useMouseHoverAndClickAction(sortByZtoAText);
        useSelectByValueFromDropDown(sortByZtoAText, "6");
        Thread.sleep(3000);

        List<WebElement> afterSortingList = driver.findElements(productList);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingList) {
            afterSortingProductName.add(product1.getText());
        }
        Assert.assertEquals(originalProductNameList, afterSortingProductName, "products are now sorted");

    }


}

