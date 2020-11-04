import consts.Consts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.AddToCarts;
import pages.ContactUsPage;
import utils.UseCaseBase;

import static org.junit.jupiter.api.Assertions.*;

public class AddBooksToCartTest extends UseCaseBase {
    public static final Logger logger = LogManager.getLogger(AddBooksToCartTest.class);
    private static AddToCarts addToCarts;

    @BeforeAll
    public static void classSetup() {

        addToCarts = new AddToCarts();
    }

    @BeforeEach
    public void beforeTest() {
        addToCarts.navigateToEnglishBooksPage();
    }

    @Test
    public void addTwoBookToCartTest() {
        String cartCounter = addToCarts.addTwoEnglishBooksToCart();
        assertNotNull(cartCounter);
        assertEquals("2", cartCounter);
    }

    @Test
    public void addFourOthersLangBookTest(){
        String cartCounter = addToCarts.addFourBooksOtherLangToCart();
        assertNotNull(cartCounter);
        assertEquals("4", cartCounter);

    }



}
