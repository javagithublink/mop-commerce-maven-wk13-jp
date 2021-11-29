package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TestSuiteComputers extends TestBase {

    HomePage homePage = new HomePage();
    ApparelPage apparelPage = new ApparelPage();
    BooksPage booksPage = new BooksPage();
    ComputerPage computerPage = new ComputerPage();
    JewelryPage jewelryPage = new JewelryPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutSignInPage checkOutSignInPage = new CheckOutSignInPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    OrderSuccessPage orderSuccessPage = new OrderSuccessPage();


    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {
        homePage.clickOnDesktopSubTab();
        desktopPage.clickOnBuildYourOwnComputer();
        Thread.sleep(1000);
        buildYourOwnComputerPage.verifyUserOnBuildYourOwnComputerPage();
        buildYourOwnComputerPage.selectComputerSpecification();
        Thread.sleep(1000);
        buildYourOwnComputerPage.verifyTotalPrice();
        buildYourOwnComputerPage.clickOnAddToCart();

        shoppingCartPage.updateQuantityOnShoppingCart();
        Thread.sleep(1000);
        shoppingCartPage.verifyTotalCartAmount("$2,950.00"); // change need to be validated
        shoppingCartPage.selectTermsOfServiceCheckBox();
        shoppingCartPage.clickOnCheckOutButton();

        Thread.sleep(1000);
        checkOutSignInPage.verifyUserIsOnCheckOutSignInPage(); // change need to be validated
        checkOutSignInPage.clickOnCheckOutAsGuest();

        checkOutPage.addBillingAddressForGuest();

        checkOutPage.addShippingMethod();
        checkOutPage.addPaymentMethod();
        checkOutPage.addPaymentInformation();

        checkOutPage.verifyOrder("$2,950.00"); // change need to be validated

        orderSuccessPage.verifyOrderPlacedSuccessfully();


    }


}
