package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.directory.SearchResult;
import java.time.Duration;

public class HomePage extends BasePage {





    @FindBy(css = "a.nav-link[data-target=\"#videoModal\"]")
     private WebElement aboutUsLink;

    @FindBy(className ="vjs-poster" )
    private WebElement buttonPlay;

    public SearchResults clickAboutUsLink(){
        this.aboutUsLink.click();

    }

    public void setButtonPlay(){
        this.isElementDisplayed(buttonPlay);
        buttonPlay.click();
    }

    public HomePage(WebDriver driver, String url){
        super(driver);
        this.driver = driver;
        this.driver.get(url);

    }
}
