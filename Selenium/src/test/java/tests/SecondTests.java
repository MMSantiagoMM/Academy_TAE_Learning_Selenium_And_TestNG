package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SecondTests extends PageFactory {

    private WebDriver driver = null;
    private String driverPath = "C:\\Users\'s.mosquera\\IdeaProjects\\TAE\\Selenium" +
            "\\src\\test\\java\\utils\\chromedriver.exe";



    @Test
    public void testYouTube() {
        System.setProperty("webDriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");



        //WebElement searchInput = driver.findElement(By.xpath("//input[@id='search']"));
        //WebElement searchInput = driver.findElement(By.id("search")); It doesn't work because It's not unique
        //input#search[type='text'] By css id
        WebElement searchInput = driver.findElement(By.cssSelector("#search-input > #search"));



        searchInput.isDisplayed();

        searchInput.sendKeys("relax and take notes biggie");


        WebElement button = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        button.click();

        driver.get("https://www.youtube.com/watch?v=n-gt16pL1MU&pp=ygUbcmVsYXggYW5kIHRha2Ugbm90ZXMgYmlnZ2ll");

        WebElement play = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));

        play.click();


    }
}

