package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    public WebDriver driver;



    @FindBy(css = "a.nav-link[data-target=\"#videoModal\"]")
     private WebElement aboutUsLink;

    @FindBy(className ="vjs-poster" )
    private WebElement buttonPlay;

    public void clickAboutUsLink(){
        this.aboutUsLink.click();
    }

    public void setButtonPlay(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(buttonPlay)).click();
    }

    public HomePage(WebDriver driver, String url){
        this.driver = driver;
        this.driver.get(url);
        PageFactory.initElements(driver,this);
    }
}
