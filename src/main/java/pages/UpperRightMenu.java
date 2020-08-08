package pages;

import static Consts.Consts.*;

public class UpperRightMenu extends BasePage{


    public void goToContactUsPage(){
        goToPage(MENU_CONTACTS_US_URL);
    }

    public boolean  loginIconIsVisible(){
        Boolean isVisible =  elementExists(LOGIN_ICON);
        return isVisible;
    }

    public boolean CartIsVisible(){
        Boolean isVisible = elementExists(CART_PATH);
        return isVisible;
    }

}
