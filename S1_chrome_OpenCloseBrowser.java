package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1_chrome_OpenCloseBrowser 
{
	public static void main(String[] args) throws InterruptedException  
	{
				// To open chrome browser, navigate to application and close chrome browser
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// u can use "//" also
				//Open the browser
				//ChromeDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();		
				driver.get("https://demo.actitime.com/login.do");
				//driver.navigate().to("https://demo.actitime.com/login.do");
				Thread.sleep(2000);
				
				String title = driver.getTitle();
				System.out.println(title);
				
				String url = driver.getCurrentUrl();
				System.out.println(url);
				Thread.sleep(2000);
				
				
			
				//driver.close();
				driver.quit();
			}

		}

