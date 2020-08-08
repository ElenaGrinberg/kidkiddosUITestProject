package pages;

import static Consts.Consts.*;

public class LoginPage extends BasePage {

    public void goToLoginPage(){
        goToPage(LOGIN_PAGE_URL);
    }
    public boolean logoLoginPageIsVisible(){
        clickElementByXpath(LOGIN_ICON);
        Boolean isVisible = elementExists(LOGIN_PAGE_LOGO);
        return isVisible;
    }
}
