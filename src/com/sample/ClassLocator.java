package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in");
		WebElement location = driver.findElement(By.className("_1k81gub"));
		location.sendKeys("Goa",Keys.ENTER);

}
}
