package com.opencart.qa.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Arrayss {

	public static void main(String[] args) 
	{
		//static array
		
		String [] name = new String [5];
		name[0] = "hemant";
		name[1] = "practicing";
		name[2] = "automation";
		name[3] = "testing";
		String na= Arrays.toString(name);
		System.out.println(na);
		
		
		//object array
		Object [] name1 = new Object [] {"asda",1313};
		String na1= Arrays.toString(name1);
		System.out.println(na1);
		
		//ArrayList
		ArrayList<String> emp = new ArrayList<String>(Arrays.asList("hemant","asda", "adsd"));
		emp.add("hemant1");
		emp.add("hemant2");
		emp.add("hemant3");
		emp.add("hemant4");
		emp.add("hemant5");
		Collections.sort(emp);
		System.out.println(emp);
		
		
		//Map
		HashMap<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("name1", "password1");
		countryMap.put("name2", "password2");
		countryMap.put("name3", "password3");
		countryMap.put("name4", "password4");
		countryMap.put("name5", "password5");
		//Collections.sort(countryMap);
		countryMap.forEach((k,v)->System.out.println(k+" ++++++ "+v));
		
		
	}
}