package com.chiselon.classifieds.utililites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suresh Babu\\workspace\\Project\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");
	}

}
