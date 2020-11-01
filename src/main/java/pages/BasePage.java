package pages;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.UseCaseBase;

import java.io.File;
import java.io.IOException;

public class BasePage extends UseCaseBase {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 5);
    }
    public static void explicitWaitPresenceOfElement(String xpath) {
        WebElement expWait = (new WebDriverWait(webDriver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }


    protected void goToPage(String URL){
        webDriver.get(URL);

    }

    public static boolean errorDisplayed(String xpath){
        logger.info("Error message is displayed: " + xpath);
        WebElement error = webDriver.findElement(By.xpath(xpath));
        try {error.isDisplayed();
            String errorMessage = error.getText();
            System.out.println(errorMessage);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

//    public static String getTextFromMessageError() {
//        return  webDriver.switchTo().alert().getText();
//
//    }




    protected void clickElementByXpath(String xpath) {
        logger.info("Clicking element with xpath: " + xpath);
        findElementByXpath(xpath).click();
    }

    protected void sendTextToElementByXpath(String xpath, String text) {
        findElementByXpath(xpath).sendKeys(text);
    }

    public static boolean elementExists(String xpath) {
        try {
            logger.info("Check element with xpath exists: " + xpath);


            webDriver.findElement(By.xpath(xpath));
            return true;
        } catch (Exception err) {
            return false;
        }
    }

//        public static void moveCursorToElement(String xpath) {
//            WebElement element=webDriver.findElement(By.xpath(xpath));
//            Actions builder = new Actions(webDriver);
//            builder.moveToElement(element).build().perform();
//        }

        public String getTextByPath(String path){
                       return webDriver.findElement(By.xpath(path)).getText();
        }


    protected WebElement findElementByXpath(String xpath) {
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;
    }

    protected String getCurrentPageURL() {
        return webDriver.getCurrentUrl();
    }

    public void takeScreenshot(String name){
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("Screenshots/" + name + ".jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
