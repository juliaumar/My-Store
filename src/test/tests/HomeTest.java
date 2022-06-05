package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());

    }
    @Test(testName = "IN 1  Adding the first item to the cart")
    public void test01() {
        homePage.moveIntoView(homePage.hiddenEl);
        homePage.click(homePage.addToCart);
        homePage.moveIntoView(homePage.hiddenEl2);


    }
    @Test(testName = "IN-2 Contact Us Page")
    public void test03(){
        homePage.click(homePage.contactUsBtn);
        homePage.click(homePage.headling);
        homePage.click(homePage.customerService);
    }
    @DataProvider(name = "Contact Us info")
    public Object[][] data() {
        Object[][] data = new Object[1][3];

        data[0][0] = "flower@test.com";
        data[0][1] = "657895400";
        data[0][2] = "Hello World";

        return data;
    }

    @Test(testName = "IN-3 Fill out Customer Service", dataProvider = "Contact Us info")
    public void test04( String email, String reference, String message){
        homePage.click(homePage.contactUsBtn);
        homePage.click(homePage.headling);
        homePage.click(homePage.customerService);

        homePage.sendKeys(homePage.email,email);
       homePage.sendKeys(homePage.orderRef,reference);
       homePage.sendKeys(homePage.message, message);

       homePage.submitBtn.click();
       String acualMsg = homePage.getText(homePage.confirmedMessage);
       String expected = "Your message has been successfully sent to our team.";
        Assert.assertEquals(acualMsg,expected);

    }
    @Test(testName = "IN-4 Footer Btns is present")
    public void test05(){


        }

        }


