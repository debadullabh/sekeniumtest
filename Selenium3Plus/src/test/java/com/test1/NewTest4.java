package com.test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest4 {

@Test
public void cleartrips() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Projects\\CommerceCloud\\drivers\\chromedriver.exe");
	
	//Browser Loading
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.cleartrip.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

	WebElement from=driver.findElement(By.id("FromTag"));
	//Action Class for Move Elements
	
	Actions act1=new Actions(driver);
	act1.keyDown(from, Keys.SHIFT).perform();
	Thread.sleep(2000);
	act1.sendKeys("hyd").perform();
	Thread.sleep(2000);
	act1.keyUp(Keys.SHIFT);
	Thread.sleep(2000);
	act1.sendKeys(Keys.ENTER).perform();
	WebElement to=driver.findElement(By.id("ToTag"));
	to.sendKeys("bang");
	
	
	WebElement ul=driver.findElement(By.id("ui-id-2"));
	List<WebElement> list=ul.findElements(By.tagName("li"));
	for(WebElement e:list)
	{
		String city=e.getText();
		if(city.contains("BKK"))
		{
			e.click();
		}
	}
}
}
