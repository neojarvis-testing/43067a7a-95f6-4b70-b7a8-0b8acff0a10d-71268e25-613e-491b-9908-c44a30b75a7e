package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions 
{
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
    public  void clickOnSchedule(ExtentTest test)
    {
        driverHelper.clickTheElement(HomePageLocators.Appointments_ScheduleNow);
        test.log(Status.INFO, "Clicked on schedule now");
    }
    public  void clickOnFindADoctor(ExtentTest test)
    {
        driverHelper.clickTheElement(HomePageLocators.Appointments_Find_a_Doctor);
        test.log(Status.INFO, "Clicked on Request an Appointment");
    }
}
