package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By buildYourOwnComputerPage = By.xpath("//h1[normalize-space()='Build your own computer']");
    By processor = By.xpath("//select[@id='product_attribute_1']") ;
    By ram = By.xpath("//select[@id='product_attribute_2']");
    By hDD = By.xpath("//label[text()='400 GB [+$100.00]']");
    By oS = By.xpath("//label[text()='Vista Premium [+$60.00]']") ;
    By software = By.xpath("//label[text()='Total Commander [+$5.00]']") ;
    By totalPrice = By.xpath("//span[@id='price-value-1']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By addToCartMessage = By.xpath("//p[text()='The product has been added to your ']");
    By goToShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    static String expectedPriceTotal = "$1,475.00";



    public void verifyUserOnBuildYourOwnComputerPage(){
        String expected = "Build your own computer";
        useVerifyResult(expected,buildYourOwnComputerPage,"User can't select product correctly");
    }

    public void selectComputerSpecification() throws InterruptedException {
    useSelectByValueFromDropDown(processor,"1");
    Thread.sleep(1000);
    useSelectByValueFromDropDown(ram,"5");
    Thread.sleep(1000);
    useClickOnElement(hDD);
    Thread.sleep(1000);
    useClickOnElement(oS);
    Thread.sleep(1000);
    useClickOnElement(software);
    }

    public void verifyTotalPrice(){
    useVerifyResult(expectedPriceTotal,totalPrice,"Price is not correct");
    }

    public void clickOnAddToCart() throws InterruptedException {
    useClickOnElement(addToCart);
    String expected = "The product has been added to your shopping cart";
    Thread.sleep(1000);
    useVerifyResult(expected,addToCartMessage,"Wrong message");
    Thread.sleep(1000);
    useClickOnElement(goToShoppingCart);

    }

    public void selectOS(){

    }

    public void checkSoftwareOptions(){

    }
}
