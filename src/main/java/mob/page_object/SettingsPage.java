package mob.page_object;

import io.appium.java_client.AppiumDriver;
import mob.locators.NetworkAndInternetPageLocators;
import mob.locators.SettingsPageLocators;

public class SettingsPage extends BaseActions
{

	public SettingsPage(AppiumDriver driver)
	{
		super(driver);
	}

	public void openNetworkAndInternetSettings()
	{
		waitForElementAndClick(SettingsPageLocators.linkNetworkAndInternet, "Can not find Network and internet settings");
		waitForElementPresent(NetworkAndInternetPageLocators.linkWifi, "Network and internet settings did not open");
	}

}
