package com.opencart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opencart.qa.utility.ElementUtils;

public class AddressPage {

	private WebDriver driver;
	private ElementUtils el;
	public AddressPage(WebDriver driver) 
	{
	this.driver = driver;
	el = new ElementUtils(driver);
	}
	
	private By addLink = By.xpath("//div[@class='list-group']/a[text()='Address Book']");
	private By addButton = By.xpath("//a[text()='New Address']");
	private By stateDropDown = By.xpath("//select[@name='country_id']");
	
	public Boolean AddressBookLinkPresent()
	{
		Boolean linkPresent= el.doItemDisplayed(addLink);
		if(linkPresent==true)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Link is not present");
		}
		el.doClick(addLink);
		return linkPresent;
	}
	
	public Boolean AddressBookButtonValidate()
	{
		Boolean buttonPresent= el.doItemDisplayed(addButton);
		if(buttonPresent==true)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Button is not present");
		}
		el.doClickWait(addButton, 5);
		return buttonPresent;
	}
	
	public void selectState(String stateValue)
	{
		el.doSelectDropDownByValue(stateDropDown, stateValue);
	}

}
