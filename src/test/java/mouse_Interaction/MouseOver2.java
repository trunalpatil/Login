package mouse_Interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	WebElement desktop=	driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions a = new Actions(driver);
	a.moveToElement(desktop).moveToElement(mac).click().perform();
	}

}
