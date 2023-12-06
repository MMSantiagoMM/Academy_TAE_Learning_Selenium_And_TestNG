package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTests {

    private WebDriver driver = null;
    private String driverPath = "C:\\Users\'s.mosquera\\IdeaProjects\\TAE\\Selenium" +
            "\\src\\test\\java\\utils\\chromedriver.exe";

    @Test
    public void testYouTube() {
        System.setProperty("webDriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='search']"));

        searchInput.isDisplayed();

        searchInput.sendKeys("relax and take notes biggie");


        WebElement button = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        button.click();

        driver.get("https://www.youtube.com/watch?v=n-gt16pL1MU&pp=ygUbcmVsYXggYW5kIHRha2Ugbm90ZXMgYmlnZ2ll");

        WebElement play = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));

        play.click();


    }
}

