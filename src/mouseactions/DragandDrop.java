package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait

driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");   
driver.manage().window().maximize();

WebElement Washington=driver.findElement(By.id("box3"));
WebElement US=driver.findElement(By.id("box103"));
Actions act=new Actions(driver);
act.clickAndHold(Washington).moveToElement(US).release().build().perform();

WebElement Rome= driver.findElement(By.id("box6"));
WebElement Italy= driver.findElement(By.id("box106"));
Actions act1=new Actions(driver);
act1.clickAndHold(Rome).moveToElement(Italy).release().build().perform();

WebElement Madrid=driver.findElement(By.id("box7"));
WebElement Spain=driver.findElement(By.id("box107"));
Actions act2=new Actions(driver);
act2.dragAndDrop(Madrid, Spain).build().perform();

WebElement Stockholm =driver.findElement(By.id("box2"));
WebElement Sweden=driver.findElement(By.id("box102"));
Actions act3=new Actions(driver);
act3.dragAndDrop(Stockholm, Sweden).build().perform();

WebElement Copenhagen=driver.findElement(By.id("box4"));
WebElement Denmark=driver.findElement(By.id("box104"));
Actions act4=new Actions(driver);
act4.dragAndDrop(Copenhagen, Denmark).build().perform();

WebElement Oslo=driver.findElement(By.id("box1"));
WebElement Norway=driver.findElement(By.id("box101"));
Actions act5=new Actions(driver);
act5.clickAndHold(Oslo).moveToElement(Norway).release().build().perform();

WebElement Seoul=driver.findElement(By.id("box5"));
WebElement SouthKorea=driver.findElement(By.id("box105"));
Actions act6=new Actions(driver);
act6.clickAndHold(Seoul).moveToElement(SouthKorea).release().build().perform();

	}

}
