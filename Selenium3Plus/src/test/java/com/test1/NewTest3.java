package com.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 {

@Test
public void testHDFC()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Projects\\CommerceCloud\\drivers\\chromedriver.exe");
	
	//Browser Loading
	WebDriver driver=new ChromeDriver();
	driver.get("http://hdfcbank.com/");
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

	//Action Class for Move Elements
	Actions act1=new Actions(driver);
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().perform();
	
	//Verify page
	Assert.assertTrue(driver.getTitle().startsWith("Demat"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.quit();
	
	}
	
}
