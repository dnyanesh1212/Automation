package com.webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.dev");
	
	String Url = driver.getCurrentUrl();
	
	System.out.println(Url);
	driver.close();
}
}
