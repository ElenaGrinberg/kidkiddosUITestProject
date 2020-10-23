package pages;

import static consts.Consts.*;

public class LoginPage extends BasePage {

    public void goToLoginPage(){
        goToPage(LOGIN_PAGE_URL);
    }
    public boolean logoLoginPageIsVisible(){
        clickElementByXpath(LOGIN_ICON);
        Boolean isVisible = elementExists(LOGIN_PAGE_LOGO);
        return isVisible;
    }
    public boolean createAccountLink(){
        clickElementByXpath(CREATE_ACCOUNT_PATH);
        Boolean isVisible = elementExists(CREATE_ACCOUNT_LOGO_PAGE);
        return isVisible;
    }

    public boolean openForgotPasswordPage(){
        clickElementByXpath(FORGOT_PASSWORD_PATH);
        boolean isVisible = elementExists(RESET_PASS_LOGO_PATH);
        return isVisible;
    }
    public void creativeAccountMailFieldNegative(String text) {
        clickElementByXpath(CREATE_ACCOUNT_PATH);
        sendTextToElementByXpath(FIRST_MAME_FIELD, text);
        sendTextToElementByXpath(LAST_MAME_FIELD, text);
        sendTextToElementByXpath(EMAIL_FIELD, text);
        sendTextToElementByXpath(PASSWORD_FIELD, text);
        clickElementByXpath(CREATE_BUTTON);

    }


        public boolean isErrorMessage(String path){
        boolean errorMessage = errorDisplayed(path);
        return errorMessage;

    }

    public String getURLPage(){
        return getCurrentPageURL();

    }
}
