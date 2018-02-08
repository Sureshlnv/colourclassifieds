package com.chiselon.classifieds.utililites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class Test_1 {
	
	

	public static void main(String[] args) 
	{
			//System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.ie.driver","C:\\Users\\Suresh Babu\\workspace\\Project\\Drivers\\IEDriverServer.exe");
			
		//System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
		//WebDriver  driver = new ChromeDriver();
		WebDriver  driver = new InternetExplorerDriver();
	
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
	
	}

}
