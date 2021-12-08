package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");	
	driver.manage().window().maximize();
	WebElement Checkbox=driver.findElement(By.id("isAgeSelected"));
	if(Checkbox.isDisplayed()&& Checkbox.isEnabled())
	{
		Checkbox.click();
	}
	List<WebElement> totalcheckboxes=driver.findElements(By.xpath("//*[@class='checkbox']"));
	System.out.println(totalcheckboxes.size());
	
	driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input")).click();

	}

}
