package com.opencart.qa.utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils 
{
	private WebDriver driver;
	WebDriverWait wait;

	
	public ElementUtils(WebDriver driver)
	{
		this.driver=driver;	
	}
	
	public By getBy(String locatorType, String locatorValue)
	{
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "className":
			locator = By.className(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "cssSelector":
			locator = By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		default:
			System.out.println("Please pass the correct locator "+locator);
			break;
		}
		return locator;
	}
	/*
	 * findElement Generic methods
	 * 
	 */
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public WebElement getElement(String locatorType, String locatorValue)
	{
		return driver.findElement(getBy(locatorType,locatorValue ));
	}
	
	/*
	 * findElements Generic methods
	 * 
	 */
	
	public List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public List<WebElement> getElements(String locatorType, String locatorValue)
	{
		return driver.findElements(getBy(locatorType,locatorValue ));
	}
	/**
	 * 
	 * @param locator - any locator
	 * @param value - which u want to enter into the tex field
	 */
	public void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	
	public void doSendKeys(String locatorType, String locatorValue,String value)
	{
		getElement(getBy(locatorType, locatorValue)).sendKeys(value);
	}
	
	/**
	 * Clicking on the elements-> Click util
	 */
	
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public void doClick(String locatorType, String locatorValue)
	{
		getElement(getBy(locatorType, locatorValue)).click();
	}
	
	public String getCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	
	public String getCurrentPageTitle()
	{
		return driver.getTitle();
	}
	
/**
 * Select DropDown Utils
 * @return 
 */
	public Select doSelectDropDown(By locator)
	{
		WebElement selectDropDown = getElement(locator);
		Select selOption = new Select(selectDropDown);
		return selOption;
	}
	
	public void getSelectDropDownOptions(By locator, String stateName)
	{
		List<WebElement> options = doSelectDropDown(locator).getOptions();
		
		for(WebElement e : options)
		{
			String option= e.getText();
			System.out.println(option);
			if(option.equals("stateName"))
			{
				e.click();
				break;
			}
		}
		
		
	}
	
	public void doSelectDropDownByindex(By locator, int indexValue)
	{
		doSelectDropDown(locator).selectByIndex(indexValue);
	}
	
	public void doSelectDropDownByValue(By locator, String value)
	{
		doSelectDropDown(locator).selectByValue(value);
	}
	
	public void doSelectDropDownByVisibleText(By locator, String text)
	{
		doSelectDropDown(locator).selectByVisibleText(text);
	}
	
	/**
	 * is Displayed method
	 */
	public Boolean doItemDisplayed(By locator)
	{
		return driver.findElement(locator).isDisplayed();
		
	}
	
	/**
	 * Synchronization
	 * @return 
	 */
	
	public void doClickWait(String locatorType, String locatorValue, int duration)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		WebElement el = wait.until(ExpectedConditions.visibilityOf(getElement(locatorType, locatorValue)));
		el.click();
	}

	public void doClickWait(By locator, int duration)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		WebElement el = wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
		el.click();
	}
	
	public void doClickWait(By locator, int duration, int interval)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(duration, interval));
		WebElement el = wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
		el.click();
	}

}
