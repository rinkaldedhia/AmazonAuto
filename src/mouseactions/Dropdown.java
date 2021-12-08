package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait

driver.get("https://www.spicejet.com/");   
driver.manage().window().maximize();
//getting the xpath of element and storing in webelement
WebElement currency= driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));

Select sel=new Select(currency); // creating a sel object and using the webelement as parameter
//sel.selectByIndex(5);  
//sel.selectByVisibleText("USD");
sel.selectByValue("USD");      //3 types of select method we can use either one

driver.close();


	}

}
