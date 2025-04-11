package pages;

import uistore.BloodManageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BloodManageActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
    public void bloodMethod(){
       
        driverHelper.clickTheElement(BloodManageLocators.contact);
        Screenshot.screenShotAndHighlight(Base.driver, BloodManageLocators.contact, "name");
        Base.driver.navigate().back();
       
       

    }
}
