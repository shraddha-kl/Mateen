package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String args[])
	{
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("David");
		
	}
}
