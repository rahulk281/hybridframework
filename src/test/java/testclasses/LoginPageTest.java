package testclasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.LoginPagePom;

public class LoginPageTest extends BaseClass{
	
	
	
	@BeforeTest
	public void setup()
	{
		launchWeb();
	}
	@AfterTest
	public void teardown()
	{
		
	}
	
	@Test
	public void checkPageTitle()
	{
		
		String pageTitle = driver.getTitle();
		
		if(pageTitle.equalsIgnoreCase("OrangeHRM"))
		{
			System.out.println("We are on correct page");
		}
		
		
	}
	@Test
	
	public void loginWithCorrectCreditial()
	{
		LoginPagePom loginPagePom = new LoginPagePom();
	    String username=	loginPagePom.getUserText();
		String password = loginPagePom.getPasswordText();
		loginPagePom.setUserText(username);
		loginPagePom.setPasswordText(password);
		loginPagePom.loginClick();
	}
}
