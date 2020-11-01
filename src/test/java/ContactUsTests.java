import pages.ContactUsPage;
import utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactUsTests extends UseCaseBase {
    private static ContactUsPage contactUsPage;
    public static final Logger logger = LogManager.getLogger(ContactUsPage.class);

    @BeforeAll
    public static void classSetup() {
        contactUsPage = new ContactUsPage();
    }

    @BeforeEach
    public void beforeTest() {
        contactUsPage.navigateToMainPage();
    }

    @Test
    public void contactUSPageLoadTest() {
        logger.info("Contact US Page load test");
        contactUsPage = contactUsPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        contactUsPage.takeScreenshot("ContactUSPageLoadTest");
        assertTrue(isLoaded);
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", ",,,,,,,,,", "][{|*dsdnGG", "&&&&&&&&&", "xncbs2"})
    public void NegativeTestOfForm(String text) {
        logger.info("Negative test of form Contact Us");
        boolean error = contactUsPage.formContactUsVerify(text);
        contactUsPage.takeScreenshot("NegativeTestOfForm");
        assertTrue(error);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@yandex.ru", "ASASASAAAaa///////////2222xxxzss,,,,,,@d.ru", "c@c.@ru"})
    public void NegativeTestOfEmailField(String text) {
        logger.info("Error mail field test");
        boolean error = contactUsPage.MailFormVerify(text);
        contactUsPage.takeScreenshot("NegativeTestOfEmailField");
        assertTrue(error);
    }

//    @ParameterizedTest
//     @DisplayName("ERROR!The name field accepts all kinds of values")
//    @ValueSource(strings ={"@&&&&&&", ",,,,,,,,,,,", " ", "qehehshns,,,,,,,,,,,,,,,333333#####", "One of the great American novels, The Adventures of Huckleberry Finn tells the story of Huck Finn and his travels with Jim, an escaped slave. Roundly criticised by contemporary reviewers for its colorful and literal language and even banned by several libraries, it sealed its historical importance in part by being one of the first novels to be written entirely in American vernacular." })
//    public void NegativeTestOfNameField(String text){
//        logger.info("Error name field test");
//        boolean error = contactUsPage.NameFormVerify(text);
//        contactUsPage.takeScreenshot("ErrorNameFieldTest");
//        assertTrue(error);
//    }


}





