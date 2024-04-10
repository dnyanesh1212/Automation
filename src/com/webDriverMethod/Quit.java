package com.webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement childWindow = driver.findElement(By.id("openwindow"));
		childWindow.click();
		Thread.sleep(5000);
		driver.quit();
	}
}
