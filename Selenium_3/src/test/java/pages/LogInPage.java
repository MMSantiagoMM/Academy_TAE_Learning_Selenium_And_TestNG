package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{

    public LogInPage(WebDriver driver,String url) {
        super(driver);
        this.driver.get(url);
    }

    @FindBy(id = "login2")
    private WebElement logInLink;

    @FindBy(id = "loginusername")
    private WebElement userNameLogIn;

    @FindBy(id = "loginpassword")
    private WebElement passwordLogIn;

    @FindBy(css = "button[onclick='logIn()']")
    private WebElement logInButton;

    public void pressLogInLink(){
        this.isElementDelayed(logInLink);
        logInLink.click();
    }

    public void fillUserName(){
        this.isElementDelayed(userNameLogIn);
        userNameLogIn.sendKeys("UserNumero1222qswq23443532342kjdswd");
    }

    public  void fillPassword(){
        this.isElementDelayed(passwordLogIn);
        passwordLogIn.sendKeys("1234567898");
    }

    public void pressLogInButton(){
        this.isElementDelayed(logInButton);
        logInButton.click();
    }



}
