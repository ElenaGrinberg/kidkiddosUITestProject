package pages;

import Consts.Consts;


public class MainPage extends BasePage{



    public void navigateToMainPage(){
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible(){
       Boolean isVisible =  elementExists(Consts.LOGO_IMG);
       return isVisible;
    }
     public boolean elementExist(String element){
        Boolean elementExist = elementExists(element);
        return elementExist;
     }



    public String openTopMenu(String menu){
        clickElementByXpath(menu);
        return getCurrentPageURL();
    }

    public String testResourcesMenu(String resources, String menu){
        clickElementByXpath(resources);
        clickElementByXpath(menu);
        return getCurrentPageURL();
    }

    public String openLanguagePage(String menu, String add, String language) {
        clickElementByXpath(String.format(Consts.LIST_MENU_PATH, add, menu));
        clickElementByXpath(String.format(Consts.LANG_BOOKS_PATH, menu, language));
        return getCurrentPageURL();
    }

}
