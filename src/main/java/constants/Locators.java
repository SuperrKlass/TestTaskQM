package constants;

public class Locators {

    public interface MainPage{
        String SIGN_IN_BUTTON_MAIN = "//a[@class='login']";

    }

    public interface AuthPage{
        String AUTH_TITLE = "//h1[@class='page-heading']",
                EMAIL_ADDRESS_TITLE = "//label[@for='email']",
                PASSWORD_TITLE = "//label[@for='passwd']",
                EMAIL_ADDRESS_FIELD = "//input[@id='email']",
                PASSWORD_FIELD = "//input[@id='passwd']",
                SIGN_IN_BUTTON = "//button[@id='SubmitLogin']",
                ERROR_MESSAGE_TITLE = "//div[@class='alert alert-danger']/ol/li",
                LOGOUT_BUTTON = "//a[@class='logout']";
    }
}
