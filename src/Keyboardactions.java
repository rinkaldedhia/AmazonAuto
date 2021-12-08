import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait
	driver.get("https://text-compare.com/");
	WebElement inputtext=driver.findElement(By.id("inputText1"));
	inputtext.click();
	inputtext.sendKeys("Selenium test");
	WebElement inputtext2=driver.findElement(By.id("inputText2"));
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL);
	act.sendKeys("a");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	act.sendKeys(Keys.TAB);
	act.perform();
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("v");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	driver.close();
	
	

	}

}
