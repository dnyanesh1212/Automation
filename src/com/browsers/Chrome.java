package com.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		// Both line will invoke the Chrome browser
//		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.close();
	}
}
