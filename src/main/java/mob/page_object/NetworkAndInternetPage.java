package mob.page_object;

import io.appium.java_client.AppiumDriver;
import mob.locators.NetworkAndInternetPageLocators;
import mob.locators.WifiPageLocators;

public class NetworkAndInternetPage extends BaseActions
{
	public NetworkAndInternetPage(AppiumDriver driver)
	{
		super(driver);
	}

	public void openWifiSettings()
	{
		waitForElementAndClick(NetworkAndInternetPageLocators.linkWifi, "Can not find wifi settings");
		waitForElementPresent(WifiPageLocators.btnAddNetwork, "Wifi settings did not open");
	}
}
