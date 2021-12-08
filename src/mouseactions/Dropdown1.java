package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait

driver.get("https://www.travelkingdoms.com/");   
driver.manage().window().maximize();

WebElement Passenger=driver.findElement(By.name("adult"));
Passenger.click();
Select sel=new Select(Passenger);
sel.selectByValue("4");

WebElement Child=driver.findElement(By.name("child"));
Child.click();
Select sel1=new Select(Child);
sel1.selectByIndex(2);

WebElement Class=driver.findElement(By.name("class"));
Class.click();
Select sel2=new Select(Class);
sel2.selectByVisibleText("First Class");

System.out.println("4 Adults,2 Children in Firstclass");


	}

}
