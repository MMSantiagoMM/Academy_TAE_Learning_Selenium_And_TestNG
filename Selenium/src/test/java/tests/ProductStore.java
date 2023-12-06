package tests;

import org.checkerframework.checker.guieffect.qual.AlwaysSafe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ProductStore extends BaseTest {


    @Test
    public void testProductStoreAboutUs(){

        getHomePage();

        homePage.clickAboutUsLink();

        homePage.setButtonPlay();


    }

    //@Test
    public void testLogin(){
        //System.setProperty("webDriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        driver.navigate().to("https://demoblaze.com/");




        WebElement signUp = driver.findElement(By.id("signin2"));
        signUp.click();



        WebElement userName = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("#sign-username")));
        userName.sendKeys("recsaxzrswqdwqxqazgtbgte546754tbh3");


        WebElement password = driver.findElement(By.cssSelector("#sign-password"));
        password.sendKeys("JavaIsTheBest");

        WebElement signUpButton = driver.findElement(By.cssSelector("[onClick=\"register()\"]"));
        signUpButton.click();

        driver.navigate().refresh();


        WebElement login = driver.findElement(By.id("login2"));
        login.click();

        WebElement userNameLogin = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
        userNameLogin.sendKeys("recsaxzrswqdwqxqazgtbgte546754tbh3");

        WebElement passwordLogin = driver.findElement(By.id("loginpassword"));
        passwordLogin.sendKeys("JavaIsTheBest");
        WebElement loginButton = driver.findElement(By.cssSelector("button[onClick='logIn()']"));
        loginButton.click();



    }





}
