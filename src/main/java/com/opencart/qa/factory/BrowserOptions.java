package com.opencart.qa.factory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserOptions 
{
	public ChromeOptions co;
	public FirefoxOptions fo;
	public EdgeOptions eo;
	public Properties prop;
public BrowserOptions(Properties prop)
{
	this.prop = prop;
}
	public ChromeOptions chromeOptions()
	{
		co = new ChromeOptions();
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) co.addArguments("--incognito");
		if(Boolean.parseBoolean(prop.getProperty("headless"))) co.addArguments("--headless");
			return co;	
	}
	public FirefoxOptions firefoxOptions()
	{
		fo = new FirefoxOptions();
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) co.addArguments("--incognito");
		if(Boolean.parseBoolean(prop.getProperty("headless"))) co.addArguments("--headless");
			return fo;	
	}
	public EdgeOptions edgeOptions()
	{
		eo = new EdgeOptions();
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) co.addArguments("--incognito");
		if(Boolean.parseBoolean(prop.getProperty("headless"))) co.addArguments("--headless");
			return eo;	
	}

}
