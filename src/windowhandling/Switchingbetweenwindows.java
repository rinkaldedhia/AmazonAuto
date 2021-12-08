package windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingbetweenwindows {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='Tabbed'] //*[@class='btn btn-info']")).click();
//to know which window the driver is currently in
	System.out.println(driver.getTitle());  // this is parent window

//to check how many windows are open and to know the key values of allthe windows
	Set <String>s=driver.getWindowHandles();

// s has all the keyvalues of all the browser to read those values we using foreachloop
	for(String i:s)
		{
	//System.out.println(i); //to know what i consist of, it will return the keyvalues
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
			if(t.contains("Frames & windows"))
				{
					driver.close();   // to close the parentwindow
				}
		}

}

}
