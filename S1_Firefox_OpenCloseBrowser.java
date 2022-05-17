package com.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S1_Firefox_OpenCloseBrowser {
	public static void main(String[] args) throws InterruptedException  {
// To open firefox browser, navigate to application and close firefox browser
		//FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");// u can use "//" also
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do"); 
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
	}

}
