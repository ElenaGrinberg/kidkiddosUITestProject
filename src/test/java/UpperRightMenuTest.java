import consts.Consts;
import utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.UpperRightMenu;

import static consts.Consts.CART_COUNT_PATH;
import static consts.Consts.LOGIN_PAGE_URL;
import static org.junit.jupiter.api.Assertions.*;

public class UpperRightMenuTest extends UseCaseBase {
    public static final Logger logger = LogManager.getLogger(UpperRightMenu.class);
    private static UpperRightMenu upperRightMenu;

    @BeforeAll
    public static void classSetup() {
        upperRightMenu = new UpperRightMenu();
    }

    @BeforeEach
    public void beforeTest() {
        upperRightMenu.goToContactUsPage();
    }

    @Test
    public void loginIconIsVisibleTest() {
        logger.info("Login icon is visible");
        boolean success = upperRightMenu.loginIconIsVisible();
        upperRightMenu.takeScreenshot("LoginIconIsVisible");
        assertTrue(success);
    }

    @Test
    public void CartIsVisibleTest() {
        logger.info("Cart icon is visible");
        boolean success = upperRightMenu.CartIsVisible();
        upperRightMenu.takeScreenshot("CartIconIsVisible");
        assertTrue(success);
    }

    @Test
    public void LoginPageIsOpened() {
        logger.info("Login page is opened");
        String actualURL = upperRightMenu.openLoginPage();
        upperRightMenu.takeScreenshot("OpenLoginPage");
        assertEquals(LOGIN_PAGE_URL, actualURL);

    }

    @Test
    public void addBookToCart() {
        String cartCounter = upperRightMenu.addBookToCart();
        String currentURL = upperRightMenu.getCurrentURL();
        assertEquals(Consts.CART_URL, currentURL);
        assertNotNull(cartCounter);
        assertEquals("1", cartCounter);

    }

    @Test
    public void removeBookToCart() {
        upperRightMenu.removeBookFromCart();
        boolean notIsVisible = upperRightMenu.counterExist();
        assertFalse(notIsVisible);


    }

}
