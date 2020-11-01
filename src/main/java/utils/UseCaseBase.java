package utils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import pages.BasePage;

import org.openqa.selenium.WebDriver;

import java.util.Date;

public class UseCaseBase {

    private static WebDriver webDriver;
    private static BasePage page;

    @BeforeAll
    public static void setupMain(){
        page = new BasePage();
        webDriver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        page.setWebDriver(webDriver);

    }

    public void analyzeLog() {
        LogEntries logEntries = webDriver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
            //do something useful with the data
        }
    }



    @AfterAll
    public static void tearDownMain() {
        SharedDriver.closeDriver();
        webDriver = null;
    }
}
