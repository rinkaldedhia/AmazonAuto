import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://demo.opencart.com/admin/");
	driver.manage().window().maximize();
	WebElement user=driver.findElement(By.id("input-username"));
	user.clear();
	Thread.sleep(2000);
	user.sendKeys("demo");
	WebElement password=driver.findElement(By.id("input-password"));
	password.clear();
	Thread.sleep(2000);
	password.sendKeys("demo");
	
	driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
	WebElement Orders=driver.findElement(By.xpath("//*[@id=\"collapse26\"]/li[1]/a"));
	Actions act=new Actions(driver);
	act.moveToElement(Orders).click().build().perform();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/li[11]/a")).click();
	String totalpages=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/li[11]/span")).getText();
	System.out.println(totalpages);
	}

}
