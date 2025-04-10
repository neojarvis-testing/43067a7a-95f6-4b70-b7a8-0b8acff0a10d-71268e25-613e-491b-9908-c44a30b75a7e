package pages;

import java.time.Duration;

import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class ForProviders {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void joinNursingTeam(){
        try {
            
            String mainWindowHandle = Base.driver.getWindowHandle();
            driverHelper.hover(HomePageLocators.forProviders_joinOurNursingTeam);
            driverHelper.clickTheElement(HomePageLocators.forProviders_joinOurNursingTeam);
            driverHelper.hover(HomePageLocators.forProviders_joinOurNursingTeam);
            driverHelper.clickTheElement(HomePageLocators.forProviders_nursingAtCleveland);
            driverHelper.switchWindow();
            System.out.println(Base.driver.getCurrentUrl());        
            Base.driver.close();
            Base.driver.switchTo().window(mainWindowHandle);
            
        
        
    } catch (Exception e) {
        
       
    }

    }

    public void careers(){
        
        try {
            String mainWindowHandle = Base.driver.getWindowHandle();
            driverHelper.hover(HomePageLocators.forProviders_careers);
            driverHelper.clickTheElement(HomePageLocators.forProviders_careers);
            driverHelper.hover(HomePageLocators.forProviders_findYourCareer);
            driverHelper.clickTheElement(HomePageLocators.forProviders_findYourCareer);
            driverHelper.switchWindow();
            Base.driver.close();
            Base.driver.switchTo().window(mainWindowHandle);
            
            
        } catch (Exception e) {
           
        }

    }


    public void referPatient(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.forProviders_referPatient);
        driverHelper.clickTheElement(HomePageLocators.forProviders_referringPhysician);
        driverHelper.switchWindow();
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
        
       
    }

    public void consultQd(){
      
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.forProviders_consultQd);
        driverHelper.clickTheElement(HomePageLocators.forProviders_siteForPhysician);
        driverHelper.switchWindow();
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
        
    }

    public void education(){
        // driverHelper.hover(HomePageLocators.forProviders_education);
        // driverHelper.clickTheElement(HomePageLocators.forProviders_trainingAndEducation);
        // driverHelper.switchWindow();
        // //driverHelper.waitForVisibility(HomePageLocators.forProviders_nursingAtClevelandNew, 1);
        // //driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "15", "value"));
        // Base.driver.switchTo().defaultContent();

        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.forProviders_education);
        
        driverHelper.clickTheElement(HomePageLocators.forProviders_trainingAndEducation);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        driverHelper.switchWindow();
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);

    }

    public void methodMerge2(){
        joinNursingTeam();
        careers();
        //referPatient();
        // consultQd();
        // education();
    }

}
