package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
driver.manage().window().maximize();
driver.findElement(By.id("at-cv-lightbox-close")).click();
driver.findElement(By.id("user-message")).sendKeys("hello how are you?");
driver.findElement(By.xpath("//*[@id='get-input'] //*[@type='button']")).click();

driver.findElement(By.id("sum1")).sendKeys("100");
driver.findElement(By.id("sum2")).sendKeys("200");
driver.findElement(By.xpath("//*[@id='gettotal'] //*[@type='button']")).click();
	

	}

}
