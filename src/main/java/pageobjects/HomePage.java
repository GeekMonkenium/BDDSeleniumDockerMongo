package pageobjects;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverHandler;
import utils.FUtils;

import java.util.List;
import java.util.Map;

public class HomePage  {

    private static WebDriverWait wait;


    @FindBy(how = How.ID,using = "hotelName")
    public WebElement hotelNameWe;

    @FindBy(how = How.ID,using = "address")
    public WebElement addressWe;

    @FindBy(how = How.ID,using = "owner")
    public WebElement ownerWe;

    @FindBy(how = How.ID,using = "phone")
    public WebElement phoneWe;

    @FindBy(how = How.ID,using = "email")
    public WebElement emailWe;

    @FindBy(how = How.ID,using = "createHotel")
    public WebElement createHotelWe;

    @FindBy(how = How.CSS,using = "glyphicon.glyphicon-remove.hotelDelete")
    public WebElement deleteHotelWe;

    public HomePage() {
        this.wait = new WebDriverWait(DriverHandler.getCurrentDriver(), 30);
        PageFactory.initElements(DriverHandler.getCurrentDriver(),this);
    }


    public void createHotel(DataTable dataTable) {
        hotelNameWe.sendKeys(FUtils.getSortedHashMap(dataTable).get("Hotel Name"));
        addressWe.sendKeys(FUtils.getSortedHashMap(dataTable).get("Address"));
        ownerWe.sendKeys(FUtils.getSortedHashMap(dataTable).get("Owner"));
        phoneWe.sendKeys(FUtils.getSortedHashMap(dataTable).get("Phone number"));
        emailWe.sendKeys(FUtils.getSortedHashMap(dataTable).get("Email"));
    }

    public void submitCreation() {
        createHotelWe.click();
    }

    public boolean validateHotelIsCreated(String hotelName, Map<String, String> data) {
        boolean isMatch = true;
        FUtils.waitForJQuery(DriverHandler.getCurrentDriver());
        wait.until(ExpectedConditions.elementToBeClickable(DriverHandler.getCurrentDriver().findElements(By.className("detail")).get(0)));
        List<WebElement> allHotels = DriverHandler.getCurrentDriver().findElements(By.className("detail"));
        String[] actualValues = null;

        for(int i=0; i<allHotels.size();i++){

            String[] candidates =DriverHandler.getCurrentDriver().findElements(By.className("detail")).get(i).getText().split("\n");
            if(candidates[0].equals(hotelName)){
                actualValues =DriverHandler.getCurrentDriver().findElements(By.className("detail")).get(i).getText().split("\n");
                break;
            }
        }
        Object[] expectedValues = data.values().toArray();
        for(int i =0; i < actualValues.length;i++){
            if(!actualValues[i].equals(expectedValues[i].toString())){
                return false;
            }
        }
        return isMatch;
    }

    public void deleteHotel(String hotelName) {
        wait.until(ExpectedConditions.elementToBeClickable(DriverHandler.getCurrentDriver().findElements(By.className("detail")).get(0)));
        List<WebElement> listOfRows = DriverHandler.getCurrentDriver().findElements(By.className("detail"));
        for(int i=0;i<listOfRows.size();i++){
            String hName =DriverHandler.getCurrentDriver().findElements(By.className("detail")).get(i).getText().split("\n")[0];
            if(hotelName.equals(hName))
            {
                DriverHandler.getCurrentDriver().findElements(By.className("detail")).get(i).findElement(By.className("hotelDelete")).click();
            }
        }
    }

    public boolean validateHotelDeletion(String hotelName) {
        List<WebElement> listOfRows = DriverHandler.getCurrentDriver().findElements(By.className("detail"));
        return listOfRows.size()==0;
    }
}
