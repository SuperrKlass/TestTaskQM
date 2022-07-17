package testUI;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import properties.Drivers;
import steps.AuthPageSteps;
import steps.MainPageSteps;

import java.util.Random;

public abstract class BaseTest {
    protected WebDriver driver;
    protected MainPageSteps mainPageSteps;
    protected AuthPageSteps authPageSteps;

    @BeforeSuite
    public void setUp() {
        driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        mainPageSteps = new MainPageSteps(driver);
        authPageSteps = new AuthPageSteps(driver);
    }

    @BeforeTest
    public void openApp() {
        mainPageSteps
                .openPracticeApp()
                .verifyMainPageUrl()
                .waitSignInButtonMain()
                .clickSignInButtonMain(driver, AuthPageSteps.class);
    }

//    @AfterSuite
//    protected void quitBrowser() {
//        if (!(driver == null)) {
//            driver.quit();
//        }
//    }

    public static String getRandom(String symbols, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < length; i++) {

            int index = random.nextInt(symbols.length());

            char randomChar = symbols.charAt(index);

            sb.append(randomChar);
        }
        return sb.toString();
    }
}
