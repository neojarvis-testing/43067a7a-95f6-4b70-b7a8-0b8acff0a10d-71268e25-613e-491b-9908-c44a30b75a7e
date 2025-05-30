package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AppointmentsLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class AppointmentsActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    /**
     * Author: Kiruthik Vijey Raj P
     * This method performs a series of actions to click on the "Request" button on
     * the appointments page.
     * It waits for the element to be clickable, verifies the current URL, clicks
     * the element, and logs the action.
     *
     * @param test The ExtentTest object used for logging test information.
     */

    public void clickOnRequest(ExtentTest test) {
        driverHelper.waitForClickability(AppointmentsLocators.Appointments_Request, 5);
        driverHelper.verifyUrl("https://my.clevelandclinic.org/patients/information/access");
        driverHelper.clickTheElement(AppointmentsLocators.Appointments_Request);
        test.log(Status.INFO, "Clicked on schedule now");
        LoggerHandler.info("Clicked on schedule now");

    }
}
