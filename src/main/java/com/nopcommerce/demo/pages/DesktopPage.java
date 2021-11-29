package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By buildYourOwnComputer = By.xpath("//div[@class='picture']//img[@title='Show details for Build your own computer']");

    public void clickOnBuildYourOwnComputer(){
        useMouseHoverAndClickAction(buildYourOwnComputer);
    }

    }
