package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import static constants.Constants.*;
import static constants.Locators.AuthPage.*;

public class AuthPage extends BasePage{

    @FindBy (xpath = AUTH_TITLE)
    private WebElement authTitle;
    @FindBy (xpath = EMAIL_ADDRESS_TITLE)
    private WebElement emailTitle;
    @FindBy (xpath = PASSWORD_TITLE)
    private WebElement passwordTitle;
    @FindBy (xpath = EMAIL_ADDRESS_FIELD)
    private WebElement emailField;
    @FindBy (xpath = PASSWORD_FIELD)
    private WebElement passwordField;
    @FindBy (xpath = SIGN_IN_BUTTON)
    private WebElement signInButton;
    @FindBy (xpath = ERROR_MESSAGE_TITLE)
    private WebElement errorMessageTitle;
    @FindBy (xpath = LOGOUT_BUTTON)
    private WebElement logOutButton;

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    public String getAuthTitle () {
        return authTitle.getText();
    }
    public String getEmailTitle () {
        return emailTitle.getText();
    }
    public String getPasswordTitle () {
        return passwordTitle.getText();
    }
    public String getErrorMessageTitle () {
        return errorMessageTitle.getText();
    }
    public String getEmailFieldColor () {
        String s = emailField.getCssValue("color");
        String c = Color.fromString(s).asHex();
        return c;
    }
    public String getPasswordFieldColor () {
        String s = passwordField.getCssValue("color");
        String c = Color.fromString(s).asHex();
        return c;
    }

    public void waitEmailFieldVisible () {
        super.waitWebElementVisible(emailField, ELEMENT_WAIT);
    }
    public void waitPasswordFieldVisible () {
        super.waitWebElementVisible(passwordField, ELEMENT_WAIT);
    }
    public void waitSignInButtonAuthVisible () {
        super.waitWebElementVisible(signInButton, ELEMENT_WAIT);
    }

    public void fillEmailField (String value) {
        super.fillField(emailField, value);
    }
    public void fillPasswordField (String value) {
        super.fillField(passwordField, value);
    }
    public void tabEmailField () {
        emailField.sendKeys(Keys.TAB);
    }
    public void tabPasswordField () {
        passwordField.sendKeys(Keys.TAB);
    }
    public void clickSignInAuthButton () {
        super.clickButton(signInButton);
    }
    public void clickLogOutButton () {
        super.clickButton(logOutButton);
    }

}
