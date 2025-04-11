package pages;

import uistore.BloodManageLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BloodManageActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
    public void bloodMethod() throws InterruptedException{
       driverHelper.waitForClickability(BloodManageLocators.contact,4);
       Thread.sleep(3000);
       
       driverHelper.hover(BloodManageLocators.contact);
       Thread.sleep(2000);
        driverHelper.clickTheElement(BloodManageLocators.contact);
        Screenshot.screenShotAndHighlight(Base.driver, BloodManageLocators.contact, "name");
        Base.driver.navigate().back();

    }
}
