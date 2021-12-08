package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait
driver.manage().deleteAllCookies();
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");   
driver.manage().window().maximize();

WebElement rightclick = driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
Actions act=new Actions(driver);
act.contextClick(rightclick).build().perform(); 

driver.findElement(By.xpath("/html/body/ul/li[3]")).click();   //xpath for copy

Thread.sleep(2000);
System.out.println(driver.switchTo().alert().getText()); // to capture the textbox 

driver.switchTo().alert().accept(); //for accepting the alertbox
	}
 
}
