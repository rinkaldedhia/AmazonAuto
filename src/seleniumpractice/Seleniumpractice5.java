package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Seleniumpractice5 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/Users/dedhi/eclipse-workspace/AmazonAuto/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("Current URL: "+driver.getCurrentUrl());
	System.out.println("Title of the page: "+driver.getTitle());
	System.out.println("Number of links:"+driver.findElements(By.tagName("link")).size());
	Actions act=new Actions(driver);
	WebElement Women=driver.findElement(By.xpath("//*[@title='Women'][@class='sf-with-ul']"));
	act.moveToElement(Women).build().perform();
	driver.findElement(By.linkText("Evening Dresses")).click();
	int Size_Checkboxes=driver.findElements(By.xpath("//*[contains(@id,'uniform-layered_id_attribute_group')]")).size();
	System.out.println("Number of Checkboxes"+Size_Checkboxes);
	WebElement Medium_size=driver.findElement(By.name("layered_id_attribute_group_2"));
	System.out.println(Medium_size.isDisplayed());
	System.out.println(Medium_size.isEnabled());
	Thread.sleep(3000);
	Medium_size.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	WebElement Products=driver.findElement(By.id("selectProductSort"));
	Select sel=new Select (Products);
	sel.selectByIndex(3);
	driver.navigate().to("https://artoftesting.com/sampleSiteForSelenium");
	WebElement Testing=driver.findElement(By.id("testingDropdown"));
	Select sel1=new Select(Testing);
	sel1.selectByValue("Manual");
	Thread.sleep(3000);
	driver.navigate().to("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
	driver.findElement(By.id("from")).click();
	WebElement month=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
	Select sel2=new Select(month);
	sel2.selectByValue("6");
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
	driver.findElement(By.id("to")).click();
	WebElement Return_month=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
	Select sel3=new Select(Return_month);
	sel3.selectByIndex(4);
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")).click();
	Thread.sleep(3000);
	driver.close();
	driver.quit();
	

	
	
	
	
	
	
	
	}

}
