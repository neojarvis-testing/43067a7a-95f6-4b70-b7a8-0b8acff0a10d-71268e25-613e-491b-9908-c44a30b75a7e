package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RespiratoryLocators;
import utils.Base;

import utils.Screenshot;
import utils.WebDriverHelper;

public class RespiratoryAction {
    WebDriverHelper help = new WebDriverHelper(Base.driver);
public void respOperation(ExtentTest test) 
{
   help.hoverAndClick(RespiratoryLocators.Introduction);
   test.log(Status.PASS, "Clicked on introduction as expected");
    help.hoverAndClick(RespiratoryLocators.cough);
    test.log(Status.PASS, "Clicked on cough as expected");



}
public void doctorFilters( ExtentTest test) 
{   Base.driver.navigate().back();
    Base.driver.navigate().back();
    Base.driver.navigate().back();
   
    help.hoverAndClick(RespiratoryLocators.byDoctors);
    test.log(Status.PASS, "Clicked on filter byDoctors as expected");
    help.hoverAndClick(RespiratoryLocators.specialist);
    test.log(Status.PASS, "Clicked on specialist as expected");
    help.hoverAndClick(RespiratoryLocators.male);
    help.hoverAndClick(RespiratoryLocators.female);
   help.waitForClickability(RespiratoryLocators.mahamod, 2);
}
public void doctorSelect(ExtentTest test)
{
    help.hoverAndClick(RespiratoryLocators.mahamod);
    help.switchWindow();
    help.retrieveText(RespiratoryLocators.doctorInfo);
    Screenshot.screenShotAndHighlight(Base.driver,RespiratoryLocators.doctorInfo,"Doctor's profile");
    test.log(Status.PASS, "Doctor profile captured");
}
public void respiratoryAll(ExtentTest test) 
{
    respOperation(test);
    doctorFilters(test);
    doctorSelect(test);
}
}
