package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch elementFetch = new ElementFetch();
	public void verifyLoginPageOpenOrNot()
	{
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.loginText).size() > 0, "Login Page not get open");
	}
	
	public void enterEmailId()
	{
		elementFetch.getWebElement("ID", "emailAddress").sendKeys("connectwithsunilkumawat@yahoo.com");
	}
}
