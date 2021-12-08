package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");	
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("New");
	List<WebElement>options=driver.findElements(By.cssSelector(".select2-results__option"));
	System.out.println(options.size());
	for(WebElement e:options)
	{
		if(e.getText().contains("New York"))
		{
			e.click();
			System.out.println(e);
			break;
		}
		
	}
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[2]/span/span[1]/span/span[2]")).click();
			
}
}


