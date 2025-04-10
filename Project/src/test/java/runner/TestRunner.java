package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePageActions;
import pages.RespiratoryAction;
import utils.Base;
import utils.ReportHelper;




public class TestRunner extends Base {
    ExtentReports report;
     ExtentTest test;

    @BeforeMethod
    public void launchBrowser() {
        openBrowser();
       
    }
    @Test
    public void create() throws Exception{
        HomePageActions home = new HomePageActions();
        RespiratoryAction resp = new RespiratoryAction();
        home.searchAll();
        resp.respiratoryAll();
       
        
       
       
    }
    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }
  


}
