package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computerPageHeader = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");


    public void verifyUserOnComputerPage(){
        String expectedResult = "Computers";
        useVerifyResult(expectedResult,computerPageHeader,"Result doesn't match");
    }


}
