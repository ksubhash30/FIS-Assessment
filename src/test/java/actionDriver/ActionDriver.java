package actionDriver;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDriver extends BaseClass {

    public void click(WebDriver driver, WebElement ele) {

//        Actions act = new Actions(driver);
//        act.moveToElement(ele).click().build().perform();
        ele.click();

    }

    public boolean findElement(WebDriver driver, WebElement ele) {
        boolean flag = false;

        try {
            ele.isDisplayed();
            flag = true;
        } catch (Exception e) {
            // System.out.println("Location not found: "+locatorName);
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully Found element at");

            } else {
                System.out.println("Unable to locate element at");
            }
        }
        return flag;
    }

    public boolean type(WebElement ele, String text) {
        boolean flag = false;

            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
            // logger.info("Entered text :"+text);
            flag = true;


        return flag;
    }

    public String getText(WebElement ele1, WebElement ele2){


            return ele2.getText();


        }


}
