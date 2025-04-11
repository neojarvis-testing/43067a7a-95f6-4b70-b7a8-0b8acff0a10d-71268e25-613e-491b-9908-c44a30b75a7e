package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ContactLocators;
import uistore.InstituteLocators;
import uistore.NeedHelpLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;

public class InstituteActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
    public void bloodacction(){
        driverHelper.hover(InstituteLocators.specilaSelect);
        driverHelper.clickTheElement(InstituteLocators.bloodManagement);
        
        

    }
    public void pharmacyAction(){
        // driverHelper.waitsec(3);
        // driverHelper.scrollpixel(700);
        driverHelper.waitForClickability(InstituteLocators.specilaSelect, 3);
        driverHelper.scrollToElement(InstituteLocators.specilaSelect);
        driverHelper.waitForClickability(InstituteLocators.specilaSelect,3);
        driverHelper.hover(InstituteLocators.specilaSelect);
        
        driverHelper.clickTheElement(InstituteLocators.pharmacy);
        LoggerHandler.createLogInfo("verify forms");
        
        
    }
    public void contactAction(ExtentTest test){
        //driverHelper.clickTheElement(null);
        driverHelper.hover(InstituteLocators.specilaSelectcontact);
        driverHelper.waitForClickability(InstituteLocators.contact, 3);
        driverHelper.clickTheElement(InstituteLocators.contact);
        driverHelper.waitForClickability(ContactLocators.viewp, 3);
        driverHelper.scrollToElement(ContactLocators.viewp);
       
        driverHelper.clickTheElement(ContactLocators.viewPhone);
         driverHelper.clickTheElement(ContactLocators.contactCleveland);
         driverHelper.waitForClickability(ContactLocators.contactClevelandhome,3);
         driverHelper.hover(ContactLocators.contactClevelandhome);
         driverHelper.clickTheElement(ContactLocators.contactClevelandhome);
          driverHelper.waitForClickability(NeedHelpLocators.needHelp,3);
          driverHelper.hover(NeedHelpLocators.needHelp);
          driverHelper.clickTheElement(NeedHelpLocators.needHelp);
          driverHelper.hover(NeedHelpLocators.parking);
          driverHelper.scrollToElementandCLick(NeedHelpLocators.parking);
          LoggerHandler.createLogInfo("click on parking");
          test.log(Status.INFO, "click on parking");
          driverHelper.clickTheElement(NeedHelpLocators.needassitance);
          driverHelper.clickTheElement(NeedHelpLocators.globalPatient);
          driverHelper.scrollToElementandCLick(NeedHelpLocators.speakwithteam);
          driverHelper.scrollToElement(NeedHelpLocators.virtualSecond);
          driverHelper.scrollToElementandCLick(NeedHelpLocators.virtualSecond);
          driverHelper.clickTheElement(NeedHelpLocators.getStarted);
          Screenshot.captureScreenshot(Base.driver,"create_account");
          ReportHelper.attachScreenshotToReport("create_account",test,"");
          
          

    }
    
}
