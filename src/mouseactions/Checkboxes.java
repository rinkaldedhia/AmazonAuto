package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("https://www.spicejet.com/");
driver.manage().window().maximize();
System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size()); //this will print number of checkboxes in webpage

WebElement Checkbox=driver.findElement(By.xpath("//*[@type='checkbox'][@id='ctl00_mainContent_chk_friendsandfamily']"));
Checkbox.isDisplayed();
Checkbox.isEnabled();
Checkbox.isSelected();
Checkbox.click();
	
	
	}

}
