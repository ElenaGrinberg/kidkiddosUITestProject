import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.BasePage;
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
        public void createAccountMailTest(){
       String text = "#$%^&#W";
        logger.info("Creative account fills");
        loginPage.creativeAccountMailFieldNegative(text);
        String textError = BasePage.getTextFromMessageError();
        loginPage.takeScreenshot("NegativeTestMailField");
        String expectedMassage = "Адрес электронной почты должен содержать символ";
        assertEquals(textError, expectedMassage);
        analyzeLog();



    }


}
