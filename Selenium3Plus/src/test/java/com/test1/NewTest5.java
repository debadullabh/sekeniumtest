package com.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest5 {

	@Test
	public void draganddrop() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\CommerceCloud\\drivers\\chromedriver.exe");
		
		//Browser Loading
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement From =driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
		WebElement to=driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
		
		Actions act1=new Actions(driver);
		act1.dragAndDrop(From, to).perform();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("ctl00_ContentPlaceholder1_Label1"), "Drop a package here to check price"));
		
		//Thread.sleep(5000);
		String price=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
		System.out.println(price);

}
}
