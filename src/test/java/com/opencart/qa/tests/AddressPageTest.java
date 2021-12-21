package com.opencart.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencart.qa.pages.AddressPage;

public class AddressPageTest extends baseTest
{
	public AddressPage addressPage;
	
	@BeforeClass
	public void doLoginTest()
	{
		addressPage = loginPage.doLogin(prop.getProperty("un"), prop.getProperty("pw"));
	}
	
	@Test
	public void AddressBookLinkPresentTest()
	{
		Boolean linkPresent= addressPage.AddressBookLinkPresent();
		Assert.assertTrue(linkPresent);
		
	}

	
	@Test
	public void AddressBookButtonValidateTest()
	{
		Boolean buttonPresent= addressPage.AddressBookButtonValidate();
		Assert.assertTrue(buttonPresent);
	}
	
	@Test
	public void selectStateTest()
	{
		addressPage.selectState("3516");
	}

}
