package com.chiselon.classifieds.utililites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class common 
{
	WebDriver driver;
	public void sendkeys(WebDriver driver,String xpathvalue,String sendkeyValue)
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).sendKeys(sendkeyValue);
		}
		catch (Exception e) {
			System.out.println("sendKeys method failed----->"+e.getMessage());
		}
	}
	public void getUrl(WebDriver driver,String Urlvalue)
	{
		try
		{
			driver.get(Urlvalue);
		}
		catch (Exception e) 
		{
			System.out.println("getUrl method failed----->"+e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}



