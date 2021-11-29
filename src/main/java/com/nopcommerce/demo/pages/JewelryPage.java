package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {

    By JewelryPageHeader = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");


    public void verifyUserOnJewelryPage(){
        String expectedResult = "Jewelry";
        useVerifyResult(expectedResult,JewelryPageHeader,"Result doesn't match");
    }


}
