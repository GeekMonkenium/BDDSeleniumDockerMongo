package hotelmanagement;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.DriverHandler;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@HotelManagement",
        format = {"pretty", "html:target/HotelManagement/cucumber", "json:target/HotelManagement/cucumber.json"},
        features = "src/test/resources/cucumber/",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:reports/reports.html"})
public class RunHotelManagement {
    @AfterClass
    public static void teardown(){
        DriverHandler.quit();
    }
}