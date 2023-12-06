package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    private WebDriver driver = null;
    private String driverPath = "C:\\Users\'s.mosquera\\IdeaProjects\\TAE\\Selenium" +
            "\\src\\test\\java\\utils\\chromedriver.exe";

    @Test
    public void testWiki(){

        System.setProperty("webDriver.chrome.driver",driverPath);
        driver = new ChromeDriver();


        String[] names = {"Java","Javascript","Python","Ruby","Assembly","Selenium","JUnit","TestNG"};

        for (int i = 0; i < 8; i++) {
            driver.navigate().to("https://www.wikipedia.org");

            WebElement searchInput = driver.findElement(By.id("searchInput"));
            searchInput.sendKeys(names[i]);

            WebElement button = driver.findElement(By.className("pure-button"));
            button.click();
        }
    }





}
