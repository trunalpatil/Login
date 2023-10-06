package com.Practice.com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSPractice {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.cssSelector("#email")).sendKeys("trunal123");//by tag&id use-#id or  tag _name#idValue
//driver.findElement(By.cssSelector("input#email")).sendKeys("trunal123");
driver.findElement(By.cssSelector("#pass")).sendKeys("TRUNAL");
driver.findElement(By.cssSelector("[name=login]")).click();

driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
//driver.close();

	}

}
