package pages;

import static consts.Consts.*;

public class UpperRightMenu extends BasePage {


    public void goToContactUsPage() {
        goToPage(MENU_CONTACTS_US_URL);
    }

    public boolean loginIconIsVisible() {

        return elementExists(LOGIN_ICON);
    }

    public boolean CartIsVisible() {
        return elementExists(CART_PATH);
    }

    public String openLoginPage() {
        clickElementByXpath(LOGIN_ICON);

        return getCurrentPageURL();
    }

    public String getCurrentURL() {
        return getCurrentPageURL();
    }

    public String addBookToCart() {
        goToPage(BOOK_FOR_BUY_URL);
        clickElementByXpath(BUTTON_ADD_PATH);
        explicitWaitPresenceOfElement(CART_COUNT_PATH);
        String cartCount = getTextByPath(CART_COUNT_PATH);
        System.out.println("AddBookToCart method " + cartCount);
        return cartCount;

    }

    public boolean counterExist() {
        return elementExists(CART_COUNT_PATH);
    }


    public void removeBookFromCart() {
        goToPage(BOOK_FOR_BUY_URL);
        clickElementByXpath(BUTTON_ADD_PATH);
        explicitWaitPresenceOfElement(CART_COUNT_PATH);
        clickElementByXpath(BUTTON_REMOVE_PATH);
    }
}








