import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("datepicker")).click();
		String Expectedmonth="June";
		String Date="20";
		while(true)
		{
		String text=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
		System.out.println(text);
		if(text.equals(Expectedmonth))
			{
					break;
			}
		else
			{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
			}
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]/a")).click();
		driver.close();
		
		
	}
}