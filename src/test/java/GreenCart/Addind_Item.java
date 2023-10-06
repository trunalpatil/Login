package GreenCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addind_Item {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

String[] itemsNeeded= {"Cucumber","Brocolli"};

driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
driver.manage().window().maximize();
List <WebElement> productname=driver.findElements(By.cssSelector("h4.product-name"));
System.out.println(productname.size());

for(int i=0;i<productname.size();i++) {
	String name=productname.get(i).getText();
	//check whether name you extracted is present in array or not
	//convert array into aaray list for easy search
    
	List itemsNeededList = Arrays.asList(itemsNeeded);
	if(itemsNeededList.contains(name)) 
	{
		//Click on add to cart
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		
	}
}
	}

}
