package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationPage extends Utility {

    By registerPageText = By.xpath("//h1[normalize-space()='Register']");
    By gender = By.xpath("//input[@id='gender-male']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By dateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
    By dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By dateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By continueButton = By.xpath("//a[normalize-space()='Continue']");


    public void verifyUserIsOnRegistrationPage() {
        useVerifyResult("Register", By.xpath("//h1[normalize-space()='Register']"), "user is not on registration page");
    }

    public void createYourAccount() {
        useClickOnElement(gender);
        useSendTextToElement(firstName, "abcd");
        useSendTextToElement(lastName, "abcd");
        useSendTextToElement(dateOfBirthDay, "12");
        useSendTextToElement(dateOfBirthMonth, "August");
        useSendTextToElement(dateOfBirthYear, "1972");
        useSendTextToElement(email, useGetUniqueEmailAddress());
        useSendTextToElement(password, "123456");
        useSendTextToElement(confirmPassword, "123456");
        useClickOnElement(registerButton);

    }

    public void clickOnContinueButton(){
        useClickOnElement(continueButton);
    }

}
