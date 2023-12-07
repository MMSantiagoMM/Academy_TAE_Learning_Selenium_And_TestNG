package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }

    @FindBy(id = "signin2")
    private WebElement signUpLink;

    @FindBy(css = "input[id='sign-username']")
    private WebElement userNameInput;

    @FindBy(css = "input[id='sign-password']")
    private WebElement passwordInput;

    @FindBy(css = "button[onclick='register()']")
    private WebElement signUpButton;


    public void pressSignUp(){
        this.isElementDelayed(signUpLink);
        signUpLink.click();
    }

    public void enterUserName(){
        this.isElementDelayed(userNameInput);
        userNameInput.sendKeys("UserNumero1222qswq23443532342kjdswd");
    }

    public void enterPassword(){
        passwordInput.sendKeys("1234567898");
    }

    public void pressSignUpButton(){
        signUpButton.click();
    }






}
