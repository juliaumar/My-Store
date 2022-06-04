package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@class='replace-2x img-responsive']")
    public WebElement hiddenEl;

    @FindBy(xpath = "(//*[@class='replace-2x img-responsive'])[5]")
    public WebElement hiddenEl2;

    @FindBy(xpath = "//*[@id=\"index\"]")
    public WebElement addToCart;

    @FindBy(xpath = "(//*[@class='button ajax_add_to_cart_button btn btn-default'])[5]")
    public WebElement addToCart2;
   // @FindBy(xpath = "//*[@id='homefeatured']/li[4]/div/div[2]/div[2]/a[1]/span")
   // public WebElement addToCart2;

    @FindBy(className= "continue btn btn-default button exclusive-medium")
    public WebElement continShopping;

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



    @DataProvider(name = "Contact Us info")
    public Object[][] data() {
        Object[][] data = new Object[1][4];

        data[0][0] = "flower@test.com";
        data[0][1] = "657895400";
        data[0][2] = "/Users/juliaumar/Desktop/html/day2";
        data[0][3] = "Hello World";

        return data;
    }

}