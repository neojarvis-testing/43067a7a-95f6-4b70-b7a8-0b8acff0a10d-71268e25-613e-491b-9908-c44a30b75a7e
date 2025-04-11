package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RespiratoryAction;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import pages.AppointmentsActions;
import pages.FindADoctorActions;
import pages.HomePageActions;
import pages.RequestAppointmentActions;
import utils.Base;
import utils.ReportHelper;

public class TestRunner extends Base {
    ExtentTest test ;
    ExtentReports reports;
    @BeforeClass
    public void createReport()
    {
        reports = ReportHelper.createExtentReporter("cleveland_Report");
    }
    @BeforeMethod
    public void configBrowser() {
        openBrowser();
        
    }

    @Test(priority = 1, enabled = false)
    public void testcase1()
    {
        HomePageActions homePageActions = new HomePageActions();
        AppointmentsActions appointmentsActions = new AppointmentsActions();
        RequestAppointmentActions requestAppointmentActions = new RequestAppointmentActions();
        test = reports.createTest("Testcase 1");
        homePageActions.clickOnSchedule(test);
        appointmentsActions.clickOnRequest(test);
        requestAppointmentActions.requestAppointmentAction(test);
    }
    @Test(priority = 2, enabled = false)
    public void testcase2()
    {
        HomePageActions homePageActions = new HomePageActions();
        FindADoctorActions findADoctorActions = new FindADoctorActions();
        test = reports.createTest("Testcase 2");
        homePageActions.clickOnFindADoctor(test);
        findADoctorActions.findADoctorAction(test);
    }
  


    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
    @AfterClass
    public void flushReport()
    {
        reports.flush();
    }

}
