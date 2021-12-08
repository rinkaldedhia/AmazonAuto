package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait
driver.manage().deleteAllCookies();
driver.get("https://jqueryui.com/slider/");   
driver.manage().window().maximize();	

driver.switchTo().frame(0);  // as slider is in frame we have to use this command and give index value
Actions act=new Actions(driver);
WebElement slider=driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
	}

}
