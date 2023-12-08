package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{

    public LogInPage(WebDriver driver,String url) {
        super(driver);
        driver.get(url);
    }

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void setUserName(String usr){
        userName.sendKeys(usr);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickButton(){
        loginButton.click();
    }






}
