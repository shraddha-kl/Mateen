package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		 {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			// 1. Navigate to the website
			
			//Id and name locators
			
			driver.get("http://www.automationpractice.pl/index.php");
			//driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
			
			//driver.findElement(By.name("submit_search")).click();
			
			//LinkText
			
			//driver.findElement(By.linkText("Printed Chiffon Dress"));
			
			//PartialLinkText
			
			//driver.findElement(By.partialLinkText("Printed Chiffon Dress"));
			
			//ClassName
			
			int sliders=driver.findElements(By.className("homeslider-container")).size();
			System.out.println(sliders);
			
		    //TagName
			
			int links=driver.findElements(By.tagName("a")).size();
			System.out.print(links);
			
					
			
			
			
			
			
			

	}

}
}
