package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TestSuiteElectronics extends TestBase {

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
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //Homepage
        homePage.clickOnCellPhonesSubTab();

        //CellPhone page
        Thread.sleep(2000);
        cellPhonesPage.verifyUserOnCellPhonesPage();
        cellPhonesPage.clickOnListViewTab();
        Thread.sleep(1000);
        cellPhonesPage.clickOnProductName();

        //Nokia Lumia page
        nokiaLumiaPage.verifyUseIsOnNokiaLumiaPage();
        nokiaLumiaPage.verifyTotalPrice("$349.00");
        nokiaLumiaPage.changeQuantity();
        nokiaLumiaPage.clickOnAddToCart();

        //Shopping cart
        Thread.sleep(1000);
        shoppingCartPage.verifyTotalCartAmount("$698.00");
        shoppingCartPage.selectTermsOfServiceCheckBox();
        shoppingCartPage.clickOnCheckOutButton();

        //Checkout Sign In Page
        Thread.sleep(1000);
        checkOutSignInPage.verifyUserIsOnCheckOutSignInPage();
        checkOutSignInPage.clickOnRegisterButton();

        //Registration page
        Thread.sleep(1000);
        registrationPage.verifyUserIsOnRegistrationPage();
        registrationPage.createYourAccount();
        registrationPage.clickOnContinueButton();

        //Back on Shopping cart page
        shoppingCartPage.selectTermsOfServiceCheckBox();
        shoppingCartPage.clickOnCheckOutButton();

        //Checkout page
        checkOutPage.addBillingAddressForRegisteredAccount();
        checkOutPage.addShippingMethod();
        checkOutPage.addPaymentMethod();
        checkOutPage.addPaymentInformation();
        Thread.sleep(1000);
        checkOutPage.verifyOrder("$698.00");

        //Thank you message page
        Thread.sleep(1000);
        orderSuccessPage.verifyOrderPlacedSuccessfully();

        //Back to Homepage
        homePage.verifyUserIsOnHomePage();


    }

}
