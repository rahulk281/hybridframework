

package pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPagePom extends BaseClass{
	
	
	public LoginPagePom()
	{
		PageFactory.initElements(driver, this);
	}
	
	//p[text() = 'Username : Admin']
		@FindBy(xpath = "//p[text() = 'Username : Admin']")
		private WebElement userNameText; 

	//p[text() = 'Password : admin123']
		@FindBy(xpath = "//p[text() = 'Password : admin123']")
		private WebElement passwordText;
	
	
	//input[@placeholder='Username']
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userTextField;
		
	//input[@placeholder='Password']
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordTextField;

	
	//button[ @type = 'submit']
	@FindBy(xpath = "//button[ @type = 'submit']")
	private WebElement loginButton;

	//p[text() ='Forgot your password? ']
	@FindBy(xpath = "//p[text() ='Forgot your password? ']")
	private WebElement forgotPassword;
	
	
	// get value from element
	
	public String getUserText()
	{
		
		String text = userNameText.getText();
	    return	text.substring(text.indexOf('A'));
		
		
	}
	
	public String getPasswordText()
	{
		String password = passwordText.getText();
		return password.substring(password.lastIndexOf('a'));
	}
	
	
	// set value to textfield

	public void setUserText(String userNameText)
	{
		userTextField.sendKeys(userNameText);
		
	}
	public void setPasswordText(String passwordText)
	{
		passwordTextField.sendKeys(passwordText);
	}

	
	// actions perform
	
	public void loginClick()
	{
		loginButton.click();
	}
	
	public void forgotPasswordClick()
	{
		forgotPassword.click();
	}
	
}
