package com.opencart.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practiseTestNGAnnotation 
{
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("THis is before suite method");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("This is before test method");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("This is before class method");
	}

	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("This is before method");
	}
	
	@DataProvider
	public Object[][] dataMethod()
	{
		Object [][] data = new Object[][]
				{{"fn1", "ln1"},
			{"fn2", "ln2"},
			{"fn3", "ln3"},
			{"fn4", "fn4"}
				};
				return data;
	}
	
	@Test (dataProvider = "dataMethod" , priority = 2)
	public void practiseTest1(String username, String password)
	{
		System.out.println("This is your username"+username);
		System.out.println("This is your password"+password);
	}
	
	@Test (priority = 1)
	public void practiseTest2()
	{
		System.out.println("This is test method 2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is after class method");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("This is after test method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is after suite method");
	}
}
