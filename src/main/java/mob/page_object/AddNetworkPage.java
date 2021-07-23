package mob.page_object;

import io.appium.java_client.AppiumDriver;
import mob.locators.AddNetworkPageLocators;

public class AddNetworkPage extends BaseActions
{
	public AddNetworkPage(AppiumDriver driver)
	{
		super(driver);
	}

	public void addNewNetwork(String ssid)
	{
		waitForElementByXpathAndSendKeys(AddNetworkPageLocators.txtFieldNetworkName, ssid, "Field 'Network name' not found");
		waitForElementAndClick(AddNetworkPageLocators.btnSave, "Can not find Save button");

	}
}
