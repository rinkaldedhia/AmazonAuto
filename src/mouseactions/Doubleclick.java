package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
WebElement text=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
Actions act=new Actions(driver);
act.doubleClick(text).build().perform();    //performing double click

WebElement speed=driver.findElement(By.id("speed"));
act.moveToElement(speed).click().build().perform();
Select sel=new Select(speed);
sel.selectByVisibleText("Fast");


	}

}
