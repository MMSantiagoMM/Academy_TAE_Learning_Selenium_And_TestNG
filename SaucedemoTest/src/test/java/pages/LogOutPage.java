package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage{

    public LogOutPage(WebDriver driver,String url) {
        super(driver);
        this.driver.get(url);
    }

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logOutOption;

    @FindBy(id = "login-button")
    private WebElement logInButton;

    public void clickMenu(){
        menu.click();
    }

    public void clickLogOut(){
        isElementDelayed(logOutOption);
        logOutOption.click();
    }

    public Boolean isInLogInPage(){
        return logInButton.isEnabled();
    }




}
