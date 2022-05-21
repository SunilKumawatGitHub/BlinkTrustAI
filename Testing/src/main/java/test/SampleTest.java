package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class SampleTest extends BaseTest {
	
	HomePageEvents homePageEvents =  new HomePageEvents();
	LoginPageEvents loginPageEvents = new LoginPageEvents();

	@Test
	public void sampleMethodForEmailEntry()
	{
		homePageEvents.clickOnSignInButton();
		loginPageEvents.verifyLoginPageOpenOrNot();
		loginPageEvents.enterEmailId();
	}
}
