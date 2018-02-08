package com.chiselon.classifieds.regression;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;

import com.chiselon.classifieds.utililites.common;
import com.chiselon.classifieds.utililites.openbrowser;

public class TC001 extends common
{
	WebDriver driver;
	openbrowser obj=new openbrowser();
	
	@Test
	public void business() throws Exception
	{
	driver=obj.browser("chrome");
	
	driver.get("https://www.google.com");
	sendkeys(driver,"//input[@id='lst-ib']","baba ramdev");
	
	}
	

}