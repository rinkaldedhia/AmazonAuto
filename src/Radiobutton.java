import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait

driver.get("https://www.spicejet.com/");   
driver.manage().window().maximize();

WebElement radiobutton=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")); //locate button
System.out.println(radiobutton.isDisplayed());  //true
System.out.println(radiobutton.isEnabled());    //true
System.out.println(radiobutton.isSelected());	//false
radiobutton.click();
	}

}
