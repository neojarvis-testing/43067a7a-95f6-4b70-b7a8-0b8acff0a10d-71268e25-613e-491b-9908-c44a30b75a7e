package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
  
  public  void clickOnSchedule(ExtentTest test)
    {
        driverHelper.clickTheElement(HomePageLocators.Appointments_ScheduleNow);
        test.log(Status.INFO, "Clicked on schedule now");
    }
    public  void clickOnFindADoctor(ExtentTest test)
    {
        driverHelper.clickTheElement(HomePageLocators.Appointments_Find_a_Doctor);
        test.log(Status.INFO, "Clicked on Request an Appointment");
    }
  
   public void healthLibrary(){
        driverHelper.clickTheElement(HomePageLocators.healthLibrary);
    }
    public void institute(){
        driverHelper.clickTheElement(HomePageLocators.institueAndDepat);
    }
  
  public void searchOperation() throws Exception
{
    driverHelper.clickTheElement(HomePageLocators.search);
    driverHelper.clickTheElement(HomePageLocators.searchbar);
    driverHelper.typeText(HomePageLocators.searchbar, "Respiratory");
   
    driverHelper.pressEnter(HomePageLocators.searchbar);
    String title = Base.driver.getTitle();
    driverHelper.verifyTitle(title);
    
    driverHelper.waitForClickability(HomePageLocators.firstResp, 2);
     driverHelper.clickTheElement(HomePageLocators.firstResp);
     driverHelper.retrieveText(HomePageLocators.verifyResp);
}
  
public void searchAll() throws Exception
{
    searchOperation();
}

    public void clickFaceBook(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        Screenshot.screenShotAndHighlight(Base.driver, HomePageLocators.clevelandClinicHeader, "facebook");
        driverHelper.clickTheElement(HomePageLocators.facebookSocialLink);
        driverHelper.switchWindow();   
        
         
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);        
    }
    public void clickTwitter(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.twitterSocialLink);
        driverHelper.switchWindow();       
       
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
    public void clickYoutube(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.youtubeSocialLink);
        driverHelper.switchWindow();       
        
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
    public void clickInstagram(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.instagramSocialLink);
        driverHelper.switchWindow();      
        
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
    public void clickLinkedIn(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.linkedinSocialLink);
        driverHelper.switchWindow();        
       
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
    public void clickPinterest(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.pinterestSocialLink);
        driverHelper.switchWindow();      
        
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
    public void clickSnapchat(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.snapchatSocialLink);
        driverHelper.switchWindow();     
          
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }

    public void clickAppointmentsAccess(){
        driverHelper.scrollToElement(HomePageLocators.appointmentsActions);
        driverHelper.clickTheElement(HomePageLocators.appointmentsActions);
       
        Base.driver.navigate().back();
    }
    public void clickAcceptedInsurance(){
        driverHelper.scrollToElement(HomePageLocators.acceptedInsuranceActions);
        driverHelper.clickTheElement(HomePageLocators.acceptedInsuranceActions);
        
        Base.driver.navigate().back();
    }
    public void clickEventsCalender(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.scrollToElement(HomePageLocators.eventsCalenderActions);
        driverHelper.clickTheElement(HomePageLocators.eventsCalenderActions);
        driverHelper.switchWindow();     
        
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
    public void clickFinancialAssistance(){
        driverHelper.scrollToElement(HomePageLocators.financialAssistanceActions);
        driverHelper.clickTheElement(HomePageLocators.financialAssistanceActions);
       
        Base.driver.navigate().back();
    }
    public void clickGiveCleveland(){
        driverHelper.scrollToElement(HomePageLocators.giveClevelandActions);
        driverHelper.clickTheElement(HomePageLocators.giveClevelandActions);

        Base.driver.navigate().back();
    }
    public void clickPayBill(){
        driverHelper.scrollToElement(HomePageLocators.payBillActions);
        driverHelper.clickTheElement(HomePageLocators.payBillActions);
        
        Base.driver.navigate().back();
    }
    public void clickPriceTransparency(){
        driverHelper.scrollToElement(HomePageLocators.priceTransparencyActions);
        driverHelper.clickTheElement(HomePageLocators.priceTransparencyActions);

        Base.driver.navigate().back();
    }
    public void clickReferPatient(){
        driverHelper.scrollToElement(HomePageLocators.referPatientActions);
        driverHelper.clickTheElement(HomePageLocators.referPatientActions);
       
        Base.driver.navigate().back();
    }
    public void clickPhoneDirectory(){
        driverHelper.scrollToElement(HomePageLocators.phoneDirectoryActions);
        driverHelper.clickTheElement(HomePageLocators.phoneDirectoryActions);
        
        Base.driver.navigate().back();
    }
    public void clickVirtualOpinions(){
        driverHelper.scrollToElement(HomePageLocators.virtualOpinionsActions);
        driverHelper.clickTheElement(HomePageLocators.virtualOpinionsActions);
        
        Base.driver.navigate().back();
    }
    public void clickVirtualVisits(){
        driverHelper.scrollToElement(HomePageLocators.virtualVisitsActions);
        driverHelper.clickTheElement(HomePageLocators.virtualVisitsActions);
        
        Base.driver.navigate().back();
        driverHelper.clickTheElement(HomePageLocators.clevelandClinicHeader);
    }

    public void verifySocialLinks(ExtentTest test){
        clickFaceBook();
        test.log(Status.INFO, "clicked and verified facebook");
        ReportHelper.attachScreenshotToReport("fcbook", test, "fcbook scrnsht");
        clickInstagram();
        test.log(Status.INFO, "clicked and verified instagram");
        clickLinkedIn();
        test.log(Status.INFO, "clicked and verified linkedIn");
        clickPinterest();
        test.log(Status.INFO, "clicked and verified pinterest");
        clickTwitter();
        test.log(Status.INFO, "clicked and verified twitter");
        clickYoutube();
        test.log(Status.INFO, "clicked and verified youtube");
        clickSnapchat();
        test.log(Status.INFO, "clicked and verified snapchat");
    }
    public void verifyActionsFooter(ExtentTest test){
        clickAppointmentsAccess();
        test.log(Status.INFO, "Appointments & access verified");
        clickAcceptedInsurance();
        test.log(Status.INFO, "Accepted Insurance verified");
        clickEventsCalender();
        test.log(Status.INFO, "Events Calender verified");
        clickFinancialAssistance();
        test.log(Status.INFO, "Financial Assistance verified");
        clickGiveCleveland();
        test.log(Status.INFO, "Give to cleveland clinic verified");
        clickPayBill();
        test.log(Status.INFO, "Pay biils online verified");
        clickPriceTransparency();
        test.log(Status.INFO, "Price Transparency verified");
        clickReferPatient();
        test.log(Status.INFO, "Refer Patients verified");
        clickPhoneDirectory();
        test.log(Status.INFO, "Phone Directory verified");
        clickVirtualOpinions();
        test.log(Status.INFO, "Virtual Opinions verified");
        clickVirtualVisits();
        test.log(Status.INFO, "Virtual Visits verified");

    }
}
