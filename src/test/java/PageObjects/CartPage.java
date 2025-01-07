package PageObjects;

import actionDriver.ActionDriver;
import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass {
    public CartPage(){

        {
            PageFactory.initElements(getDriver(),this);
        }

    }

    @FindBy(xpath = "//*[@Class='vim vi-evo-row-gap']//li[2]//span[@Class='ux-call-to-action__cell']")
    WebElement addtocart;
    ActionDriver actionDriver = new ActionDriver();

    @FindBy(xpath = "//*[@Id='srp-river-results']//li[@Class='s-item s-item__pl-on-bottom'][1]//child::div[2]//div[@Class='s-item__title']")
    WebElement clickonbook;

    @FindBy(xpath = "//*[@Id=\"gh-cart-n\"]")
    WebElement cartitem;
    public boolean validateBookLoaded() throws InterruptedException {
        Thread.sleep(10000);
        return actionDriver.findElement(getDriver(),addtocart);

    }

    public  void addBookToCart() throws InterruptedException {
        Thread.sleep(10000);
        actionDriver.click(getDriver(),addtocart);
    }

    public String validateItemInCart()
    {
        actionDriver.findElement(getDriver(),cartitem);
        return cartitem.getText();
    }

    public void clickOnBook() throws InterruptedException {
        Thread.sleep(5000);
        actionDriver.click(getDriver(),clickonbook);
    }

}
