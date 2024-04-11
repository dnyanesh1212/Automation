package com.CheckBoxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;

/*Check the first  Checkbox and verify if it is successfully checked 
and Uncheck it again to verify if it is successfully Unchecked*/
public class Assignmenat1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(2000);
	
	WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
	
	Boolean check = checkBox.isSelected();
	
	if(check== false) {
		checkBox.click();
		boolean result = checkBox.isSelected();
		if(result)
			System.out.println("Check box is selected");
	}
	
	Thread.sleep(5000);
	checkBox.click();
	boolean result = checkBox.isSelected();
	if(result == false)
		System.out.println("Check box is not selected");
	Thread.sleep(5000);
	
	driver.close();
	
	
}
}
