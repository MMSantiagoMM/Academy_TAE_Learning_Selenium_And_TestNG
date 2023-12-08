package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasePage extends BasePage{

    public PurchasePage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }

    @FindBy(id = "item_5_title_link")
    private WebElement selectedElement;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement buttonAddToCart;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCart;

    @FindBy(id = "checkout")
    private WebElement checkout;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(id = "continue")
    private WebElement buttonContinue;

    @FindBy(id = "finish")
    private WebElement buttonFinish;

    @FindBy(id = "back-to-products")
    private WebElement buttonBackHome;

    @FindBy(className = "complete-header")
    private WebElement thanksPage;


    public void clickSelectedElement(){
        selectedElement.click();
    }

    public void addElementToCart(){
        buttonAddToCart.click();
    }

    public void goToCard(){
        shoppingCart.click();
    }

    public void clickCheckout(){
        checkout.click();
    }

    public void setFirstName(String text){
        firstName.sendKeys(text);
    }

    public void setLastName(String text){
        lastName.sendKeys(text);
    }

    public void setPostalCode(String text){
        postalCode.sendKeys(text);
    }

    public void clickContinue(){
        buttonContinue.click();
    }

    public void clickFinish(){
        buttonFinish.click();
    }

    public void clickGoHome(){
        buttonBackHome.click();
    }

    public String checkLastPage(){
        return thanksPage.getAccessibleName();
    }










}
