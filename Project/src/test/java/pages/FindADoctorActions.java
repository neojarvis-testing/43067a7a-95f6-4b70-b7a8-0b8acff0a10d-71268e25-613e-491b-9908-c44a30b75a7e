package pages;

import com.aventstack.extentreports.ExtentTest;


import uistore.FindADoctorLocators;
import utils.Base;

import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;

public class FindADoctorActions 
{

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
    public  void searchBar()
    {
        driverHelper.typeText(FindADoctorLocators.FindADoctorLocators_searchBar,"Heart");
    }
    public void filterSection()
    {
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_location, 10);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_location);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_locationOption);
        driverHelper.waitForVisibility(FindADoctorLocators.FindADoctorLocators_Department,10);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_Department);
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_DepartmentOption, 10);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_DepartmentOption);
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_Language,10);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_Language);
        driverHelper.typeText(FindADoctorLocators.FindADoctorLocators_Language, "English");
        driverHelper.pressEnter(FindADoctorLocators.FindADoctorLocators_Language);
    }
    public void clickFindADoctorLocators(ExtentTest test)
    {
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_Request,5);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_Request);
        driverHelper.switchWindow();
        Screenshot.screenShotAndHighlight(Base.driver, FindADoctorLocators.FindADoctorLocators_Label, "Find Doctor");
        ReportHelper.attachScreenshotToReport("Find Doctor", test,"testing");
       
    }
    public void findADoctorAction(ExtentTest test)
    {
        searchBar();
        filterSection();
        clickFindADoctorLocators(test);
    }
}