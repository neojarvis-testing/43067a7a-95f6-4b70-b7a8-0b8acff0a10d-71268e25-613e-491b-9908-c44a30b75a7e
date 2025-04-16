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
            test.log(Status.PASS, "Clicked on search bar as expected");
            String data = ExcelReader.readCellValue("Sheet1", "1", "value");
            driverHelper.typeText(LocationPageLocators.searchbar, data);
            test.log(Status.PASS, "Sent data on search bar as expected");
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
            test.log(Status.PASS, "Clicked on location types as expected");
            driverHelper.waitForVisibility(LocationPageLocators.locationTypes, 10);
            test.log(Status.PASS, "Waited for visibility as expected");
            driverHelper.clickTheElement(LocationPageLocators.healthCentre);
            test.log(Status.PASS, "Clicked on health centre as expected");
            Thread.sleep(3000);
            driverHelper.selectByValue(LocationPageLocators.locationtypes1, "Imaging & Radiology");
            test.log(Status.PASS, "Selected value as expected");
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
            test.log(Status.PASS, "Clicked on speciality as expected");
            driverHelper.waitForVisibility(LocationPageLocators.speciality, 10);
            test.log(Status.PASS, "Waited for visibility as expected");
            driverHelper.clickTheElement(LocationPageLocators.astama);
            test.log(Status.PASS, "Clicked on astama as expected");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.waitForVisibility(LocationPageLocators.speciality1, 10);
            test.log(Status.PASS, "Element visible as expected");
            driverHelper.clickTheElement(LocationPageLocators.speciality1);
            test.log(Status.PASS, "Clicked on speciality1 as expected");
            driverHelper.clickTheElement(LocationPageLocators.brainhealth);
            test.log(Status.PASS, "Clicked on brain health as expected");
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
            test.log(Status.PASS, "Clicked on service type as expected");
            driverHelper.waitForVisibility(LocationPageLocators.serviceTypes, 10);
            test.log(Status.PASS, "Element visible as expected");
            driverHelper.clickTheElement(LocationPageLocators.emergency);
            test.log(Status.PASS, "Clicked on emergency as expected");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.waitForVisibility(LocationPageLocators.serviceTypes1, 10);
            test.log(Status.PASS, "Element visible as expected");
            driverHelper.clickTheElement(LocationPageLocators.serviceTypes1);
            test.log(Status.PASS, "Clicked on service types as expected");
            driverHelper.clickTheElement(LocationPageLocators.expresscare);
            test.log(Status.PASS, "Clicked on expresscare as expected");
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
     * It clicks on button.
     * It is wrapped in a try-catch block to handle any exceptions that may occur
     * during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */

    public void buttondirection(ExtentTest test) {
        try {
            driverHelper.clickTheElement(LocationPageLocators.DirectionButton);
            test.log(Status.PASS, "Clicked on direction buttton as expected");
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
     * It switches window and wait for element to visible after that it take
     * screenshot.
     * It is wrapped in a try-catch block to handle any exceptions that may occur
     * during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */

    public void secondwindow(ExtentTest test) {
        try {

            driverHelper.switchWindow();
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.waitForVisibility(LocationPageLocators.signinsecond, 5);
            driverHelper.verifyUrl(Base.prop.getProperty("mapurl"));
            test.log(Status.PASS, "Element visible as expected");
            Screenshot.screenShotAndHighlight(Base.driver, LocationPageLocators.signinsecond, "Google Maps page");
            test.log(Status.PASS, "Screenshot captured as expected");
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
