package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SupplySyncPage {

    public  SupplySyncPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "input")
    public WebElement login;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "//button[.='Sign in']")
    public WebElement loginBtn;

    @FindBy (xpath = "(//div/button)[2]")
    public WebElement threeDots;

    @FindBy (xpath = "//ul/li/div")
    public WebElement editBtn;

    @FindBy (name = "name")
    public WebElement companyName;

    @FindBy (name = "email")
    public WebElement companyEmail;

    @FindBy (name = "address")
    public WebElement companyAddress;

    @FindBy (name = "phoneNumber")
    public WebElement companyPhoneNumber;

    @FindBy (xpath = "//button[.='Save']")
    public WebElement saveButton;



}
