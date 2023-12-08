package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LogInPage;
import pages.LogOutPage;
import pages.PurchasePage;
import pages.RemovingPage;

public class BaseTest {

    WebDriver driver;
    LogInPage logInPage;
    PurchasePage purchasePage;
    RemovingPage removingPage;
    LogOutPage logOutPage;

    String urlLog = "https://www.saucedemo.com/";
    String urlHome = "https://www.saucedemo.com/inventory.html";

    @BeforeTest
    public void setBeforeTest(){
        driver = new ChromeDriver();
    }

    @AfterTest
    public void setAfterTest(){
        driver.close();
    }


    public LogInPage getLogInPage() {
        return logInPage = new LogInPage(driver, urlLog);
    }

    public PurchasePage getPurchasePage(){
        extracted();
        return purchasePage = new PurchasePage(driver,urlHome);
    }

    public  RemovingPage getRemovingPage(){
        extracted();
        return removingPage = new RemovingPage(driver,urlHome);
    }

    public LogOutPage getLogOutPage(){
        extracted();
        return logOutPage = new LogOutPage(driver,urlHome);
    }


    private void extracted() {
        getLogInPage();
        logInPage.setUserName("standard_user");
        logInPage.setPassword("secret_sauce");
        logInPage.clickButton();
    }


}
