package mouse_Interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement field=driver.findElement(By.cssSelector("#field1"));
		field.clear();
		field.sendKeys("Trunal");
		Actions a = new Actions(driver);
WebElement button=driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
a.doubleClick(button).build().perform();
		
	}

}
