package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverHandler;

public class LoginPage {

    private static WebDriverWait wait;


    @FindBy(how = How.ID,using = "username")
    public WebElement userNameWe;

    @FindBy(how = How.ID,using = "password")
    public WebElement passwordWe;

    @FindBy(how = How.ID,using = "doLogin")
    public WebElement loginButtonWe;

    @FindBy(how = How.CSS,using = "btn.btn-default")
    public WebElement closeButtonWe;

    public LoginPage(){
        this.wait = new WebDriverWait(DriverHandler.getCurrentDriver(), 30);
        PageFactory.initElements(DriverHandler.getCurrentDriver(),this);
    }

    public void doLogin(String username, String password) {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        wait.until(ExpectedConditions.elementToBeClickable(userNameWe));
        userNameWe.sendKeys(username);
        passwordWe.sendKeys(password);
        loginButtonWe.click();
    }
}
