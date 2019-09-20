package com.practice.SeleniumTest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class mapi {
	
	WebDriver driver;
	
	
	@Test(dependsOnMethods = "inth", alwaysRun = true )
	public void test56()
	{
		System.out.println("will it run");
	}
	
	
	@Test
	public void inth() {
	HashMap<Integer,String> map = new HashMap<Integer,String>();
     int i =3;
     String sop = "ddf";
     
     
	
	
	map.put(2,"Rjk");
	map.put(3,"Y");
	map.put(3, "B");
	map.put(5, "A");
	map.put(6, "A");

	
	System.out.println("gettg 3 vaue " +map.get(3));
	System.out.println(map.clone().equals(map));
	
	HashMap<Integer,String> h2 = new HashMap<Integer,String>();
	h2 = (HashMap<Integer, String>) map.clone();
	System.out.println(h2.equals(map));
	System.out.println(h2.get(5));
	System.out.println(h2.containsKey(2));
	System.out.println(h2.containsValue("B"));
	System.out.println(h2.isEmpty());
	System.out.println(h2.keySet());
	System.out.println(h2.values());
	

	
	}
	
	
	
	@Test
	public void intmap() {
		LinkedHashMap<String,String> map = new LinkedHashMap<String ,String>();
		map.put("iron","Rjk");
				map.put("bat", "B");
		map.put("lion", "A1");
		map.put("hero", "A");
		
		System.out.println("LH" +map);
		
	HashMap<String,String> h3 = new HashMap<String,String>();
		h3.putAll(map);
		
		System.out.println (" Mp" +h3);
		
		
	
	}
	
	Object d[][] = {{4,1},
			{3,2}};
	
	@Test(dataProvider = "log")
	public void data1(Object d, Object g)
	{
	
	HashMap<Object , Object> h8 = new HashMap<Object , Object>();
	h8.put(d,g);
	System.out.println("mpa-->"  +(h8.get(3)[0]));
	
	}
	@DataProvider(name="log")
	public Object[][] int8()
	{
return d;
	
	}
	
	
	}


