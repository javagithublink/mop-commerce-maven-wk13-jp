package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {

    By BooksPageHeader = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");


    public void verifyUserOnBooksPage(){
        String expectedResult = "Books";
        useVerifyResult(expectedResult,BooksPageHeader,"Result doesn't match");
    }

}
