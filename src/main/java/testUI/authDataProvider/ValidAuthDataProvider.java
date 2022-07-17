package testUI.authDataProvider;

import org.testng.annotations.DataProvider;

public class ValidAuthDataProvider {

    @DataProvider (name = "validAuthData")
    public static Object[][] createValidAuthData() {
        return new Object[][]{
                {"qwertyawerty123@gmail.com", "Qwerty123"}
        };
    }
}
