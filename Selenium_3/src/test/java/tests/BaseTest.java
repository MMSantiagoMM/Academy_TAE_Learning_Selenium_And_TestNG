package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.AboutUsPage;
import pages.LaptopPage;
import pages.LogInPage;
import pages.SignUpPage;

public class BaseTest {

    WebDriver driver;
    AboutUsPage aboutUsPage;
    SignUpPage signUpPage;
    LogInPage logInPage;
    LaptopPage laptopPage;

    private final String webSite = "https://demoblaze.com/";

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
    }

    /*@AfterTest
    public void afterTest(){
        driver.navigate().refresh();
    }*/


    public AboutUsPage getAboutUsPage(){
        return aboutUsPage = new AboutUsPage(driver,webSite);
    }

    public SignUpPage getSignUpPage(){
        return signUpPage = new SignUpPage(driver,webSite);
    }

    public LogInPage getLogInPage(){
        return logInPage = new LogInPage(driver,webSite);
    }

    public LaptopPage getLaptopPage(){
        getLogInPage();
        logInPage.pressLogInLink();
        logInPage.fillUserName();
        logInPage.fillPassword();
        logInPage.pressLogInButton();
        return laptopPage = new LaptopPage(driver,webSite);
    }



}
