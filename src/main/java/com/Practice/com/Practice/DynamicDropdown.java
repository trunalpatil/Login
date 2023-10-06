package com.Practice.com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
driver.findElement(By.xpath("//a[@value='BLR']")).click();
Thread.sleep(2000L);
driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();





	}

}
