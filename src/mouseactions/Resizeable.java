package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait

driver.get("https://jqueryui.com/resizable/");   
driver.manage().window().maximize();
WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
driver.switchTo().frame(frame);
Actions act=new Actions(driver);
WebElement Resizeable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

Point points= Resizeable.getLocation(); // creating point class
int x=points.getX();
System.out.println(x);
int y=points.getY();
System.out.println(y);
act.moveToElement(Resizeable).dragAndDropBy(Resizeable, 158, 158).build().perform(); //50 and 100 are the pixel values this are the length and height
driver.close();	
	}

}
