package pages;

import org.openqa.selenium.JavascriptExecutor;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PharmacyLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class PharmacyActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
    public void takeSurvey(ExtentTest test) throws InterruptedException{
       driverHelper.waitForVisibility(PharmacyLocators.takeSurvey, 3);
      // //    //driverHelper.scrollToElement(PharmacyLocators.takeSurveySpecila);
      // //     //driverHelper.hover(PharmacyLocators.takeSurveySpecila);
      //   Thread.sleep(5000);
      //   JavascriptExecutor js=(JavascriptExecutor)Base.driver;
      //   js.executeScript("window.scrollBy(0,500)","");
      //   driverHelper.hover(PharmacyLocators.takeSurvey);
      //   driverHelper.clickTheElement(PharmacyLocators.takeSurvey);
      //  // driverHelper.waitForVisibility(PharmacyLocators.takeSurvey, 3);

        JavascriptExecutor js=(JavascriptExecutor)Base.driver;
        js.executeScript("window.scrollBy(0,1000)","");
        driverHelper.hover(PharmacyLocators.takeSurveySpecila);
        Thread.sleep(2000);
        String cwindow=Base.driver.getWindowHandle();
        driverHelper.clickTheElement(PharmacyLocators.takeSurvey);
        driverHelper.switchWindow();
        test.log(Status.PASS, "click on parking");
        test.log(Status.PASS, "click on parking");        
        LoggerHandler.createLogInfo("verify forms");
          test.log(Status.INFO, "verify forms");
          LoggerHandler.createLogInfo("verify forms");
          test.log(Status.INFO, "verify forms");
        Thread.sleep(3000);
        Base.driver.close();
        
        Base.driver.switchTo().window(cwindow);
        Thread.sleep(2000);
        Base.driver.navigate().back();

    }
}
