package pages;

import static consts.Consts.*;

public class UpperRightMenu extends BasePage {


    public void goToContactUsPage() {
        goToPage(MENU_CONTACTS_US_URL);
    }

    public boolean loginIconIsVisible() {
        Boolean isVisible = elementExists(LOGIN_ICON);
        return isVisible;
    }

    public boolean CartIsVisible() {
        Boolean isVisible = elementExists(CART_PATH);
        return isVisible;
    }

    public String openLoginPage() {
        clickElementByXpath(LOGIN_ICON);
        String pageURL = getCurrentPageURL();
        return pageURL;
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

    public boolean counterExist(){
        return elementExists(CART_COUNT_PATH);
    }


    public void removeBookFromCart() {
        goToPage(BOOK_FOR_BUY_URL);
        clickElementByXpath(BUTTON_ADD_PATH);
        explicitWaitPresenceOfElement(CART_COUNT_PATH);
        clickElementByXpath(BUTTON_REMOVE_PATH);
    }
}








