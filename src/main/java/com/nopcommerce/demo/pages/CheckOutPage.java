package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By firstName = By.xpath("//input[@data-val-required='First name is required.']");
    By lastName = By.xpath("//input[@data-val-required='Last name is required.']");
    By email = By.xpath("//input[@data-val-email='Wrong email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");

    By shippingMethod = By.xpath("//input[@id='shippingoption_1']");
    By confirmShippingMethod = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    By paymentMethod = By.xpath("//input[@id='paymentmethod_1']");
    By confirmPaymentMethod = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    By creditCardType = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By confirmPaymentInformation = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    By paymentMethodText = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethodText = By.xpath("//span[normalize-space()='Next Day Air']");
    By totalPrice = By.xpath("//span[@class='value-summary']//strong[1]");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");

    public void addBillingAddressForGuest(){
        useSendTextToElement(firstName, "JJJ");
        useSendTextToElement(lastName, "PPP");
        useSendTextToElement(email, "abc123@gmail.com");
        useSelectByVisibleTextFromDropDown(country, "Iceland");
        useSendTextToElement(city,"abcd");
        useSendTextToElement(address, "1 north ave");
        useSendTextToElement(postCode, "12345");
        useSendTextToElement(phoneNumber, "1234567891");
        useClickOnElement(continueButton);
    }

    public void addBillingAddressForRegisteredAccount(){
        useSelectByVisibleTextFromDropDown(country, "Iceland");
        useSendTextToElement(city,"abcd");
        useSendTextToElement(address, "1 north ave");
        useSendTextToElement(postCode, "12345");
        useSendTextToElement(phoneNumber, "1234567891");
        useClickOnElement(continueButton);
    }

    public void addShippingMethod(){
        useClickOnElement(shippingMethod);
        useClickOnElement(confirmShippingMethod);
    }

    public void addPaymentMethod(){
        useClickOnElement(paymentMethod);
        useClickOnElement(confirmPaymentMethod);
    }

    public void addPaymentInformation(){

        useSelectByVisibleTextFromDropDown(creditCardType, "Master card");
        useSendTextToElement(cardHolderName, "Abc Def");
        useSendTextToElement(cardNumber, "5512345678912345");
        useSelectByVisibleTextFromDropDown(expireYear, "2023");
        useSendTextToElement(cardCode, "123");
        useClickOnElement(confirmPaymentInformation);

    }

    public void verifyOrder(String expectedAmount) throws InterruptedException {
        Thread.sleep(2000);
        useVerifyResult("Credit Card",paymentMethodText, "Payment method doesn't match");
        Thread.sleep(2000);
        useVerifyResult("Next Day Air",shippingMethodText, "Shipping mode doesn't match");
        Thread.sleep(2000);
        useVerifyResult(expectedAmount,totalPrice, "Amount Error");
        Thread.sleep(2000);
        useClickOnElement(confirmButton);


    }

}
