package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.util.ArrayList;
import java.util.List;

public class GlobalSQAPage extends BasePage {

    public GlobalSQAPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[id='Open New Tab']")
    private WebElement openNewTab;

    @FindBy(css = "div[class='single_tab_div resp-tab-content resp-tab-content-active'] " +
            "> a[class='button e.g. button_hilite button_pale small_button']")
    private WebElement clickHereLink;

    @FindBy(id = "iFrame")
    private WebElement iFrameTab;

    @FindBy(css = "[id='current_filter']")
    private WebElement allDropDown;

    @FindBy(css = "div[data-option-value='.softwaretesting']")
    private WebElement softwareOption;

    @FindBy(css = "img[alt='Manual Online Testing Training']")
    private WebElement manualTestingOption;

    @FindBy(css = "a[title='Manual Testing Training'] span")
    private WebElement manualTestingAnnouncement;


    @FindBy(css= "#menu-item-2816 .link_span")
    private WebElement alertBoxLink;

    @FindBy(css = ".analystic[href='#CancelTab']")
    private WebElement alertOkButton;

    @FindBy(css = ".btn.btn-primary")
    private WebElement displayButton;

    @FindBy(id = "demo")
    private WebElement announceAfterCancel;


    public void clickOpenNewTab(){
        openNewTab.click();
    }

    public void clickClickHere(){

        clickHereLink.click();
    }

    public void switchToNewTabAndClick(){


        List<String> handles = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(handles.get(1));

        iFrameTab.click();

        driver.switchTo().frame("globalSqa");

        isElementClickable(allDropDown);
        allDropDown.click();

        Actions actions = new Actions(driver);

        actions.moveToElement(allDropDown).build().perform();

        isElementClickable(softwareOption);
        softwareOption.click();

        manualTestingOption.click();
    }

    public String checkManualTestingOption(){
        isElementClickable(manualTestingAnnouncement);

        return manualTestingAnnouncement.getText();

    }

    public void clickAlterBox(){

        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(1));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,350)","");

        //js.executeScript("arguments[0].scrollIntoView();",alertBoxLink);

        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        isElementClickable(alertBoxLink);

        alertBoxLink.click();

    }

    public void switchToInitialTab(){
        driver.close();
        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(0));
        driver.get("https://demo.automationtesting.in/Alerts.html");

        alertOkButton.click();

        isElementClickable(displayButton);
        displayButton.click();

        driver.switchTo().alert().dismiss();
    }

    public String confirmAnnounceAfterCancel(){
        this.isElementClickable(announceAfterCancel);
        return announceAfterCancel.getText();
    }










}
