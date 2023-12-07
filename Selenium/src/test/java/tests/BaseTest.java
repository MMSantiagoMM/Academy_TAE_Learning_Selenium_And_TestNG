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
        String driverPath = "C:\\Users\\s.mosquera\\IdeaProjects\\TAE\\Academy_TAE\\" +
                "Selenium\\src\\test\\java\\utils\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        //homePage = new HomePage(driver,"https://demoblaze.com/");
    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }

    public HomePage getHomePage(){
        return homePage = new HomePage(driver,"https://demoblaze.com/");
    }


}
