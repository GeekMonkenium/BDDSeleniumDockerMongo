package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 30413 on 14/01/2018.
 */
public class FUtils {

    public static Context readConfig() throws Exception {
        Object dataMap;
        Type type = new TypeToken<Map<String, Object>>() {}.getType();
        Object envContext = ((Map<String, Object>)  new Gson().fromJson(new FileReader("./src/test/resources/environment.json"), type)).get(System.getProperty("Environment"));
        dataMap = ((Map<String, Object>) ((envContext))).get(System.getProperty("Environment"));
        return new Context((Map<String, Object>)dataMap);
    }

    public static Map<String, String> getSortedHashMap(DataTable dataTable) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        for (List<String> drIn : dataTable.asLists(String.class)) {
            System.out.print(drIn);
            map.put(drIn.get(0), drIn.get(1));
        }
        return map;
    }
    public static void captureScreen(Scenario scenario) {
        // try {
        WebDriver augmentedDriver = new Augmenter().augment(DriverHandler.getCurrentDriver());
        byte[] screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }

    public static void waitForJQuery(WebDriver driver) {
        (new WebDriverWait(driver, 240)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                JavascriptExecutor js = (JavascriptExecutor) d;
                System.out.println("The value for jquery.active is : " + js.executeScript("return jQuery.active"));
                return (Boolean) js.executeScript("return !!window.jQuery && window.jQuery.active == 0");
            }
        });
    }

    public static File getFile(String fileName) {
        return getFile(fileName, true);
    }

    public static File getFile(String fileName, boolean throwErrorOnFileNotFound) {
        File file = new File(fileName);
        if (!file.exists()) file = FileUtils.toFile(FUtils.class.getClassLoader().getResource(fileName));
        if (throwErrorOnFileNotFound && (file == null || !file.exists()))
            throw new RuntimeException("File '" + fileName + "' does not exist");
        return (file != null && file.exists() ? file : null);
    }

    public static boolean fileExists(String fileName) {
        return getFile(fileName, false) != null;
    }

}
