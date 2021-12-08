package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutorpractice1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//open the browser
	js.executeScript("window.location='https://www.facebook.com/'");  
		
	// to enter text in text box
	js.executeScript("document.getElementById('email').value='dedhia.rinkal@gmail.com'");
	js.executeScript("document.getElementById('pass').value='123niravi'");
	
	// to click on login
	WebElement login=driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click();",login);
	
	//to scroll down
	js.executeScript("window.scrollBy(0,500)");

	


	}

}
