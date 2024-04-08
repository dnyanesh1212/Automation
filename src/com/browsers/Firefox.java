package com.browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new FirefoxDriver();
		// Both line will invoke the Firefox browser
		//ChromeDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.close();
	}
}
