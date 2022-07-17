package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.MainPage;

import static constants.Constants.*;
import static constants.Messages.MainPageMessages.*;

public class MainPageSteps extends BasePageSteps{
    MainPage mainPage;


    public MainPageSteps(WebDriver driver) {
        super(driver);
        mainPage = new MainPage(driver);
    }

    public MainPageSteps openPracticeApp() {
        mainPage.openMainUrl();
        return this;
    }

    public MainPageSteps verifyMainPageUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), MAIN_URL, INCORRECT_URL_MESSAGE);
        return this;
    }

    public MainPageSteps waitSignInButtonMain() {
        mainPage.waitSignInButtonMain();
        return this;
    }

//    public MainPageSteps clickSignInButtonMain() {
//        mainPage.clickSignInButtonMain();
//        return this;
//    }

    public <T> T clickSignInButtonMain(WebDriver driver, Class<T> type) {
        mainPage.clickSignInButtonMain();
        return super.redirectToPage(driver, type);
    }

}
