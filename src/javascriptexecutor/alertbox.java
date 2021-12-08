package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait

		driver.get("https://www.google.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;  
		// To generate alert box
		//js.executeScript("alert('hello')");
		
		// To generate confirm box
		//js.executeScript("confirm('are you sure')");
		
		// To generate prompt box
		js.executeScript("prompt('enter your name')");
	}

}
