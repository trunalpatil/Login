package com.Practice.com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarDate {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'11')]")).isEnabled());
		driver.findElement(By.xpath("//a[contains(text(),'11')]")).click();
		
	//	System.out.println(driver.findElement(By.cssSelector(".custom_date_pic.required.home-date-pick.valid")).isEnabled());
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	

	}

}
