package pageobjects;

import org.openqa.selenium.support.PageFactory;
import utils.DriverHandler;

public class FooterPage {

    public FooterPage(){
        PageFactory.initElements(DriverHandler.getCurrentDriver(),this);
    }
}
