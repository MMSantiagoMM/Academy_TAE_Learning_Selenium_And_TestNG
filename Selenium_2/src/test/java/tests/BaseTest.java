package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTest {

    WebDriver driver = null;
    HomePage homePage;


    @BeforeTest
    public void beforeTest(){
        String drivePath = "C:\\Users\\s.mosquera\\IdeaProjects\\TAE\\Academy_TAE" +
                "\\Selenium_2\\src\\test\\java\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver",drivePath);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest(){
        driver.navigate().back();
    }

    public HomePage getHomePage(){
        return homePage = new HomePage(driver,
                "https://dictionary.cambridge.org/us/dictionary/english/");
    }


}
