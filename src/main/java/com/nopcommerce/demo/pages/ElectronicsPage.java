package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronicsPageHeader = By.xpath("//h1[normalize-space()='Electronics']");


    public void verifyUserOnElectronicsPage(){
        String expectedResult = "Electronics";
        useVerifyResult(expectedResult,electronicsPageHeader,"Result doesn't match");
    }

}
