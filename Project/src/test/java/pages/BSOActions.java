package pages;

import uistore.BSOLocatorss;
import utils.Base;
import utils.WebDriverHelper;

public class BSOActions {
    WebDriverHelper helper=new WebDriverHelper(Base.driver);

    public void eyeDiseases(){
        
       helper.waitForClickability(BSOLocatorss.redEye,10);
       helper.hover(BSOLocatorss.eyeAppearance);
       helper.waitsec(3);
       helper.clickTheElement(BSOLocatorss.redEye);
       helper.switchWindow();
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
