package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrowndownandRadiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait
driver.get("https://www.facebook.com/");   
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

driver.findElement(By.name("firstname")).sendKeys("Rinkal");
driver.findElement(By.name("lastname")).sendKeys("Dedhia");

//driver.findElement(By.xpath("//*[@id=\"u_e_g_mb\"]")).sendKeys("dedhia.rinkal@gmail.com");
//driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("1234567");



WebElement month = driver.findElement(By.id("month"));
Select sel=new Select(month);
sel.selectByIndex(6);                   //Select by index

WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
Select sel1=new Select(day);
sel1.selectByValue("10");				//Select by value

WebElement year= driver.findElement(By.xpath("//*[@id=\"year\"]"));
Select sel2=new Select(year);
sel2.selectByVisibleText("2019"); 		//Select by visible text	

// all this should select july 10 2019

WebElement radiobutton=driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

System.out.println(radiobutton.isDisplayed());
System.out.println(radiobutton.isEnabled());
System.out.println(radiobutton.isSelected());   // all this will give answer in console
//radiobutton.click();
	}

}
