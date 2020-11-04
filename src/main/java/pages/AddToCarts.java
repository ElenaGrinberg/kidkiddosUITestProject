package pages;

import consts.Consts;
import org.junit.jupiter.api.Test;

import static consts.Consts.*;
import static consts.Consts.CART_COUNT_PATH;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AddToCarts extends BasePage {

    public void navigateToEnglishBooksPage() {
        webDriver.get(Consts.ENGLISH_BOOKS_URL);
    }

    public String addTwoEnglishBooksToCart() {
        clickElementByXpath(FIRST_BOOK);
        clickElementByXpath(BUTTON_ADD_PATH);
        goToPage(ENGLISH_BOOKS_URL);
        clickElementByXpath(SECOND_BOOK);
        clickElementByXpath(BUTTON_ADD_PATH);
        explicitWaitPresenceOfElement(CART_COUNT_PATH);
        String cartCount = getTextByPath(CART_COUNT_PATH);
        System.out.println("AddBookToCart method " + cartCount);
        return cartCount;
    }

    public String addFourBooksOtherLangToCart(){
        String SpanishBooksUrl = "https://kidkiddos.com/collections/spanish";
        String FistSpanishBookPath = "//div[@class = 'h4 grid-view-item__title'][contains(text(), 'Coloring Book')]";
        String SecondSpanishBookPatch = "//div[@class = 'h4 grid-view-item__title'][contains(text(), 'I Love Autumn')]";
        String RussianBooksURL = "https://kidkiddos.com/collections/ebooks-in-russian";
        String FistRussianBookPath = "//div[@class = 'h4 grid-view-item__title'][contains(text(), 'I Love My Dad')]";
        String SecondRussianBookPatch = "//div[@class = 'h4 grid-view-item__title'][contains(text(), 'I Love to Sleep in My Own Bed')]";


        goToPage(SpanishBooksUrl);

        clickElementByXpath(FistSpanishBookPath);
        clickElementByXpath(BUTTON_ADD_PATH);
        goToPage(ENGLISH_BOOKS_URL);
        clickElementByXpath(SecondSpanishBookPatch);
        clickElementByXpath(BUTTON_ADD_PATH);

        goToPage(RussianBooksURL);
        clickElementByXpath(FistRussianBookPath);
        clickElementByXpath(BUTTON_ADD_PATH);
        goToPage(RussianBooksURL);
        clickElementByXpath(SecondRussianBookPatch);
        clickElementByXpath(BUTTON_ADD_PATH);

        explicitWaitPresenceOfElement(CART_COUNT_PATH);
        String cartCount = getTextByPath(CART_COUNT_PATH);
        System.out.println("AddBookToCart method " + cartCount);
        return cartCount;
    }



}
