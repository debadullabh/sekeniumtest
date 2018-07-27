package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test
	public void testMercuryToursLogin()
	{	
		System.setProperty("webdriver.chrome.driver","C:\\Projects\\CommerceCloud\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","C:\\Projects\\CommerceCloud\\drivers\\IEDriverServer.exe");
		//webdriver.chrome.driver is driver key
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		//ChromeDriver is the constructor of class
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		//Assert.assertEquals(title,"Find a Flight: Mercury Tours")
		Assert.assertTrue(title.startsWith("Find a"));
	
}}
