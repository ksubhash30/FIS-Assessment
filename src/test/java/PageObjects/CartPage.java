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

    @FindBy(xpath = "//*[@Id=\"atcBtn_btn_1\"]")
    WebElement addtocart;
    ActionDriver actionDriver = new ActionDriver();

    @FindBy(xpath = "//*[@Id=\"srp-river-results\"]//child::li[@Class=\"s-item s-item__pl-on-bottom\"][1]")
    WebElement clickonbook;

    @FindBy(xpath = "//*[@Id=\"gh-cart-n\"]")
    WebElement cartitem;
    public boolean validateBookLoaded()
    {
        return actionDriver.findElement(getDriver(),addtocart);

    }

    public  void addBookToCart()
    {
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
