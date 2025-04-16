package pages;
 
import java.time.Duration;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HomePageLocators;
import uistore.LocationPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class HomePageAction {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs
     * specific actions.
     * It hovers over an element identified by a locator and clicks on it to proceed
     * further.
     * It is wrapped in a try-catch block to handle any exceptions that may occur
     * during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
 
    public void homePage(ExtentTest test) {
        try {
 
            driverHelper.hover(HomePageLocators.getDirection);
            test.log(Status.PASS, "Hovered over get direction as expected");
            driverHelper.clickTheElement(HomePageLocators.getDirection);
            test.log(Status.PASS, "Clicked on get direction as expected");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
    }
 
    /**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs
     * specific actions.
     * It clicks for proceed further.
     * It is wrapped in a try-catch block to handle any exceptions that may occur
     * during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
 
    public void secondpageAction(ExtentTest test) {
        try {
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.clickTheElement(LocationPageLocators.searchbar);
            String data = ExcelReader.readCellValue("Sheet4", "1", "value");
            driverHelper.typeText(LocationPageLocators.searchbar, data);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs
     * specific actions.
     * It clicks and wait for element to visible.
     * It is wrapped in a try-catch block to handle any exceptions that may occur
     * during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
 
    public void locationTypesInput(ExtentTest test) {
        try {
 
            driverHelper.clickTheElement(LocationPageLocators.locationTypes);
            driverHelper.waitForVisibility(LocationPageLocators.locationTypes, 10);
            driverHelper.clickTheElement(LocationPageLocators.healthCentre);
            Thread.sleep(3000);
            driverHelper.selectByValue(LocationPageLocators.locationtypes1, "Imaging & Radiology");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs
     * specific actions.
     * It clicks and wait for element to visible.
     * It is wrapped in a try-catch block to handle any exceptions that may occur
     * during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
    public void specialityInput(ExtentTest test) {
        try {
 
            driverHelper.clickTheElement(LocationPageLocators.speciality);
            driverHelper.waitForVisibility(LocationPageLocators.speciality, 10);
            driverHelper.clickTheElement(LocationPageLocators.astama);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.waitForVisibility(LocationPageLocators.speciality1, 10);
            driverHelper.clickTheElement(LocationPageLocators.speciality1);
            driverHelper.clickTheElement(LocationPageLocators.brainhealth);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs
     * specific actions.
     * It clicks and wait for element to visible.
     * It is wrapped in a try-catch block to handle any exceptions that may occur
     * during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
 
    public void serviceTypesInput(ExtentTest test) {
        try {
 
            driverHelper.clickTheElement(LocationPageLocators.serviceTypes);
            driverHelper.waitForVisibility(LocationPageLocators.serviceTypes, 10);
            driverHelper.clickTheElement(LocationPageLocators.emergency);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
 
            driverHelper.waitForVisibility(LocationPageLocators.serviceTypes1, 10);
            driverHelper.clickTheElement(LocationPageLocators.serviceTypes1);
            driverHelper.clickTheElement(LocationPageLocators.expresscare);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void buttondirection(ExtentTest test) {
        try {
            driverHelper.clickTheElement(LocationPageLocators.DirectionButton);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void secondwindow(ExtentTest test) {
        try {
 
            driverHelper.switchWindow();
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.waitForVisibility(LocationPageLocators.signinsecond, 5);
            Screenshot.screenShotAndHighlight(Base.driver, LocationPageLocators.signinsecond, "Google Maps page");
            driverHelper.verifyUrl(ExcelReader.readCellValue("Sheet1", "2", "value"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void wrappingMethod(ExtentTest test) {
        try {
            homePage(test);
            secondpageAction(test);
            locationTypesInput(test);
            specialityInput(test);
            serviceTypesInput(test);
            buttondirection(test);
            secondwindow(test);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 