package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import java.util.List;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@class='replace-2x img-responsive']")
    public WebElement hiddenEl;

    @FindBy(xpath = "//*[@id=\"index\"]")
    public WebElement addToCart;

   @FindBy(xpath = "//*[@title='View my shopping cart']")
   public WebElement hiddenEl2;

    @FindBy(xpath = "//*[@id='contact-link']/a")
    public WebElement contactUsBtn;

    @FindBy(id = "uniform-id_contact")
    public WebElement headling;

    @FindBy(xpath = "(//*[text()='Customer service'])")
    public WebElement customerService;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "id_order")
    public WebElement orderRef;

    @FindBy(xpath = "(//*[@id='fileUpload'])[1]")
    public WebElement addFile;

    @FindBy(xpath = "(//*[@id='message'])[1]")
    public WebElement message;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement submitBtn;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement confirmedMessage;

    @FindBy(xpath = "//*[@class='toggle-footer']//li")
    public WebElement footer;




    }

