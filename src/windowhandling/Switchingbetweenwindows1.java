package windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingbetweenwindows1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	
//clicking on hiring
	driver.findElement(By.xpath("//*[@class='bannerItemLink'] //*[@ src='https://company.naukri.com/homepage21/cognizant-hs-tp-21sep2018.gif']"));

//to see how many  windows are open and to get their key values
	Set<String> s=driver.getWindowHandles();
	
//to read values of s foreach loop method
	for(String e:s)
	{
		System.out.println(e);
		String t=driver.switchTo().window(e).getTitle();
		System.out.println(t);
		if(t.equals("Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com"))
		{
			driver.close();
		}
	}
	


	}

}
