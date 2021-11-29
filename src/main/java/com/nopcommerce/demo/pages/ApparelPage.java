package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {

    By ApparelPageHeader = By.xpath("//h1[normalize-space()='Apparel']");


    public void verifyUserOnApparelPage(){
        String expectedResult = "Apparel";
        useVerifyResult(expectedResult,ApparelPageHeader,"Result doesn't match");
    }

}
