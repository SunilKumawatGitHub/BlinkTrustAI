package pageEvents;

import utils.ElementFetch;

public class HomePageEvents {

	public void clickOnSignInButton()
	{
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("ID", "sighInButton").click();
	}
}
