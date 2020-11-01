import utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static consts.Consts.*;
import static org.junit.jupiter.api.Assertions.*;

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
        boolean isVisible = loginPage.logoLoginPageIsVisible();
        loginPage.takeScreenshot("LoginPageIsLoaded");
        assertTrue(isVisible);
    }
    @Test
    public void createAccountLinkTest(){
        logger.info("Creative account page is opened and loaded");
        boolean isVisible = loginPage.createAccountLink();
        loginPage.takeScreenshot("CreativeAccountPageOpened");
        assertTrue(isVisible);
    }

    @Test
        public void createAccountMailNegativeTest(){
        String text = "#$%^&#W";
        logger.info("Creative account fills");
        loginPage.creativeAccountMailFieldNegative(text);
//        boolean errorText = loginPage.isErrorMessage(TEXT_ERROR_EMAIL);
        String expectedUrl = CREATE_ACCOUNT_PAGE_URL;
        String actualURL = loginPage.getURLPage();
//        assertTrue(errorText);
        assertEquals(expectedUrl, actualURL);

    }

    @Test
    public void resetPasswordPageTest(){
        logger.info("Reset password page test");
        boolean isOpened = loginPage.openForgotPasswordPage();
        String expectedUrl = RESET_PASS_URL;
        String actualURL = loginPage.getURLPage();
        assertTrue(isOpened);
        assertEquals(expectedUrl, actualURL);


    }


}
