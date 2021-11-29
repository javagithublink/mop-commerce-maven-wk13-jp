package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class OrderSuccessPage extends Utility {

    By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    By orderSuccessMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueToHomepageButton = By.xpath("//button[normalize-space()='Continue']");


    public void verifyOrderPlacedSuccessfully(){

        useVerifyResult("Thank you",thankYouMessage, "Message doesn't match");


        useVerifyResult("Your order has been successfully processed!", orderSuccessMessage,"Order processing error");


        useClickOnElement(continueToHomepageButton);

    }


}
