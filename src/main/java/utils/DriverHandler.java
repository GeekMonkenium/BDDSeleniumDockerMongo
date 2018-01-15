package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DriverHandler {
    private static final Logger LOGGER = Logger.getLogger(DriverHandler.class);
    private static final Integer DEFAULT_WAIT_SECONDS = 120;
    private static final int TWENTY_SECONDS = 20;
    private static WebDriver mDriver;
    public final static WebElement NULL_WEB_ELEMENT = new RemoteWebElement();
    private static long timer = 0;
    private static final String NULL_STRING = new String();

    public static WebElement findElement(By by) {
        return findElement(by, 30);
    }

    public static WebElement findElement(By by, long waitInSeconds) {
        FluentWait<WebDriver> webDriverFluentWait = new WebDriverWait(mDriver, waitInSeconds).pollingEvery(1, TimeUnit.SECONDS).withMessage("Could not find Element");
        return webDriverFluentWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public static WebDriver getCurrentDriver() {
        try {
            if (mDriver == null) {
                LOGGER.info("mDriver is null - get new webdriver");
                mDriver = BrowserFactory.getBrowser();
                //   Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
        } catch (UnreachableBrowserException e) {
            LOGGER.error("get new webdriver, UnreachableBrowserException thrown");
            mDriver = BrowserFactory.getBrowser();
        } catch (WebDriverException e) {
            LOGGER.error("get new webdriver, WebDriverException thrown");
            mDriver = BrowserFactory.getBrowser();
        }
        return mDriver;
    }

    public static void quit() {
        if (mDriver != null) {
            mDriver.close();
            mDriver.quit();
            mDriver = null;
        }
    }

    public static void close() {
        try {
            if (mDriver != null) {
                getCurrentDriver().quit();
                mDriver = null;
                LOGGER.info("~~~~~~~~~  browser closed ~~~~~~~~~");
            } else {
                LOGGER.info("~~~~~~~~~  browser was not open ~~~~~~~~~");
            }
        } catch (UnreachableBrowserException e) {

            LOGGER.info("CANNOT QUIT BROWSER. UnreachableBrowserException thrown");
        }
    }

}
