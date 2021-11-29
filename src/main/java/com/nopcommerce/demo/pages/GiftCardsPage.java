package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {

    By GifCardsPageHeader = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");


    public void verifyUserOnGiftCardsPage(){
        String expectedResult = "Gift Cards";
        useVerifyResult(expectedResult,GifCardsPageHeader,"Result doesn't match");
    }

}
