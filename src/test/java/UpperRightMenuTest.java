import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ContactUsPage;
import pages.UpperRightMenu;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void loginIconIsVisibleTest(){
        logger.info("Login icon is visible");
        Boolean success = upperRightMenu.loginIconIsVisible();
        upperRightMenu.takeScreenshot("LoginIconIsVisible");
        assertTrue(success);
    }
    @Test
    public void CartIsVisibleTest(){
        logger.info("Cart icon is visible");
        Boolean success = upperRightMenu.CartIsVisible();
        upperRightMenu.takeScreenshot("CartIconIsVisible");
        assertTrue(success);
    }


}
