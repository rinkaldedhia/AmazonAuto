package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class karnataktransport {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.get("https://ksrtc.in/oprs-web/guest/home.do");
driver.manage().window().maximize();
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,500)");
WebElement Searchbutton=driver.findElement(By.xpath("//*[@class=\"btn btn-primary btn-lg btn-block btn-booking\"]"));
Thread.sleep(3000);
js.executeScript("arguments[0].click()", Searchbutton);
driver.switchTo().alert().accept();

	
	
	}

}
