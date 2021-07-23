package mob.page_object;

import io.appium.java_client.AppiumDriver;
import mob.locators.AddNetworkPageLocators;
import mob.locators.SavedNetworksPageLocators;
import mob.locators.WifiPageLocators;

public class WifiPage extends BaseActions
{
	public WifiPage(AppiumDriver driver)
	{
		super(driver);
	}

	public void clickAddNetwork()
	{
		waitForElementAndClick(WifiPageLocators.btnAddNetwork, "Can not find Add network button");
		waitForElementPresent(AddNetworkPageLocators.txtFieldNetworkName, "Add network page did not open");
	}

	public void openSavedNetworks()
	{
		waitForElementAndClick(WifiPageLocators.linkSaveNetworks, "Can not find Saved networks link");
		waitForElementPresent(SavedNetworksPageLocators.itemSavedNetworks, "Saved networks page did not open");
	}
}
