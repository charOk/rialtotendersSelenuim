package ua.com.rialtotenders.pageObject;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Alexander.
 */
public class BasePage {
    private WebDriver driver; //null

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickTo(WebElement element) {
        element.click();
    }

    public void fill(WebElement element, String text) {
        waitUntilElementAppearVisible(element);
        element.sendKeys(text);
        // element.click();
    }

    public WebElement waitUntilElementAppearVisible(WebElement webElement) {
        WebElement result;
        // @param timeOutInSeconds The timeout in seconds when an expectation is called
        // @param sleepInMillis The duration in milliseconds to sleep between polls.
        WebDriverWait driverWait = new WebDriverWait(driver, 60, 500);

        try {

            result = driverWait.until(ExpectedConditions.visibilityOf(webElement));

        } catch (TimeoutException timeException) {
            throw new TimeoutException(timeException.getMessage() +
                    "\nTimeOut while waitUntilElementAppearVisible " +
                    webElement.toString(), timeException.getCause());
        }
        return result;
    }
}
