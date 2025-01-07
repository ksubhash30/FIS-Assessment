package com.ebay.tests;

import PageObjects.CartPage;
import PageObjects.HomePage;
import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidateCart extends BaseClass {
    HomePage login;
    CartPage cart;

    @Parameters("browser")
    @BeforeMethod()
    public void Setup(String browser) {
        launchApp(browser);

    }

    @AfterClass()
    public void Teardown() {
        getDriver().quit();
    }

    @Test
    public void verifyItemAddedToCart() throws InterruptedException {
        login = new HomePage();
        cart = new CartPage();
        //com.mystore.utility.Log.info("User click on serach bar");
        login.enterBookName("book");
        boolean bookresult = login.validateBook();
        Assert.assertTrue(bookresult);
        // com.mystore.utility.Log.info("verify user able see books");
        cart.clickOnBook();
        // com.mystore.utility.Log.info("book added to cart");
        boolean cartloaded = cart.validateBookLoaded();
        Assert.assertTrue(cartloaded);
        //  com.mystore.utility.Log.info("book loaded to cart");
        cart.addBookToCart();
        String itemcount = cart.validateItemInCart();
        Assert.assertEquals(1, itemcount);
        // com.mystore.utility.Log.info("validated cart for single item added");

    }
}
