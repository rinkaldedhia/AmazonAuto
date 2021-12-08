package windowhandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingbetweenwindows3 {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.demoqa.com/");
driver.manage().window().maximize();

String Parentwindow=driver.getWindowHandle();
System.out.println(Parentwindow);
driver.findElement(By.cssSelector(".banner-image")).click();
Set<String> AllWindows=driver.getWindowHandles();
System.out.println(AllWindows);
		
Iterator itr=AllWindows.iterator();
	while(itr.hasNext())
		{
			String Childwindow =(String) itr.next();
			
				if(!Parentwindow.equals(Childwindow))
					{
					System.out.println(driver.switchTo().window(Childwindow).getTitle());
					driver.close();
					}
		}	
System.out.println(driver.switchTo().window(Parentwindow).getTitle());
driver.close();
		
}

}
