package com.Practice.com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PassengerDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement passenger = driver.findElement(By.id("divpaxinfo"));
		passenger.click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000L);
//driver.findElement(By.id("hrefIncAdt")).click();

	/*	int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();

			i++;

		}*/
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

			
		}
driver.findElement(By.id("btnclosepaxoption")).click();

System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
