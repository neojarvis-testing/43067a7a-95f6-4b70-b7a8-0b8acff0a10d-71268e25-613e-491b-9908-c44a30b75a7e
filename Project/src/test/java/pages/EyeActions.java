package pages;
import uistore.EyeLocators;
import utils.Base;
import utils.WebDriverHelper;

public class EyeActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
     public void eyeDiseases(){
        //  JavascriptExecutor js=(JavascriptExecutor)Base.driver;
        //  js.executeScript("window.scrollBy(0,1000)", "");
        driverHelper.hover(EyeLocators.scrollelemnet);
        driverHelper.waitForVisibility(EyeLocators.allergies, 10);
        driverHelper.scrollToElementandCLick(EyeLocators.allergies);
        driverHelper.switchWindow();
       
        driverHelper.waitForVisibility(EyeLocators.allergies, 10);
        driverHelper.clickTheElement(EyeLocators.Blepharitis);
        driverHelper.switchWindow();
       
        driverHelper.waitForVisibility(EyeLocators.allergies, 10);
        driverHelper.scrollToElementandCLick(EyeLocators.PinkEye);
        driverHelper.switchWindow();
       
        driverHelper.waitForVisibility(EyeLocators.allergies, 10);
        driverHelper.scrollToElementandCLick(EyeLocators.DryEye);
        driverHelper.switchWindow();
       
        driverHelper.waitForVisibility(EyeLocators.allergies, 10);
        driverHelper.scrollToElementandCLick(EyeLocators.eyeInjury);
        driverHelper.switchWindow();
       
        driverHelper.waitForVisibility(EyeLocators.allergies, 10);
        driverHelper.scrollToElementandCLick(EyeLocators.glaucoma);
        driverHelper.switchWindow();
       
    }
}
