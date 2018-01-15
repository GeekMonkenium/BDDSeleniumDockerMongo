package hotelmanagement;

import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.NavigationPage;
import utils.Context;
import utils.DriverHandler;
import utils.FUtils;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public class HotelManagementStepDef {

    HomePage homePage;
    NavigationPage navigationPage;
    LoginPage loginPage;

    private WebDriverWait wait;
    public static Logger LOGGER = Logger.getLogger(HotelManagementStepDef.class);
    String url = null;
    Map<String, String> data;
    WebDriver driver;

    @Before()
    public void init() {
        LOGGER.info("UI : Initializing Automation State");
        homePage = new HomePage();
        navigationPage = new NavigationPage();
        loginPage = new LoginPage();
        try {
            Context context = FUtils.readConfig();
            url = context.getApplicationURL();
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver = DriverHandler.getCurrentDriver();
        driver.get(url);

    }

    @Given("^the user go to the Hotel Management Platform$")
    public void theUserGoToTheHotelManagementPlatform() throws Throwable {

    }

    @And("^user logs in as (.*) into the system with password (.*)$")
    public void userLogsInAsAdminIntoTheSystemWithPasswordPassword(String username, String password) throws Throwable {
        LOGGER.info(String.format("UI : Login using username %s password %s", username, password));
        navigationPage.goToLoginPage();
        loginPage.doLogin(username,password);
    }

    @And("^user logs in successfully$")
    public void userLogsInSuccessfully() throws Throwable {
        LOGGER.info("UI : Validating successful login");
        navigationPage.isLoggedIn();
    }

    @When("^the user creates a hotel as hotel$")
    public void theUserCreatesAHotelAsHotel(DataTable dataTable) throws Throwable {
        LOGGER.info("UI : Creating hotel");
        data = (LinkedHashMap<String, String>) FUtils.getSortedHashMap(dataTable);
        homePage.createHotel(dataTable);
    }

    @And("^the user selects create$")
    public void theUserSelectsCreate() throws Throwable {
        LOGGER.info("UI : Click create to register hotel");
        homePage.submitCreation();
    }

    @And("^the user logs out$")
    public void theUserLogsOut() throws Throwable {
        LOGGER.info("UI : User Logs out of the application");
        navigationPage.logout();
    }

    @Then("^the hotel with <Hotel Name> is succesfully created$")
    public void theHotelWithHotelNameIsSuccesfullyCreated() throws Throwable {
    }

    @When("^the user deletes (.*)$")
    public void theUserDeletesTheFollowingHotel(String hotelName) throws Throwable {
        homePage.deleteHotel(hotelName);
    }

    @Then("^the (.*) is deleted successfully$")
    public void theHotelNameIsDeletedSuccessfully(String hotelName) throws Throwable {
        homePage.validateHotelDeletion(hotelName);
    }

    @Then("^(.*) is created successfully$")
    public void hotelNameIsCreatedSuccessfully(String hotelName) throws Throwable {
        Assert.assertTrue("ERROR : Unable to create hotel successfully",homePage.validateHotelIsCreated(hotelName,data));
    }

    @After({"@HotelManagement"})
    public void stop(Scenario scenario)
    {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Microsoft Windows 10 PRO");
        Reporter.setTestRunnerOutput("Output Message");

        if(scenario.isFailed()) {
            FUtils.captureScreen(scenario);
        }
    }

}