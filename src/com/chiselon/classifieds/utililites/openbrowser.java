package com.chiselon.classifieds.utililites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class openbrowser
{
	public WebDriver driver;
	
	public WebDriver browser(String browservalue)
	{
		try{
		
			if(browservalue.equalsIgnoreCase("chrome"))
			{
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Suresh Babu\\workspace\\ColourClassifieds\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			
			}
			else if(browservalue.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
				
			}
			else if(browservalue.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver","C:\\Users\\Suresh Babu\\workspace\\ColourClassifieds\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else
			{
				System.out.println(browservalue+ " :is not valid");
			}
		return driver;
		
			}
           catch(Exception e)
		    {
	           System.out.println("broswervalue not valid----->"+e.getMessage());
               return null;
		    }
	
	}
		
		
}
