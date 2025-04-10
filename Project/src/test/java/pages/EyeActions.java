package pages;
import uistore.EyeLocators;
import utils.Base;
import utils.WebDriverHelper;

public class EyeActions {
    WebDriverHelper helper=new WebDriverHelper(Base.driver);
     public void eyeDiseases(){
        //  JavascriptExecutor js=(JavascriptExecutor)Base.driver;
        //  js.executeScript("window.scrollBy(0,1000)", "");
        helper.hover(EyeLocators.scrollelemnet);
        helper.waitForVisibility(EyeLocators.allergies, 10);
        helper.scrollToElementandCLick(EyeLocators.allergies);
        helper.switchWindow();
        helper.waitsec(2);
        helper.waitForVisibility(EyeLocators.allergies, 10);
        helper.clickTheElement(EyeLocators.Blepharitis);
        helper.switchWindow();
        helper.waitsec(2);
        helper.waitForVisibility(EyeLocators.allergies, 10);
        helper.scrollToElementandCLick(EyeLocators.PinkEye);
        helper.switchWindow();
        helper.waitsec(2);
        helper.waitForVisibility(EyeLocators.allergies, 10);
        helper.scrollToElementandCLick(EyeLocators.DryEye);
        helper.switchWindow();
        helper.waitsec(2);
        helper.waitForVisibility(EyeLocators.allergies, 10);
        helper.scrollToElementandCLick(EyeLocators.eyeInjury);
        helper.switchWindow();
        helper.waitsec(2);
        helper.waitForVisibility(EyeLocators.allergies, 10);
        helper.scrollToElementandCLick(EyeLocators.glaucoma);
        helper.switchWindow();
        helper.waitsec(2);
    }
}
