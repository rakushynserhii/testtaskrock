package settings;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

public class TestBase extends PageBase
{
	@BeforeMethod
	public void setUp() throws Exception
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "AndroidTestDevice");
		desiredCapabilities.setCapability("platformVersion", "9");
		desiredCapabilities.setCapability("automationName", "Appium");
		desiredCapabilities.setCapability("appPackage", "com.android.settings");
		desiredCapabilities.setCapability("appActivity", ".Settings");

		String appiumURL = "http://0.0.0.0:4723/wd/hub";
		driver = new AndroidDriver<MobileElement>(new URL(appiumURL), desiredCapabilities);
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
