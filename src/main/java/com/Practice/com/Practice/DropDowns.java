package com.Practice.com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();

WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Select dropdown = new Select(staticDropdown);

dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByValue("AED");
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByVisibleText("Select");
System.out.println(dropdown.getFirstSelectedOption().getText());


	}

}
