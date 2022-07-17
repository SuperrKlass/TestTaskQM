package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Constants.*;
import static constants.Locators.MainPage.*;

public class MainPage extends BasePage{

    @FindBy (xpath = SIGN_IN_BUTTON_MAIN)
    private WebElement signInButtonMain;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainUrl () {
        super.openURL(MAIN_URL);
    }
    public void waitSignInButtonMain () {
        super.waitWebElementVisible(signInButtonMain, ELEMENT_WAIT);
    }
    public void clickSignInButtonMain () {
        super.clickButton(signInButtonMain);
    }
}
