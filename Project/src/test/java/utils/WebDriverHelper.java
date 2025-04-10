package utils;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import java.time.Duration;
import java.util.Set;
 
/**
 * Utility class to provide helper methods for WebDriver actions.
 * Author: Kiruthik Vijey Raj P
 */
public class WebDriverHelper {
    private WebDriver driver;
 
    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Waits until the specified element is visible on the page.
     *
     * @param locator          The locator of the element to wait for.
     * @param timeoutInSeconds The maximum time to wait in seconds.
     */
    public void waitForVisibility(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        LoggerHandler.createLogInfo("Wait till the Element " + locator + " is Visible");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Waits until the specified element is clickable on the page.
     *
     * @param locator          The locator of the element to wait for.
     * @param timeoutInSeconds The maximum time to wait in seconds.
     */
    public void waitForClickability(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        LoggerHandler.createLogInfo("Wait till the Element " + locator + " is Clickable");
 
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Waits until the specified element is visible on the page.
     *
     * @param locator          The locator of the element to wait for.
     * @param timeoutInSeconds The maximum time to wait in seconds.
     */
    public void waitForTitle(String title, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.titleContains(title));
        LoggerHandler.createLogInfo("Wait till the Title Changed ");
    }
 
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Sends the specified keys to the element located by the given locator.
     *
     * @param locator The locator of the element.
     * @param data    The data to send to the element.
     */
    public void typeText(By locator, String data) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(data);
        LoggerHandler.createLogInfo("Inputed " + data + " in Input Field");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Retrieves the text content of the element located by the given locator.
     *
     * @param locator The locator of the element.
     * @return The text content of the element.
     */
    public String retrieveText(By locator) {
        WebElement element = driver.findElement(locator);
        LoggerHandler.createLogInfo("Retrived Text From " + locator);
        return element.getText();
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Clicks on the element using JavaScript.
     *
     * @param locator The locator of the element to click.
     */
    public void clickUsingJS(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        LoggerHandler.createLogInfo("Scrolled to the Element And Clicked ");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Scrolls to the element using JavaScript.
     *
     * @param locator The locator of the element to scroll to.
     */
    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        LoggerHandler.createLogInfo("Scrolled Till the element is in View ");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Switches to a new window.
     */
    public void switchWindow() {
        String parent = driver.getWindowHandle();
        Set<String> child = driver.getWindowHandles();
 
        for (String ch : child) {
            if (!parent.equals(ch)) {
                driver.switchTo().window(ch);
            }
        }
        LoggerHandler.createLogInfo("Driver Switched to new Window");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Sends the Enter key to the element located by the given locator.
     *
     * @param locator The locator of the element.
     */
    public void pressEnter(By locator) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.ENTER);
        LoggerHandler.createLogInfo("Enter Action Performed");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Click The element located by given locator
     *
     * @param locator The locator of the element.
     */
    public void clickTheElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
        LoggerHandler.createLogInfo("Clicked the Element with locator " + locator);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Hovers over the element located by the given locator.
     *
     * @param locator The locator of the element.
     */
    public void hover(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).pause(Duration.ofSeconds(2)).perform();
        LoggerHandler.createLogInfo("Hovered Over the Element with locator " + locator);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Hovers over the element and clicks on it.
     *
     * @param locator The locator of the element.
     */
    public void hoverAndClick(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).pause(Duration.ofSeconds(2)).click().build().perform();
        LoggerHandler.createLogInfo("Hovered Over the Element And Clicked the element with locator " + locator);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Selects an option from a dropdown by its value.
     *
     * @param locator The locator of the dropdown element.
     * @param value   The value of the option to select.
     */
    public void selectByValue(By locator, String value) {
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByValue(value);
        LoggerHandler.createLogInfo("Selected The Option from The DropDown with Value " + value);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Selects an option from a dropdown by its visible text.
     *
     * @param locator     The locator of the dropdown element.
     * @param visibleText The visible text of the option to select.
     */
    public void selectByVisibleText(By locator, String visibleText) {
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);
        LoggerHandler.createLogInfo("Selected The Option from The DropDown with Visible Text " + visibleText);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Selects an option from a dropdown by its index.
     *
     * @param locator The locator of the dropdown element.
     * @param index   The index of the option to select.
     */
    public void selectByIndex(By locator, int index) {
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
        LoggerHandler.createLogInfo("Selected The Option from The DropDown with Index " + index);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Verifies that the current URL matches the expected URL.
     *
     * @param driver      The WebDriver instance.
     * @param expectedUrl The expected URL to verify against.
     */
    public void verifyUrl(String expectedUrl) {
        try {
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl);
            LoggerHandler.createLogInfo("Verified The Url");
        } catch (AssertionError e) {
            LoggerHandler.createLogInfo("Url Mismatch");
            e.printStackTrace();
        }
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Verifies that the current page title matches the expected title.
     *
     * @param driver        The WebDriver instance.
     * @param expectedTitle The expected title to verify against.
     */
    public void verifyTitle(String expectedTitle) {
        try {
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
            LoggerHandler.createLogInfo("Verified The Title");
        } catch (AssertionError e) {
            e.printStackTrace();
            LoggerHandler.createLogInfo("Title Mismatch");
        }
 
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Scrolls to the element using JavaScript and click.
     *
     * @param locator The locator of the element to scroll to.
     */
    public void scrollToElementandCLick(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        LoggerHandler.createLogInfo("Scrolled Till The Element And Clicked The Element");
    }
}