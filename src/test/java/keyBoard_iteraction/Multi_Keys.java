package keyBoard_iteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_Keys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();

		WebElement box1 = driver.findElement(By.cssSelector("#inputText1"));
		// WebElement box2 = driver.findElement(By.id("#inputText2"));

		box1.sendKeys("Hi i am Trunal");

		Actions a = new Actions(driver);
		// ctrl+a
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a");
		a.keyUp(Keys.CONTROL);
		a.perform();

		// ctrl+c
		a.keyDown(Keys.CONTROL);
		a.sendKeys("c");
		a.keyUp(Keys.CONTROL);
		a.perform();

		// Tab- shift to input 2 box
		a.sendKeys(Keys.TAB);
		a.perform();

		// cert+v
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v");
		a.keyUp(Keys.CONTROL);
		a.perform();

		
	}

}
