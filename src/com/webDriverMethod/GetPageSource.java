package com.webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		
		String sourceCode = driver.getPageSource();
		
		System.out.println(sourceCode);
		driver.close();
	}

}
