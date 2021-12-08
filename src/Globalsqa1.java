import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Globalsqa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement Testerhub = driver.findElement(By.xpath("//*[contains(text(),'Tester’s Hub')]"));
		act.moveToElement(Testerhub).build().perform();
		WebElement Demosite=driver.findElement(By.xpath("//*[@id=\"menu-item-2823\"]/a/span"));
		act.moveToElement(Demosite).click().build().perform();
		WebElement draganddropbutton=driver.findElement(By.xpath("//*[contains(text(),'DragAndDrop')]"));
		act.moveToElement(draganddropbutton).click().build().perform();
		WebElement Scrolldownto=driver.findElement(By.xpath("//*[contains(text(),'Miscellaneous')]"));
		act.moveToElement(Scrolldownto).build().perform(); // performs scrolling down
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement image1=driver.findElement(By.xpath("//*[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		WebElement trash=driver.findElement(By.id("trash"));
		act.dragAndDrop(image1, trash).build().perform();
		
		WebElement image2=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));
		act.dragAndDrop(image2, trash).build().perform();
		
		WebElement image3=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]"));
		act.dragAndDrop(image3, trash).build().perform();
		
		WebElement image4=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li/img"));
		act.dragAndDrop(image4, trash).build().perform();
		
		
		
	}

}
