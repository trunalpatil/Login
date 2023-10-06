package mouse_Interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
	WebElement min_slider=	driver.findElement(By.xpath("//span[1]"));
	System.out.println(min_slider.getLocation());
	System.out.println(min_slider.getSize());
	
	Actions a = new Actions(driver);
	a.dragAndDropBy(min_slider, 100, 0).perform();
	
	System.out.println(min_slider.getLocation());
	System.out.println(min_slider.getSize());
	
WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
a.dragAndDropBy(max_slider, -100, 0).perform();
	}

}
