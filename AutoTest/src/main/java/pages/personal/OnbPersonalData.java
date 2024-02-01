package pages.personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class OnbPersonalData extends BasePage {
    public OnbPersonalData(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='first_name_eng']")
    private WebElement nameField;

    @FindBy(xpath = "//*[@id='last_name_eng']")
    private WebElement surnameField;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='mobile_number']")
    private WebElement phoneNumberfield;

    @FindBy(xpath = "//*[@id='document_number']")
    private WebElement documentNumberField;

    @FindBy(xpath = "//*[@id='chbTerms']")
    private WebElement arcaCheckbox;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    private WebElement btnSubmit;


    public OnbPersonalData fillInName(String name) {
        fillIn(name,nameField);
        System.out.println("Fill " + name + " in username");
        return this;
    }

//    public OnbPersonalData fillInputFields() {
//        driver.findElement(name).sendKeys("VAZGEN");
//        driver.findElement(name).sendKeys("KHACHATRYAN");
//        driver.findElement(name).sendKeys("khachatryan@mail.ru");
//        return this;
//    }

}
