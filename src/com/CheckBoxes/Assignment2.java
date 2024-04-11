package com.CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//How to get the Count of number of check boxes present in the page
public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type = \"checkbox\"]"));
		int count=0;
		for(WebElement checkBoxCount: checkBox) {
			count++;
		}
		System.out.println("total number of checkBoxes is : " + count);
		
		driver.close();
	}
}
