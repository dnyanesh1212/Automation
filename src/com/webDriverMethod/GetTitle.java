package com.webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.dev");
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	driver.close();
}
}
