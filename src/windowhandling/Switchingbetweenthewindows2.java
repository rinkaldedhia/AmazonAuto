package windowhandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingbetweenthewindows2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String Parentwindow=driver.getWindowHandle(); // will give parent window
		System.out.println(Parentwindow);
		
		Set<String> windows =driver.getWindowHandles(); //this will give key value of all windows
		System.out.println(windows);
		//to read all keyvalues of childwindow
		Iterator itr=windows.iterator();
		while(itr.hasNext())
		{
			String childwindow=(String) itr.next();
			
			if(!Parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				driver.close();
			}
			
		}
		driver.switchTo().window(Parentwindow);
		driver.close();
	}

}
