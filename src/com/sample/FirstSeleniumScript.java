package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//1.Navigate to the selenium website
		
		driver.get("https://www.selenium.dev");
		
		//2.Read the title and check title
		
		String title = driver.getTitle();
		
		if("Selenium".equals(title))
		{
			System.out.println("Test cases passed");
		}
		else
		{
			System.out.println("Test cases failed");
		}
		
		//3.Close the browser
		
		driver.close();
		
		
	}

}
