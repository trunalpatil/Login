package com.Practice.com.Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
driver.manage().window().maximize();
driver.findElement(By.cssSelector(".blinkingText")).click();
Set<String> windows=driver.getWindowHandles();
driver.switchTo().window()
	}

}
