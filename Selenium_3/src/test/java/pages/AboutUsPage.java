package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage {

    public AboutUsPage(WebDriver driver, String url) {
        super(driver);
        this.driver = driver;
        this.driver.get(url);
    }

    @FindBy(css = "a[data-target='#videoModal']")
    private WebElement aboutUsButton;

    @FindBy(className = "vjs-big-play-button")
    private WebElement playButton;

    public void pressAboutUs(){
        this.isElementDelayed(aboutUsButton);
        aboutUsButton.click();
    }

    public void pressPlay(){
        this.isElementDelayed(playButton);
        playButton.click();
    }


}
