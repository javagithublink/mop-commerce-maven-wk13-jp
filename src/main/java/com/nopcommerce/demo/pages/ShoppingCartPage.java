package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By quantity = By.xpath("//input[@value='1']");
    By updateCart = By.xpath("//button[normalize-space()='Update shopping cart']");
    By totalPriceOnCart = By.xpath("//span[@class='value-summary']//strong[1]");
    By termsCheckBox = By.xpath("//div[@class='terms-of-service']//input[@type='checkbox']");
    By checkOut = By.xpath("//button[@value='checkout']");

    //static String expectedTotal = "$2,950.00";

    public void updateQuantityOnShoppingCart() throws InterruptedException {
        driver.findElement(quantity).clear();
        useSendTextToElement(quantity,"2");
        useClickOnElement(updateCart);
        Thread.sleep(1000);
        //seVerifyResult(expectedTotal,totalPriceOnCart,"Wrong Total");
    }

    public void verifyTotalCartAmount(String expectedTotalPrice){
        useVerifyResult(expectedTotalPrice,totalPriceOnCart,"Wrong Price");
    }

    public void selectTermsOfServiceCheckBox(){
        useClickOnElement(termsCheckBox);
    }

    public void clickOnCheckOutButton(){
        useClickOnElement(checkOut);
    }

}
