package utils;


import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static utils.BrowserFactory.ScreenShotRemoteWebDriver.getChromeDriver;

public class BrowserFactory {

    private static final Logger LOGGER = Logger.getLogger(BrowserFactory.class);
    static final String LOCAL_SELENIUM_GRID_URL = "http://localhost:4444/wd/hub";
    public static final String BROWSER_TYPE = System.getProperty("Browser");
    public static final String REMOTE_BROWSER = System.getProperty("Remote");
    static WebDriver driver;

    public static WebDriver getBrowser() {
        LOGGER.info("getBrowser()");
        WebDriver mBrowser;
        String browserType = BROWSER_TYPE;
        // browserType="ie11";

        switch (browserType) {

            case "Chrome":
                mBrowser = getChromeDriver();
                break;
            case "Headless":
                mBrowser = getPhantomDriver();
                break;
            default:
                mBrowser = getChromeDriver();
        }
        return mBrowser;
    }


    private static WebDriver getPhantomDriver() {
        LOGGER.info("Getting PhantomJS();");
        WebDriver phantomBrowser;
        //Phantom will run locally due to implementation of phantomjs.exe file, please review?
        String remoteValue = REMOTE_BROWSER;
        String phantomjs_dir = "src//main//resources";
        try {
            LOGGER.info("Preparing local phantomjs profile");
            DesiredCapabilities phantom = new DesiredCapabilities();
            phantom.setJavascriptEnabled(true);
            phantom.setCapability("takeSceenshot", true);
            phantom.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, phantomjs_dir + "//phantomjs.exe");
            phantomBrowser = new PhantomJSDriver(phantom);

        } catch (Exception e) {
            LOGGER.info("Error to Open Phantom Driver " + e.getMessage());
            throw new RuntimeException("Cannot Start Browser Factory " + e);
        }
        return phantomBrowser;
    }

    public static class ScreenShotRemoteWebDriver extends RemoteWebDriver implements TakesScreenshot {
        public ScreenShotRemoteWebDriver(URL url, DesiredCapabilities dc) {
            super(url, dc);
        }


//        public static WebDriver getFirefoxBrowser(String version) {
//            LOGGER.info("getFirefoxBrowser()");
//            WebDriver mBrowser;
//            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\geckodriver.exe");
//            try {
//                String remoteValue = REMOTE_BROWSER;
//                if (remoteValue != null && remoteValue.equalsIgnoreCase("true")) {
//                    LOGGER.info("Getting remote firefox web driver");
//                    LOGGER.info("Preparing local firefox profile");
//                    FirefoxProfile profile = new FirefoxProfile();
//                    profile.setPreference("browser.download.folderList", 2);
//                    profile.setPreference("browser.download.manager.showWhenStarting", false);
//                    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/jpg, text/csv,text/xml,application/xml,application/vnd.ms-excel,application/x-excel,application/x-msexcel,application/excel,application/pdf, application/csv");
//                    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv");
////                profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
//                    profile.setPreference("browser.download.dir", System.getProperty("user.home"));
//                    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/xlsx,application/octet-stream,application/x-msdos-program, application/x-unknown-application-octet-stream, application/vnd.ms-powerpoint, application/excel, application/vnd.ms-publisher, application/x-unknown-message-rfc822, application/vnd.ms-excel, application/msword, application/x-mspublisher, application/x-tar, application/zip, application/x-gzip,application/x-stuffit,application/vnd.ms-works, application/powerpoint, application/rtf, application/postscript, application/x-gtar, video/quicktime, video/x-msvideo, video/mpeg, audio/x-wav, audio/x-midi, audio/x-aiff,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml");
//                    profile.setAcceptUntrustedCertificates(true);
//                    profile.setAssumeUntrustedCertificateIssuer(false);
//                    DesiredCapabilities firefox = DesiredCapabilities.firefox();
//                    //   firefox.setVersion(version);
//                    firefox.setPlatform(Platform.ANY);
////                firefox.setCapability("marionette", true);
//                    firefox.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
//                    firefox.setCapability(FirefoxDriver.PROFILE, profile);
//                    mBrowser = new ScreenShotRemoteWebDriver(new URL(LOCAL_SELENIUM_GRID_URL), firefox);
//
//                    //Uncomment line below to enable remote testing from your build machine with VM images
////                mBrowser = new RemoteWebDriver(new URL("http://9.79.12.251:4444/wd/hub"), DesiredCapabilities.firefox());
//
//                    mBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                    //mBrowser.manage().window().setPosition(new Point(0,0));
//                    //java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
//                    //Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
//                    //mBrowser.manage().window().setSize(dim);
//
//                } else {
//                    LOGGER.info("Preparing local firefox profile");
//                    FirefoxProfile profile = new FirefoxProfile();
//                    profile.setPreference("browser.download.folderList", 2);
//                    profile.setPreference("browser.download.manager.showWhenStarting", false);
//                    profile.setPreference("browser.helperApps.alwaysAsk.force", false);
//                    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream,image/jpg, text/csv,text/xml,application/xml,application/vnd.ms-excel,application/x-excel,application/x-msexcel,application/excel,application/pdf, application/csv");
//                    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/xlsx,application/octet-stream,application/x-msdos-program, application/x-unknown-application-octet-stream, application/vnd.ms-powerpoint, application/excel, application/vnd.ms-publisher, application/x-unknown-message-rfc822, application/vnd.ms-excel, application/msword, application/x-mspublisher, application/x-tar, application/zip, application/x-gzip,application/x-stuffit,application/vnd.ms-works, application/powerpoint, application/rtf, application/postscript, application/x-gtar, video/quicktime, video/x-msvideo, video/mpeg, audio/x-wav, audio/x-midi, audio/x-aiff,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml");
//
//                    // profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv");
//                    //  profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
//                    // profile.setPreference("browser.helperApps.neverAsk.saveToDisk",default)
//                    profile.setPreference("browser.download.dir", System.getProperty("user.home"));
//
//                    LOGGER.info("Getting local firefox web driver");
//
//                    mBrowser = createFirefoxDriver(profile);
//                }


//            } catch (Exception e) {
//                LOGGER.error("Could not start browser for reason " + e.getMessage());
//                throw new RuntimeException("could not start Browser Factory", e);
//            }
//            return mBrowser;
//        }

//        private static WebDriver createFirefoxDriver(FirefoxProfile firefoxProfile) {
//            FirefoxOptions options = new FirefoxOptions();
//            options.setProfile(firefoxProfile);
//
//            WebDriver mBrowser = null;
//            DesiredCapabilities firefox = DesiredCapabilities.firefox();
//            mBrowser = new FirefoxDriver(options);
//            mBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//            mBrowser.manage().window().setPosition(new Point(0, 0));
//            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
//            Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
//            return mBrowser;
//        }

        private static FirefoxProfile getFirefoxProfile(boolean mobileAgent) throws IOException {
            File file = FUtils.getFile("firebug/firebug-1.9.2.xpi");
            FirefoxProfile firefoxProfile = new FirefoxProfile();
            firefoxProfile.addExtension(file);
            // Reference: http://getfirebug.com/wiki/index.php/Firebug_Preferences
            firefoxProfile.setPreference("extensions.firebug.currentVersion", "1.9.2");  // Avoid startup screen
            firefoxProfile.setPreference("extensions.firebug.script.enableSites", true);
            firefoxProfile.setPreference("extensions.firebug.console.enableSites", true);
            firefoxProfile.setPreference("extensions.firebug.allPagesActivation", true);
            firefoxProfile.setPreference("extensions.firebug.delayLoad", false);
            if (mobileAgent) {
                firefoxProfile.setPreference("general.useragent.override", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16");
                //firefoxProfile.setPreference("general.useragent.override", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 crap/7A341 Safari/528.16");
            }
            return firefoxProfile;
        }


        public static WebDriver getChromeDriver() {
            LOGGER.info("getChromeDriver()");
            WebDriver mBrowser;
            String remoteValue = REMOTE_BROWSER;

            try {

                if (remoteValue != null && remoteValue.equalsIgnoreCase("true")) {
                    LOGGER.info("Getting remote chrome web driver");
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
                    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                    chromePrefs.put("profile.default_content_settings.popups", 0);


                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", chromePrefs);
                    options.addArguments("--start-maximized");
                    options.addArguments("--disable-infobars");

                    DesiredCapabilities chrome = DesiredCapabilities.chrome();
                    chrome.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
                    chrome.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
                    chrome.setCapability(ChromeOptions.CAPABILITY, options);

                    mBrowser = new ScreenShotRemoteWebDriver(new URL(LOCAL_SELENIUM_GRID_URL), chrome);
                } else {

                    LOGGER.info("Getting local chrome web driver");
                    DesiredCapabilities chrome = DesiredCapabilities.chrome();

                    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                    chromePrefs.put("profile.default_content_settings.popups", 0);

                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", chromePrefs);
                    options.addArguments("--start-maximized");
                    options.addArguments("--disable-infobars");

                    System.out.println(System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");

                    chrome.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
                    chrome.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
                    chrome.setCapability(ChromeOptions.CAPABILITY, options);
                    mBrowser = new ChromeDriver(options);

                }

                mBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            } catch (Exception e) {
                LOGGER.info("Error with chrome driver initialisation. " + e.getMessage());
                e.printStackTrace();
                return null;
            }
            return mBrowser;
        }

        private static WebDriver getIEDriver(String version) {
            LOGGER.info("getIEBrowser()");
            WebDriver mBrowser;

            try {
                String remoteValue = System.getProperty(AutomationConstants.REMOTE_BROWSER);
                DesiredCapabilities ie = DesiredCapabilities.internetExplorer();
                ie.setPlatform(Platform.ANY);
                ie.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
                if (remoteValue != null && remoteValue.equalsIgnoreCase("true")) {
                    ie.setVersion(version);
                    LOGGER.info("Getting remote IE" + version + " web driver");
                    mBrowser = new ScreenShotRemoteWebDriver(new URL(LOCAL_SELENIUM_GRID_URL), ie);
                } else {
                    LOGGER.info("Getting local IE web driver");
                    //System.setProperty("webdriver.ie.driver", "C:/Users/Lewis.Prescott/IEDriver/IEDriverServer.exe");
                    mBrowser = new InternetExplorerDriver(ie);
                }
                mBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                //mBrowser.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

            } catch (Exception e) {
                LOGGER.info("Error with ie initialisation. Version " + version);
                LOGGER.info(e.getMessage());
                return null;
            }
            return mBrowser;
        }


        private static FirefoxProfile getProfile() throws IOException {
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.download.folderList", 2);
            profile.setPreference("browser.download.manager.showWhenStarting", false);
            profile.setPreference("browser.helperApps.alwaysAsk.force", false);
            profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                    "application/octet-stream,image/jpg, text/csv,text/xml,application/xml,application/vnd.ms-excel," +
                            "application/x-excel,application/x-msexcel,application/excel,application/pdf, application/csv");
            return profile;
        }

        public static void tearDown() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }
}
