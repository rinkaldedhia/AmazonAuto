package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice3 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/span/span[1]/span/span[2]")).click();
	List<WebElement>Countrys=driver.findElements(By.cssSelector(".select2-results__option"));
	System.out.println(Countrys.size());
	
	driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]")).click();
				
		
	}

}
