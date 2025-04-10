package pages;

import uistore.BloodManageLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BloodManageActions {
    WebDriverHelper helper=new WebDriverHelper(Base.driver);
    public void bloodMethod(){
        helper.waitsec(3);
        helper.clickTheElement(BloodManageLocators.contact);
        Screenshot.screenShotAndHighlight(Base.driver, BloodManageLocators.contact, "name");
        Base.driver.navigate().back();

    }
}
