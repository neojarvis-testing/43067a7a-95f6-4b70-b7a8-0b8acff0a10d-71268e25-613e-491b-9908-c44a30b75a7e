package pages;

import java.time.Duration;

import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class ForProviders {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void joinNursingTeam(){


    //     // driverHelper.retrieveText("");
        
    //     driverHelper.ClickTheElement(HomePageLocators.forProviders_joinOurNursingTeam);
    //     driverHelper.waitForVisibility(HomePageLocators.forProviders_joinOurNursingTeam, 10);
    //     driverHelper.ClickTheElement(HomePageLocators.forProviders_nursingAtCleveland);
    //     //String parent = Base.driver.getWindowHandle();

    //     driverHelper.switchWindow();
    //     Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    //     // driverHelper.waitForVisibility(HomePageLocators.forProviders_nursingAtClevelandNew, 5);
    //     // driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "11", "value"));
    //     Base.driver.close();
    //   Base.driver.switchTo().window(parent);
    // //   driverHelper.switchWindow();
    //    // Base.driver.switchTo().defaultContent();

    String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.ClickTheElement(HomePageLocators.forProviders_joinOurNursingTeam);
        driverHelper.ClickTheElement(HomePageLocators.forProviders_nursingAtCleveland);
        driverHelper.switchWindow();
        System.out.println(Base.driver.getCurrentUrl());        
        // driverHelper.verifyUrl("https://www.linkedin.com/company/cleveland-clinic");
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);




    }

    public void careers(){
        driverHelper.ClickTheElement(HomePageLocators.forProviders_careers);
        driverHelper.ClickTheElement(HomePageLocators.forProviders_findYourCareer);
        driverHelper.switchWindow();
        //driverHelper.waitForVisibility(HomePageLocators.forProviders_nursingAtClevelandNew, 1);
       // driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "12", "value"));
       Base.driver.switchTo().defaultContent();
        //driverHelper.waitForVisibility(null, 0);

    }


    public void referPatient(){
        driverHelper.ClickTheElement(HomePageLocators.forProviders_referPatient);
        driverHelper.ClickTheElement(HomePageLocators.forProviders_referringPhysician);
        driverHelper.switchWindow();
        //driverHelper.waitForVisibility(HomePageLocators.forProviders_nursingAtClevelandNew, 1);
        //driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "13", "value"));
        Base.driver.switchTo().defaultContent();
        //Base.driver.navigate().back();
    }

    public void consultQd(){
        driverHelper.ClickTheElement(HomePageLocators.forProviders_consultQd);
        driverHelper.ClickTheElement(HomePageLocators.forProviders_siteForPhysician);
        driverHelper.switchWindow();
       // driverHelper.waitForVisibility(HomePageLocators.forProviders_nursingAtClevelandNew, 1);
        //driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "14", "value"));
        Base.driver.switchTo().defaultContent();

    }

    public void education(){
        driverHelper.hover(HomePageLocators.forProviders_education);
        driverHelper.ClickTheElement(HomePageLocators.forProviders_trainingAndEducation);
        driverHelper.switchWindow();
        //driverHelper.waitForVisibility(HomePageLocators.forProviders_nursingAtClevelandNew, 1);
        //driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "15", "value"));
        Base.driver.switchTo().defaultContent();
    }

    public void methodMerge2(){
        joinNursingTeam();
        careers();
        referPatient();
        consultQd();
        education();
    }

}
