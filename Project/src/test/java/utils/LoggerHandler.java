package utils;
 
 
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
 
/**
 * Author: Vignesh
 * LoggerHandler is a utility class for logging informational and error messages.
 * It also provides methods to log messages along with attribute text retrieved
 * from a web element in Selenium WebDriver.
 */
public class LoggerHandler {
 
    // Static Logger instance initialized for this class.
    private static Logger logger = Logger.getLogger(LoggerHandler.class);
 
    /**
     * Logs an informational message.
     * @param message The message to be logged as info.
     */
    public static void createLogInfo(String message) {
        logger.info(message);
    }
 
    /**
     * Logs an error message.
     * @param message The message to be logged as an error.
     */
    public static void createLogError(String message) {
        logger.error(message);
    }
 
    /**
     * Retrieves the text value of a web element identified by the given locator.
     * @param locator The By locator to identify the web element.
     * @return The text value of the identified web element.
     */
    public static String getAttributeTextValue(By locator) {
        return Base.driver.findElement(locator).getText();
    }
 
    /**
     * Logs an informational message concatenated with the text value of a web element.
     * @param locator The By locator to identify the web element.
     * @param messagePrefix The prefix message to be concatenated with the web element's text.
     */
    public static void createLogTextInfo(By locator, String messagePrefix) {
        logger.info(messagePrefix + getAttributeTextValue(locator));
    }
 
    /**
     * Logs an error message concatenated with the text value of a web element.
     * @param locator The By locator to identify the web element.
     * @param messagePrefix The prefix message to be concatenated with the web element's text.
     */
    public static void createLogTextError(By locator, String messagePrefix) {
        logger.error(messagePrefix + getAttributeTextValue(locator));
    }
}