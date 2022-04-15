package com.opencart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.opencart.qa.utility.ElementUtils;

public class loginPage 
{

	private WebDriver driver;
	private ElementUtils elUtil;	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
		elUtil = new ElementUtils(driver);
	}
	
	private By un = By.xpath("//input[@name='email']");
	private By pw = By.xpath("//input[@name='password']");
	private By loginBtn = By.xpath("//input[@type='submit' and @value='Login']");
	
	
	public String getCurrentPageURL()
	{
		return driver.getCurrentUrl();
		
	}
	
	public String getCurrentPageTitle()
	{
		String title = elUtil.getCurrentPageTitle();
		System.out.println("Title of the login page is "+title);
		return title;
		
	}
	
	
	public AddressPage doLogin(String userName, String password)
	{
		elUtil.doSendKeys(un, userName);
		elUtil.doSendKeys(pw, password);
		elUtil.doClick(loginBtn);
		return new AddressPage(driver);
	}

}
