package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {

    By nokiaLumiaText = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By price = By.xpath("//span[@id='price-value-20']");
    By quantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-20']");
    By addToCartMessage = By.xpath("//p[text()='The product has been added to your ']");
    By goToShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    public void verifyUseIsOnNokiaLumiaPage(){
        useVerifyResult("Nokia Lumia 1020",nokiaLumiaText,"wrong product");
        }

        public void verifyTotalPrice(String expectedPrice){
        useVerifyResult(expectedPrice,price,"wrong price");
        }

        public void changeQuantity(){
        driver.findElement(quantity).clear();
        useSendTextToElement(quantity,"2");
        }

        public void clickOnAddToCart() throws InterruptedException {
        useClickOnElement(addToCartButton);
            String expected = "The product has been added to your shopping cart";
            Thread.sleep(1000);
            useVerifyResult(expected,addToCartMessage,"Wrong message");
            Thread.sleep(1000);
            useClickOnElement(goToShoppingCart);
        }

}
