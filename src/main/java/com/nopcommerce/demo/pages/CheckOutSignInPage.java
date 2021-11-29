package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutSignInPage extends Utility {

    By checkOutSignIn = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkOutAsGuest = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By register = By.xpath("//button[normalize-space()='Register']");

    public void verifyUserIsOnCheckOutSignInPage(){
        String expected = "Welcome, Please Sign In!";
        useVerifyResult(expected,checkOutSignIn,"user is not on sign in page");
    }

    public void clickOnCheckOutAsGuest(){

        useClickOnElement(checkOutAsGuest);
    }

    public void clickOnRegisterButton(){
        useClickOnElement(register);
    }

}
