package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverHandler;
import utils.FUtils;

public class NavigationPage {

    private WebDriverWait wait;

    @FindBy(how = How.LINK_TEXT,using = "Hotel Management Platform")
    public WebElement hotelManagementPlatformWe;

    @FindBy(how = How.LINK_TEXT,using = "Home")
    public WebElement homeWe;

    @FindBy(how = How.LINK_TEXT,using = "Logout")
    public WebElement logoutWe;

    @FindBy(how = How.LINK_TEXT,using = "Login")
    public WebElement loginWe;

    @FindBy(how = How.ID,using = "search")
    public WebElement searchWe;

    public NavigationPage(){
        this.wait = new WebDriverWait(DriverHandler.getCurrentDriver(), 30);
        PageFactory.initElements(DriverHandler.getCurrentDriver(),this);
    }

    public void goToHotelManagementPlatform(){
        hotelManagementPlatformWe.click();
    }

    public void goToHomePage(){
        homeWe.click();
    }

    public LoginPage goToLoginPage(){
        loginWe.click();
        return new LoginPage();
    }

    public Boolean isLoggedIn(){
        return logoutWe.isDisplayed();
    }

    public void doSearch(){
    }

    public void logout() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        FUtils.waitForJQuery(DriverHandler.getCurrentDriver());
        wait.until(ExpectedConditions.elementToBeClickable(logoutWe));
        ((JavascriptExecutor) DriverHandler.getCurrentDriver()).executeScript("arguments[0].scrollIntoView(true);", logoutWe);
        logoutWe.click();
    }

}
