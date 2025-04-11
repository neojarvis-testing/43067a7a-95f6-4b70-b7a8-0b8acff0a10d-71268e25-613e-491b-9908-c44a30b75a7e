package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AppointmentsLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class AppointmentsActions 
{
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
    public  void clickOnRequest(ExtentTest test)
    {
        driverHelper.waitForClickability(AppointmentsLocators.Appointments_Request,5);
        driverHelper.verifyUrl("https://my.clevelandclinic.org/patients/information/access");
        driverHelper.clickTheElement(AppointmentsLocators.Appointments_Request);
        test.log(Status.INFO, "Clicked on schedule now");
        LoggerHandler.createLogInfo("Clicked on schedule now");
       
    }


}
