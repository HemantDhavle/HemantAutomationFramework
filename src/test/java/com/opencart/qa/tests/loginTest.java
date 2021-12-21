package com.opencart.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.qa.utility.Constants;

public class loginTest extends baseTest
{
	
	@Test
	public void validateLoginPageTitleTest()
	{
		String actualTitle= loginPage.getCurrentPageTitle();
		Assert.assertEquals(actualTitle, Constants.LOGIN_PAGE_TITLE);
	}
	
	
	@Test
	public void validateLoginPageURLTest()
	{
		String actualTitle= loginPage.getCurrentPageURL();
		Assert.assertEquals(actualTitle, Constants.LOGIN_PAGE_URL_FRACTION);
	}
	
	@Test
	public void doLoginTest()
	{
		loginPage.doLogin(prop.getProperty("un"), prop.getProperty("pw"));
	}


}
