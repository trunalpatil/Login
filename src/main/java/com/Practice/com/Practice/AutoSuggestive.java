package com.Practice.com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
driver.findElement(By.id("autosuggest")).sendKeys("Indi");
Thread.sleep(3000L);
List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
System.out.println(options.size());

for(WebElement option :options) {
	if(option.getText().equalsIgnoreCase("India"))
	{
		option.click();
		break;
	}
}

	}

}
