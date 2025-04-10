package pages;



import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class HealthLibraryAction {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void diseaseAndCondition() {

        //driverHelper.retrieveText(ExcelReader.readCellValue("Sheet1", "10", "value"));
        driverHelper.clickTheElement(HomePageLocators.healthLibrary_diseaseAndCondition);
        driverHelper.waitForVisibility(HomePageLocators.healthLibrary_diseaseAndConditionNew, 3);
        driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "2", "value"));

        // if(Base.driver.getTitle().contains(ExcelReader.readCellValue("Sheet1", "2", "value"))){
        //     Assert.assertTrue(true);
        // }else Assert.fail();

        Base.driver.navigate().back();


       
        

    }

    public void diagnosticsAndTesting() {

        driverHelper.clickTheElement(HomePageLocators.healthLibrary_diagnosticsAndTesting);
        driverHelper.waitForVisibility(HomePageLocators.healthLibrary_diagnosticsAndTestingNew, 3);
        driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "4", "value"));
        Base.driver.navigate().back();
    }

    public void treatmentsAndProcedure() {

        driverHelper.clickTheElement(HomePageLocators.healthLibrary_treatmentsAndProcedure);
        driverHelper.waitForVisibility(HomePageLocators.healthLibrary_treatmentsAndProcedureNew, 3);
        driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "6", "value"));
        Base.driver.navigate().back();
    }

    public void bodySystemsAndOrgans() {
        driverHelper.clickTheElement(HomePageLocators.healthLibrary_bodySystemsAndOrgans);
         driverHelper.waitForVisibility(HomePageLocators.healthLibrary_bodySystemsAndOrgansNew, 3);
         driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "8", "value"));
         Base.driver.navigate().back();

        // if(Base.driver.getTitle().contains(ExcelReader.readCellValue("Sheet1", "8", "value"))){
        //     Assert.assertTrue(true);
        // }else Assert.fail();
    }

    public void drugsDevicesSupplements() {
        driverHelper.clickTheElement(HomePageLocators.healthLibrary_drugsDevicesSupplements);
        driverHelper.waitForVisibility(HomePageLocators.healthLibrary_drugsDevicesSupplementsNew, 3);
        Base.driver.navigate().back();

    }

    public void methodMerge1() {
        diseaseAndCondition();
        diagnosticsAndTesting();
        treatmentsAndProcedure();
        bodySystemsAndOrgans();
        drugsDevicesSupplements();
    }

}
