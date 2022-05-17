package com.scripts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class S2_BrowserActions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// ucan use "//" also
		//Open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println(title);
					
		driver.findElement(By.id("username")).sendKeys("admin");
		System.out.println("Entered the username");
		Thread.sleep(2000);
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    System.out.println("Entered the password ");
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    System.out.println("Clicked on login button");
	
	   
	    Thread.sleep(5000);
	    String text = driver.findElement(By.id("logoutLink")).getText();
	   
	    //driver.findElement(By.linkText("Logout"));
	    //driver.findElement(By.partialLinkText("Logo"));
	    System.out.println(text); 
	    driver.findElement(By.id("logoutLink")).click();
	    System.out.println("Clicked on logout button");
	    Thread.sleep(5000);
	    driver.quit();
	   
			

	}

}
