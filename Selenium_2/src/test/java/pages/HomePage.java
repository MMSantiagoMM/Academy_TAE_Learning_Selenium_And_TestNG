package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#searchword")
    private WebElement searchInput;

    @FindBy(css = "button[type='submit']")
    private WebElement searchButton;

    @FindBy(css = "div[onclick='audio1.load(); audio1.play();']")
    private WebElement play;

    public void setWord(){
        this.isElementDisplayed(searchInput);
        searchInput.sendKeys("Mindfulness");
    }

    public void pressButton(){
        searchButton.click();
    }

    public void playAudio(){
        this.isElementDisplayed(play);
        play.click();
    }

    public HomePage(WebDriver driver, String url){
        super(driver);
        this.driver = driver;
        this.driver.get(url);
    }







}
