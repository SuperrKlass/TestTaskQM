package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.AuthPage;
import static constants.Constants.*;
import static constants.Messages.MainPageMessages.*;

public class AuthPageSteps extends BasePageSteps{
    AuthPage authPage;

    public AuthPageSteps(WebDriver driver) {
        super(driver);
        authPage = new AuthPage(driver);
    }

    private SoftAssert softAssert = new SoftAssert();

    public AuthPageSteps verifyAuthUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), AUTH_URL, INCORRECT_URL_MESSAGE);
        return this;
    }

    public AuthPageSteps verifyAuthTitleText() {
        Assert.assertEquals(authPage.getAuthTitle(), "AUTHENTICATION", INCORRECT_TEXT_MESSAGE);
        return this;
    }

    public AuthPageSteps verifyEmailTitleText() {
        Assert.assertEquals(authPage.getEmailTitle(), "Email address", INCORRECT_TEXT_MESSAGE);
        return this;
    }

    public AuthPageSteps verifyPasswordTitleText() {
        Assert.assertEquals(authPage.getPasswordTitle(), "Password", INCORRECT_TEXT_MESSAGE);
        return this;
    }

    public AuthPageSteps waitEmailFieldVisible() {
        authPage.waitEmailFieldVisible();
        return this;
    }

    public AuthPageSteps waitPasswordFieldVisible() {
        authPage.waitPasswordFieldVisible();
        return this;
    }

    public  AuthPageSteps waitSignInAuthButtonVisible() {
        authPage.waitSignInButtonAuthVisible();
        return this;
    }

    public AuthPageSteps fillEmailField(String email) {
        authPage.fillEmailField(email);
        return this;
    }

    public AuthPageSteps fillPasswordField(String password) {
        authPage.fillPasswordField(password);
        return this;
    }

    public AuthPageSteps clickSignInButtonAuth() {
        authPage.clickSignInAuthButton();
        return this;
    }

    public AuthPageSteps verifyEmailAndPassErrorMessages() {
        softAssert.assertEquals(authPage.getErrorMessageTitle(), EMAIL_PASS_ERRORS, INCORRECT_ERROR_MESSAGES);
        return this;
    }

    public AuthPageSteps tabEmailField() {
        authPage.tabEmailField();
        return this;
    }

    public AuthPageSteps tabPasswordField() {
        authPage.tabPasswordField();
        return this;
    }

    public String getEmailFieldColor() {
        String emailFieldColor = authPage.getEmailFieldColor();
        return emailFieldColor;
    }

    public AuthPageSteps compareColorOfEmailFieldExpectRed() {
        softAssert.assertEquals(authPage.getEmailFieldColor(), "#f13340", NOT_SAME_COLORS_MESSAGE);
        return this;
    }

    public AuthPageSteps compareColorOfEmailFieldExpectGreen() {
        softAssert.assertEquals(authPage.getEmailFieldColor(), "#35b33f", NOT_SAME_COLORS_MESSAGE);
        return this;
    }

    public AuthPageSteps verifyMyAccountUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), MY_ACCOUNT_URL, INCORRECT_URL_MESSAGE);
        return this;
    }

    public AuthPageSteps clickLogOutButton() {
        authPage.clickLogOutButton();
        return this;
    }


}
