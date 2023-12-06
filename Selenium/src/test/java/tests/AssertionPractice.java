package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class AssertionPractice {

    private WebDriver driver = null;
    private String driverPath="C:\\Users\\s.mosquera\\IdeaProjects\\TAE\\Academy_TAE\\" +
            "Selenium\\src\\test\\java\\utils\\chromedriver.exe";



    @Parameters({"testType"})
    @Test(groups="TestSuite")
    public void testSearchTestNG(String testType){
        System.setProperty("webDriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement searchInput = driver.findElement(By.cssSelector("#search-input > #search"));
        searchInput.sendKeys("TestNG");

        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();

        WebElement playLists = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".style-scope ytd-section-list-renderer > #contents")));



        //Assert.assertEquals(playLists.getSize(), 900);



        //Assert.assertTrue(playLists.getText().contains("testNG"));

        Assert.assertEquals(testType,playLists.getText());

        SoftAssert softAssert = new SoftAssert();


        List<WebElement> playLists2 = driver.findElements(By.cssSelector(
                "ytd-playlist-renderer[class='style-scope ytd-item-section-renderer']"));




    }




}
