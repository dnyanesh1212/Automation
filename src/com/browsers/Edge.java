package com.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new EdgeDriver();
		// Both line will invoke the Edge browser
		//ChromeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.close();
	}
}
