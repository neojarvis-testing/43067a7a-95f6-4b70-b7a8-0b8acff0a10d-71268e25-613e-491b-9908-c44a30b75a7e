package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ForProviders;
import pages.HealthLibraryAction;
import utils.Base;

public class TestRunnerHL extends Base {

    @BeforeMethod
    public void browserSetup(){
        openBrowser();
        
    }

    @Test(enabled = true)
    public void configBrowser1(){
        HealthLibraryAction libraryAction = new HealthLibraryAction();
        libraryAction.methodMerge1();
    }

    @Test(enabled = true)
    public void configBrowser2(){
          ForProviders providers = new ForProviders();
          providers.methodMerge2();
    }


    @AfterMethod
    public void endBrowser(){
    driver.quit();
    }

}
