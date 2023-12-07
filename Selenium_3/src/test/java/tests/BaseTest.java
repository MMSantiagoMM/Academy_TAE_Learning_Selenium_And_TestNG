package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.AboutUsPage;

public class BaseTest {

    WebDriver driver = null;
    AboutUsPage aboutUsPage;

    @BeforeTest
    public void beforeTest(){
        String driverPath = "C:\\Users\\s.mosquera\\IdeaProjects\\TAE" +
                "\\Academy_TAE\\Selenium_3\\src\\test\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
    }

    public AboutUsPage getAboutUsPage(){

        return aboutUsPage = new AboutUsPage(driver,"https://demoblaze.com/");

    }




}
