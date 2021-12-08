package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumpractice2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");	
	driver.manage().window().maximize();
	WebElement Selectdropdown=driver.findElement(By.id("select-demo"));
	Selectdropdown.click();
	Select sel=new Select(Selectdropdown);
	sel.selectByVisibleText("Wednesday");
	Thread.sleep(3000);
	sel.selectByIndex(2);  //monday
	Thread.sleep(3000);
	sel.selectByValue("Friday");
	}

}
