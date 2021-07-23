package settings;

import org.springframework.util.Assert;
import org.testng.annotations.Test;

public class WifiSettingsTests extends TestBase
{
	@Test()
	public void addWifiNetwork()
	{
		settingsPage().openNetworkAndInternetSettings();

		networkAndInternetPage().openWifiSettings();

		wifiPage().clickAddNetwork();

		String ssid = "new_wifi_" + Math.random();
		addNetworkPage().addNewNetwork(ssid);

		wifiPage().openSavedNetworks();

		Assert.isTrue(savedNetworksPage().getSavedNetworks().contains(ssid),
				"The saved network - '" + ssid + "' is not in the list");
	}
}
