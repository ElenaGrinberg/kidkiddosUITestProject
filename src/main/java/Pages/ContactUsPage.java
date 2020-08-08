package Pages;

import Consts.Consts;

import static Consts.Consts.MENU_CONTACTS_US_PATH;

public class ContactUsPage extends BasePage {


    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public ContactUsPage openContactUsTab() {
        clickElementByXpath(MENU_CONTACTS_US_PATH);
        return new ContactUsPage();
    }


    public boolean isPageTitleVisible() {
        return elementExists(Consts.CONTACT_US_HEADER);
    }


    public boolean formContactUsVerify(String text) {
        openContactUsTab();
        sendTextToElementByXpath(Consts.FIELD_NAME_PATH, text);
        sendTextToElementByXpath(Consts.FIELD_EMAIL_PATH, text);
        sendTextToElementByXpath(Consts.FIELD_TEXT_MASSAGE, text);
        clickElementByXpath(Consts.SEND_BUTTON);
        boolean value = elementExists(Consts.ERROR_FORM);
        return value;

    }

    public boolean MailFormVerify(String text) {
        openContactUsTab();
        sendTextToElementByXpath(Consts.FIELD_NAME_PATH, "lena");
        sendTextToElementByXpath(Consts.FIELD_EMAIL_PATH, text);
        sendTextToElementByXpath(Consts.FIELD_TEXT_MASSAGE, "One of the great American novels, The Adventures of Huckleberry Finn tells the story of Huck Finn and his travels with Jim, an escaped slave. Roundly criticised by contemporary reviewers for its colorful and literal language and even banned by several libraries, it sealed its historical importance in part by being one of the first novels to be written entirely in American vernacular.\n" +
                "\n" +
                "While Huck Finn is, on its face, an adventure tale for younger readers, it’s also a cutting satire and a nuanced examination of racism and morality. Hemingway called it “the best book we’ve had.”");

        clickElementByXpath(Consts.SEND_BUTTON);
        boolean error = elementExists(Consts.ERROR_MAIL_FIELD);
        return error;
    }
    public boolean NameFormVerify(String text) {
        openContactUsTab();
        sendTextToElementByXpath(Consts.FIELD_NAME_PATH, text);
        sendTextToElementByXpath(Consts.FIELD_EMAIL_PATH, "mama@mama.com");
        sendTextToElementByXpath(Consts.FIELD_TEXT_MASSAGE, "One of the great American novels, The Adventures of Huckleberry Finn tells the story of Huck Finn and his travels with Jim, an escaped slave. Roundly criticised by contemporary reviewers for its colorful and literal language and even banned by several libraries, it sealed its historical importance in part by being one of the first novels to be written entirely in American vernacular.\n" +
                "\n" +
                "While Huck Finn is, on its face, an adventure tale for younger readers, it’s also a cutting satire and a nuanced examination of racism and morality. Hemingway called it “the best book we’ve had.”");

        clickElementByXpath(Consts.SEND_BUTTON);
        boolean error = elementExists(Consts.ERROR_NAME_FIELD);
        return error;


    }
}
