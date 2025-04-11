package pages;
import org.openqa.selenium.JavascriptExecutor;

import uistore.EyeLocators;
import utils.Base;
import utils.WebDriverHelper;

public class EyeActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
     public void eyeDiseases() throws InterruptedException{
         JavascriptExecutor js=(JavascriptExecutor)Base.driver;
         js.executeScript("window.scrollBy(0,1000)", "");
        driverHelper.hover(EyeLocators.scrollelemnet);
        driverHelper.waitForVisibility(EyeLocators.allergies, 10);
        String cwindow=Base.driver.getWindowHandle();
        driverHelper.scrollToElementandCLick(EyeLocators.allergies);
        driverHelper.switchWindow();
        Base.driver.close();
        
        Base.driver.switchTo().window(cwindow);
        
        Base.driver.navigate().back();
        
       
    }
}
