package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TestSuiteTopMenu extends TestBase {

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
    public void verifyUserShouldNavigateToTopMenuList() throws InterruptedException {
        homePage.clickOnApparelTab();
        apparelPage.verifyUserOnApparelPage();

        homePage.clickOnBooksTab();
        Thread.sleep(2000);
        booksPage.verifyUserOnBooksPage();

        homePage.clickOnComputerTab();
        Thread.sleep(2000);
        computerPage.verifyUserOnComputerPage();

        homePage.clickOnJewelryTab();
        jewelryPage.verifyUserOnJewelryPage();

        homePage.clickOnDigitalDownloadsTab();
        digitalDownloadsPage.verifyUserOnDigitalDownloadsPage();

        homePage.clickOnElectronicsTab();
        electronicsPage.verifyUserOnElectronicsPage();

        homePage.clickOnGiftCardsTab();
        giftCardsPage.verifyUserOnGiftCardsPage();


    }


}
