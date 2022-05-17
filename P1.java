package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		//driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    Thread.sleep(5000);
	    
	    WebElement logoutLink = driver.findElement(By.id("logoutLink"));
	   String text = logoutLink.getText();
	   System.out.println(text);
	    
	   logoutLink.click();
	   // driver.findElement(By.linkText("Logout")).click();
	  //  driver.findElement(By.partialLinkText("Log")).click();
		driver.quit();
	}

}
