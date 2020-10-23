package consts;

public class Consts {
    public static final String MAIN_URL = "https://kidkiddos.com/";
    public static final String LIST_MENU_PATH = "//a[@href='/collections%s'][@aria-controls='SiteNavLabel-%s']";
    public static final String LANG_BOOKS_PATH = "//div[@id='SiteNavLabel-%s']//a[contains(text(), '%s')]";
    public static final String HEBREW_LANGUAGE = "Hebrew";
    public static final String HEBREW_HEAD_PATH = "//div[@class='section-header text-center']//h1[contains(text(),'Hebrew')]";
    public static final String RUSSIAN_LANGUAGE = "Russian";
    public static final String RUSSIAN_HEAD_PATH = "//div[@class='section-header text-center']//h1[contains(text(),'Russian')]";
    public static final String HEBREW_BOOKS_URL = "https://kidkiddos.com/collections/hebrew";
    public static final String BOOKS_BY_LANGUAGE = "books-by-language";
    public static final String EBOOKS_BY_LANGUAGE = "ebooks-by-language";
    public static final String ALL_LANGUAGES = "all-languages";
    public static final String RUSSIAN_BOOKS_URL ="https://kidkiddos.com/collections/russian";
    public static final String RUSSIAN_BOOKS_HEAD = "//div[@class='section-header text-center']//h1[contains(text(),'eBooks in Russian')]";
    public static final String RUSSIAN_EBOOKS_URL ="https://kidkiddos.com/collections/ebooks-in-russian";
    public static final String HEBREW_EBOOKS_URL="https://kidkiddos.com/collections/ebooks-in-hebrew";
    public static final String HEBREW_EBOOKS_HEAD="//div[@class='section-header text-center']//h1[contains(text(),'eBooks in Hebrew')]";
    public static final String EBOOKS_ADD_URL = "/ebooks";
    public static final String EMPTY_STRING = "";
    public static final String DANISH_LANGUAGE = "Danish";
    public static final String DANISH_HEAD_PATH = "//div[@class='section-header text-center']//h1[contains(text(),'Danish')]";;

    public static final String DANISH_BOOKS_URL ="https://kidkiddos.com/collections/danish";
    public static final String DANISH_EBOOK_HEAD ="//div[@class='section-header text-center']//h1[contains(text(),'eBooks in Danish')]";
    public static final String DANISH_EBOOK_URL ="https://kidkiddos.com/collections/ebooks-in-danish-dansk";
    public static final String MENU_HOME_PATH = "//a[@class='site-nav__link site-nav__link--main'][text()='Home']";
    public static final String MENU_SPANISH_PATH="//a[@class='site-nav__link site-nav__link--main'][text()='Español']";
    public static final String MENU_SPANISH_HEAD_PATH= "//div[@class='section-header text-center']//h1[contains(text(),'Spanish')]";
    public static final String MENU_FRENCH_PATH="//a[@class='site-nav__link site-nav__link--main'][text()='Français']";
    public static final String MENU_FRENCH_HEAD_PATH="//div[@class='section-header text-center']//h1[contains(text(),'Français')]";
    public static final String MENU_RESOURCES_PATH="//a[@class='site-nav__link site-nav__link--main'][@aria-controls='SiteNavLabel-resources']";
    public static final String MENU_VIDEO_PATH= "//a[@class='site-nav__link site-nav__child-link'][text()='Videos']";
    public static final String MENU_FAQS_PATH ="//a[@class='site-nav__link site-nav__link--main'][text()='FAQs']";
    public static final String MENU_FAQS_HEAD = "//div[@class='section-header text-center']//h1[contains(text(),'FAQ/addition')]";
    public static final String MENU_BLOG_PATH ="//a[@class='site-nav__link site-nav__link--main'][text()='Blog']";
    public static final String MENU_BLOG_HEAD = "//header[@class='section-header text-center']//h1[contains(text(),'Blog')]";
    public static final String MENU_CONTACTS_US_PATH= "//a[@class='site-nav__link site-nav__link--main'][text()='Contact us']";
    public static final String MENU_HOME_URL ="https://kidkiddos.com/";
    public static final String MENU_SPANISH_URL="https://kidkiddos.com/collections/spanish";
    public static final String MENU_FRENCH_URL="https://kidkiddos.com/collections/french";
    public static final String MENU_VIDEO_URL="https://kidkiddos.com/pages/videos-for-kids";
    public static final String MENU_FAQS_URL="https://kidkiddos.com/pages/faq";
    public static final String MENU_CONTACTS_US_URL="https://kidkiddos.com/pages/contact-us";
    public static final String MENU_BLOG_URL = "https://kidkiddos.com/blogs/all-blog-posts";
    public static final String LOGO_IMG = "//img[@itemprop='logo']";
    public static final String CONTACT_US_HEADER = "//h1[text()='Contact us']";
    public static final String FIELD_NAME_PATH="//input[@data-name='first_name']";
    public static final String FIELD_EMAIL_PATH = "//input[@data-name='email']";
    public static final String FIELD_TEXT_MASSAGE = "//textarea[@name='field[7]']";
    public static final String SEND_BUTTON = "//button[@id='_form_44_submit']";
    public static final String ERROR_FORM = "//div[@class='_error-inner']";
    public static final String ERROR_NAME_FIELD = "//div[@class='_error-inner'][contains(text(), 'required')]";
    public static final String ERROR_MAIL_FIELD = "//div[@class='_error-inner'][contains(text(), 'valid email')]";

    //upper right menu
    public static final String LOGIN_ICON ="//a[@class='site-header__account']";
    public static final String LOGIN_PAGE_URL = "https://kidkiddos.com/account/login";
    public static final String LOGIN_PAGE_LOGO = "//h1[text()='Login']";
    public static final String LOGIN_EMAIL ="//input[@id='CustomerEmail']";
    public static final String LOGIN_PASSWORD ="//input[@id='CustomerPassword']";
    public static final String LOGIN_PAGE_RECOVERY_PASSWORD ="//a[@id='RecoverPassword']";
    public static final String BUTTON_SIGN_IN ="//input[@value='Sign In']";
    public static final String CREATE_ACCOUNT_PATH ="//a[@id='customer_register_link']";
    public static final String CREATE_ACCOUNT_LOGO_PAGE ="//h1[text()='Create Account']";
    public static final String CREATE_ACCOUNT_LINK ="https://kidkiddos.com/account/register";
    public static final String CART_PATH ="//a[@href='/cart']";
    public static final String CART_COUNTER ="//div[@id='CartCount']";
    public static final String BOOKS_COUNTER ="//div[@id='CartCount']//span[%]";

    //Create Account Page
    public static final String CREATE_ACCOUNT_PAGE_URL = "https://kidkiddos.com/account/register";
    public static final String FIRST_MAME_FIELD ="//input[@id='FirstName']";
    public static final String LAST_MAME_FIELD ="//input[@id='LastName']";
    public static final String EMAIL_FIELD ="//input[@id='Email']";
    public static final String PASSWORD_FIELD ="//input[@id='CreatePassword']";
    public static final String CREATE_BUTTON ="//input[@type='submit']";
    public static final String TEXT_ERROR_EMAIL = "//*[contains(text(), 'include')]";























}
