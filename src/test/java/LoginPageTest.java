import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginINPage;
import pages.UpperRightMenu;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends UseCaseBase {
    public static final Logger logger = LogManager.getLogger(LoginPageTest.class);
    private static LoginINPage loginINPage;

    @BeforeAll
    public static void classSetup() {
        loginINPage = new LoginINPage();
    }
    @BeforeEach
    public void beforeTest() {
        loginINPage.goToLoginPage();
    }
    @Test
    public void LoginPageLoadingTest(){
        logger.info("Login page is loaded");
        Boolean isVisible = loginINPage.logoLoginPageIsVisible();
        loginINPage.takeScreenshot("Login page is loaded, logo 'Login' is visible");
        assertTrue(isVisible);


    }
}
