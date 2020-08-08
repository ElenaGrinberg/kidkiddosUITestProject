import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends UseCaseBase {
    public static final Logger logger = LogManager.getLogger(LoginPageTest.class);
    private static LoginPage loginPage;

    @BeforeAll
    public static void classSetup() {
        loginPage = new LoginPage();
    }
    @BeforeEach
    public void beforeTest() {
        loginPage.goToLoginPage();
    }
    @Test
    public void LoginPageLoadingTest(){
        logger.info("Login page is loaded");
        Boolean isVisible = loginPage.logoLoginPageIsVisible();
        loginPage.takeScreenshot("Login page is loaded, logo 'Login' is visible");
        assertTrue(isVisible);


    }
}
