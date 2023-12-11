package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.GlobalSQAPage;

public class BaseTest {

    WebDriver driver;
    GlobalSQAPage globalSQAPage;


    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
        driver.manage().window().maximize();
    }


    public GlobalSQAPage getGlobalSQAPage(){
        return globalSQAPage = new GlobalSQAPage(driver);
    }




}
