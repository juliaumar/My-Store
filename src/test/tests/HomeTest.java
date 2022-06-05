package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

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
    }

    @Test(testName = "IN-1 Adding the second item to the cart")
            public void test02() {
        homePage.moveIntoView(homePage.hiddenEl2);
          homePage.click(homePage.addToCart2);

        //  homePage.click(homePage.continShopping);

    }

    @Test(testName = "IN-2 Contact Us Page")
    public void test03(){
        homePage.click(homePage.contactUsBtn);
        homePage.click(homePage.headling);
        homePage.click(homePage.customerService);
    }
    @DataProvider(name = "Contact Us info")
    public Object[][] data() {
        Object[][] data = new Object[1][4];

        data[0][0] = "flower@test.com";
        data[0][1] = "657895400";
        data[0][2] = "/Users/juliaumar/Desktop/html/day2";
        data[0][3] = "Hello World";

        return data;
    }

    @Test(testName = "IN-3 Fill out Customer Service", dataProvider = "Contact Us info")
    public void test04( String email, String reference,String  addFile, String message){
        homePage.click(homePage.contactUsBtn);
        homePage.click(homePage.headling);
        homePage.click(homePage.customerService);

        homePage.sendKeys(homePage.email,email);
       homePage.sendKeys(homePage.orderRef,reference);
       homePage.sendKeys(homePage.addFile, addFile);
       homePage.sendKeys(homePage.message, message);

    }

}