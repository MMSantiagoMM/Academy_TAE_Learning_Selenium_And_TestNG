package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemovingPage extends BasePage{
    public RemovingPage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addPackButton;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement addTShirtButton;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement addTsRedButton;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartLink;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removePackButton;

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    private WebElement removeTShirtButton;

    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement removeTsRedButton;

    @FindBy(id = "shopping_cart_container")
    private WebElement quantityProductCart;

    public void setPack(){addPackButton.click();}

    public void setTShirt(){addTShirtButton.click();}

    public void setTsRed(){addTsRedButton.click();}

    public void goToCart(){cartLink.click();}

    public void deletePack(){removePackButton.click();}

    public void deleteTShirt(){removeTShirtButton.click();}

    public void deleteTSRed(){removeTsRedButton.click();}

    public String getCartEmpty(){

        return quantityProductCart.getText();
    }




}
