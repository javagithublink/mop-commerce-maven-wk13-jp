package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {

    By cellPhonesText = By.xpath("//h1[normalize-space()='Cell phones']");
    By productListView = By.xpath("//a[normalize-space()='List']");
    By productName = By.xpath("//a[normalize-space()='Nokia Lumia 1020']");

    public void verifyUserOnCellPhonesPage(){
        useVerifyResult("Cell phones",cellPhonesText,"user is not on correct page");
    }

    public void clickOnListViewTab(){
        useClickOnElement(productListView);
    }

    public void clickOnProductName(){
        useClickOnElement(productName);

    }

}
