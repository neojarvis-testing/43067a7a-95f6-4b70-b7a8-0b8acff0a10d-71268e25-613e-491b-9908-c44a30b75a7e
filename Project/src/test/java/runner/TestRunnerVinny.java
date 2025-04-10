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

public class TestRunnerVinny extends Base {
    ExtentTest test;
    ExtentReports reports;

    @BeforeClass
    public void createReport() {
        reports = ReportHelper.createExtentReporter("cleveland_Report");
    }

    @BeforeMethod
    public void configBrowser() {
        openBrowser();

    }

    @Test(enabled = false)
    public void create() throws Exception {
        HomePageActions home = new HomePageActions();
        RespiratoryAction resp = new RespiratoryAction();
        home.searchAll();
        resp.respiratoryAll();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @AfterClass
    public void flushReport() {
        reports.flush();
    }

}
