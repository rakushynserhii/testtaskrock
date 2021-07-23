package settings;

import io.appium.java_client.AppiumDriver;
import mob.page_object.*;

public class PageBase
{
	protected AppiumDriver driver;

	protected SettingsPage settingsPage()
	{
		return new SettingsPage(driver);
	}

	protected NetworkAndInternetPage networkAndInternetPage()
	{
		return new NetworkAndInternetPage(driver);
	}

	protected WifiPage wifiPage()
	{
		return new WifiPage(driver);
	}

	protected AddNetworkPage addNetworkPage()
	{
		return new AddNetworkPage(driver);
	}

	protected SavedNetworksPage savedNetworksPage()
	{
		return new SavedNetworksPage(driver);
	}
}
