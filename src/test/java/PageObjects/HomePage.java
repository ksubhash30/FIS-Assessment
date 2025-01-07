package PageObjects;

import actionDriver.ActionDriver;
import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    public HomePage()
    {
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='gh-ac']")
    WebElement productstext;
    ActionDriver actionDriver = new ActionDriver();

    @FindBy(xpath = "//*[@id='gh-btn']")
    WebElement serchbutton;

    @FindBy(xpath = "//*[@Id='srp-river-results']//li[@Class='s-item s-item__pl-on-bottom'][1]//child::div[2]")
    WebElement resultwindow;

    public void enterBookName(String bookname) throws InterruptedException {
        Thread.sleep(5000);
        actionDriver.click(getDriver(),productstext);
        actionDriver.type(productstext,bookname);
        actionDriver.click(getDriver(),serchbutton);

    }

    public boolean validateBook() throws InterruptedException {
        Thread.sleep(5000);
        return actionDriver.findElement(getDriver(),resultwindow);

    }
}
