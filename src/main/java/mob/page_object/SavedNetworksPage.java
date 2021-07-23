package mob.page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mob.locators.SavedNetworksPageLocators;

import java.util.ArrayList;

public class SavedNetworksPage extends BaseActions
{
	public SavedNetworksPage(AppiumDriver driver)
	{
		super(driver);
	}

	public ArrayList<String> getSavedNetworks()
	{
		ArrayList<String> networkNames = new ArrayList<>();
		ArrayList<MobileElement> savedNetworks = (ArrayList<MobileElement>) driver.findElements(SavedNetworksPageLocators.itemSavedNetworks);

		for (MobileElement savedNetwork : savedNetworks)
		{
			networkNames.add(savedNetwork.getAttribute("text"));
		}

		return networkNames;
	}
}
