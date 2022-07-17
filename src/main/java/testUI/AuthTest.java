package testUI;

import org.testng.annotations.*;
import testUI.authDataProvider.ValidAuthDataProvider;

import static constants.Constants.*;


public class AuthTest extends BaseTest{

    @Test
    public void verifyPage() {
        authPageSteps
                .verifyAuthUrl()
                .verifyAuthTitleText()
                .verifyEmailTitleText()
                .verifyPasswordTitleText()
                .waitEmailFieldVisible()
                .waitPasswordFieldVisible()
                .waitSignInAuthButtonVisible();
    }

    @Test
    public void verifyUserGetErrorMessagesWithEmptyFields() {
        authPageSteps
                .clickSignInButtonAuth()
                .verifyEmailAndPassErrorMessages();
    }

    @Test
    public void verifyCyrillicNotAllowedInEmail() {
        authPageSteps
                .fillEmailField(getRandom(EMAIL_SYMBOLS, EMAIL_LENGTH) + "@post.com")
                .tabEmailField()
                .compareColorOfEmailFieldExpectRed();
    }

    @Test (dataProviderClass = ValidAuthDataProvider.class, dataProvider = "validAuthData")
    public void verifySpaceIsAllowedInEmail(String email, String password) {
        authPageSteps
                .fillEmailField(email + " ")
                .tabEmailField()
                .compareColorOfEmailFieldExpectGreen()
                .fillPasswordField(password)
                .tabPasswordField()
                .compareColorOfEmailFieldExpectGreen()
                .clickSignInButtonAuth()
                .verifyMyAccountUrl()
                .clickLogOutButton()
                .verifyAuthUrl();
    }
}
