package pages;

import uistore.BSOLocatorss;
import utils.Base;
import utils.WebDriverHelper;

public class BSOActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);

    public void eyeDiseases(){
        
       driverHelper.waitForClickability(BSOLocatorss.redEye,10);
       driverHelper.hover(BSOLocatorss.eyeAppearance);
     
       driverHelper.clickTheElement(BSOLocatorss.redEye);
       driverHelper.switchWindow();
   }








    // public void eyeDiseases(){
    //      //helper.waitForVisibility(BSOLocatorss.redEye,5);
    //     // helper.scrollToElement(BSOLocatorss.redEye1);

    //    // helper.hover(BSOLocatorss.redEye);
    //     helper.waitForVisibility(BSOLocatorss.redEye,10);
    //     helper.hover(BSOLocatorss.redEye);
    //     helper.ClickTheElement(BSOLocatorss.redEye);
    //     helper.switchWindow();
    // }


}
