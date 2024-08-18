package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// 1. Navigate to the website
		
		driver.get("https://stackoverflow.com/users/login");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("shraddhak812@gmail.com");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("passw0rd");
		
		//Login
		driver.findElement(By.className("flex--item s-btn s-btn__filled")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total anchor tags:"+ links.size());
		for(WebElement link:links)
		{
			System.out.print(link);
		}
		
	}

}
