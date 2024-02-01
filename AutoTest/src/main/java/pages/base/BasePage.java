package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariable.EXPLICI_WAIT;

public class BasePage {

    public WebDriverWait wait;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url){
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver,EXPLICI_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void fillIn(String text, WebElement inputElement){
        try {
            waitElementIsVisible(inputElement);
            clickOnElement(inputElement);
            inputElement.sendKeys(text);
        }catch (Exception e){
            System.out.println(" test");
        }

    }

    public void clickOnElement(WebElement element) {
        try {
            waitElementIsVisible(element);
        } catch (Exception e) {
            System.out.println("Click on " + element.getText() + " isn't performed - " + e.getMessage());
        }
    }


}
