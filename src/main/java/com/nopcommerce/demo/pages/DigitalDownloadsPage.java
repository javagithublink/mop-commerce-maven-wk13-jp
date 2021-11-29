package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {

    By digitalDownloadsPageHeader = By.xpath("//h1[normalize-space()='Digital downloads']");


    public void verifyUserOnDigitalDownloadsPage(){
        String expectedResult = "Digital downloads";
        useVerifyResult(expectedResult,digitalDownloadsPageHeader,"Result doesn't match");
    }

}
