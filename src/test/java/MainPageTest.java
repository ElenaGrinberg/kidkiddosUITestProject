import consts.Consts;
import pages.MainPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
        logger.info("Main page load test");
        Boolean success = mainPage.isLogoVisible();
        mainPage.takeScreenshot("MainPageTest");
        assertTrue(success);
    }




    static Stream<Arguments> dataProvider() {

        return Stream.of(
                Arguments.of(Consts.HEBREW_BOOKS_URL, Consts.BOOKS_BY_LANGUAGE, Consts.EMPTY_STRING, Consts.HEBREW_LANGUAGE, Consts.HEBREW_HEAD_PATH),
                Arguments.of(Consts.RUSSIAN_BOOKS_URL, Consts.BOOKS_BY_LANGUAGE, Consts.EMPTY_STRING, Consts.RUSSIAN_LANGUAGE, Consts.RUSSIAN_HEAD_PATH),
                Arguments.of(Consts.HEBREW_EBOOKS_URL, Consts.EBOOKS_BY_LANGUAGE, Consts.EBOOKS_ADD_URL, Consts.HEBREW_LANGUAGE, Consts.HEBREW_EBOOKS_HEAD),
                Arguments.of(Consts.RUSSIAN_EBOOKS_URL, Consts.EBOOKS_BY_LANGUAGE, Consts.EBOOKS_ADD_URL, Consts.RUSSIAN_LANGUAGE, Consts.RUSSIAN_BOOKS_HEAD),
                Arguments.of(Consts.HEBREW_BOOKS_URL, Consts.ALL_LANGUAGES, Consts.EMPTY_STRING, Consts.HEBREW_LANGUAGE, Consts.HEBREW_HEAD_PATH),
                Arguments.of(Consts.RUSSIAN_BOOKS_URL, Consts.ALL_LANGUAGES, Consts.EMPTY_STRING, Consts.RUSSIAN_LANGUAGE, Consts.RUSSIAN_HEAD_PATH),
                Arguments.of(Consts.DANISH_BOOKS_URL, Consts.BOOKS_BY_LANGUAGE, Consts.EMPTY_STRING, Consts.DANISH_LANGUAGE, Consts.DANISH_HEAD_PATH),
                Arguments.of(Consts.DANISH_EBOOK_URL, Consts.EBOOKS_BY_LANGUAGE, Consts.EBOOKS_ADD_URL, Consts.DANISH_LANGUAGE, Consts.DANISH_EBOOK_HEAD)

        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void languagePageOpeningTest(String expectedURL, String menu, String add, String language, String element) {
        logger.info("Language Page opening Test");
        String actualURL = mainPage.openLanguagePage(menu, add, language);
        mainPage.takeScreenshot("LanguagePageOpened");
        boolean elementExist = mainPage.elementExist(element);
        assertEquals(expectedURL, actualURL);
        assertTrue(elementExist);
    }


    static Stream<Arguments> dataProvider2() {

        return Stream.of(
                Arguments.of(Consts.MENU_HOME_PATH, Consts.MENU_HOME_URL, Consts.LOGO_IMG),
                Arguments.of(Consts.MENU_SPANISH_PATH, Consts.MENU_SPANISH_URL,Consts.MENU_SPANISH_HEAD_PATH),
                Arguments.of(Consts.MENU_FRENCH_PATH, Consts.MENU_FRENCH_URL, Consts.MENU_FRENCH_HEAD_PATH),
                Arguments.of(Consts.MENU_BLOG_PATH, Consts.MENU_BLOG_URL, Consts.MENU_BLOG_HEAD),
                Arguments.of(Consts.MENU_FAQS_PATH, Consts.MENU_FAQS_URL, Consts.MENU_FAQS_HEAD),
                Arguments.of(Consts.MENU_CONTACTS_US_PATH, Consts.MENU_CONTACTS_US_URL, Consts.CONTACT_US_HEADER)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider2")
    public void openMenusPage(String menu, String expectedURL, String element){
       String actualURL= mainPage.openTopMenu(menu);
        boolean elementExist = mainPage.elementExist(element);
        assertEquals(expectedURL, actualURL);
        assertTrue(elementExist);

    }

    @Test
    public void ResourcesVideoMenu(){
        logger.info("Video from the Resources page load test");
        String actualURL= mainPage.testResourcesMenu(Consts.MENU_RESOURCES_PATH, Consts.MENU_VIDEO_PATH);
        String expectedURL = Consts.MENU_VIDEO_URL;
        mainPage.takeScreenshot("VideoPageOpened");
        assertEquals(expectedURL, actualURL);


    }

    @Test
    public void ResourcesBlogMenu() {
        logger.info("Blog from the Resources page load test");
        String actualURL = mainPage.testResourcesMenu(Consts.MENU_RESOURCES_PATH, Consts.MENU_BLOG_PATH);
        String expectedURL = Consts.MENU_BLOG_URL;
        mainPage.takeScreenshot("BlobMenuPageOpened");
        assertEquals(expectedURL, actualURL);

    }




}
