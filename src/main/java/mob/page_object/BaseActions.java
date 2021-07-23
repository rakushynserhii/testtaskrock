package mob.page_object;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions
{
	protected AppiumDriver driver;

	public BaseActions(AppiumDriver driver)
	{
		this.driver = driver;
	}

	protected WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.withMessage(error_message + "\n");
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	protected WebElement waitForElementPresent(By by, String error_message)
	{
		return waitForElementPresent(by, error_message, 3);
	}

	protected WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds)
	{
		WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
		element.click();
		return element;
	}

	protected WebElement waitForElementAndClick(By by, String error_message)
	{
		return waitForElementAndClick(by, error_message, 3);
	}

	protected WebElement waitForElementByXpathAndSendKeys(By by, String value, String error_message, long timeoutInSeconds)
	{
		WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
		element.sendKeys(value);
		return element;
	}

	protected WebElement waitForElementByXpathAndSendKeys(By by, String value, String error_message)
	{
		return waitForElementByXpathAndSendKeys(by, value, error_message, 3);
	}
}
