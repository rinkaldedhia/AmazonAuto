import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait
	driver.get("https://www.amazon.com/");	
	driver.manage().window().maximize();
	
	Set <Cookie> cookies=driver.manage().getCookies();  //it will return a set type
	System.out.println(cookies.size());
	for(Cookie i:cookies)  //to read cookies name and value
	{
		System.out.println(i.getName()+" :  "+i.getValue()); 
	}
	
	System.out.println(driver.manage().getCookieNamed("session-token")); //to get a particular cookie
	
	Cookie obj = new Cookie("abcde", "1234567"); //to add cookie
	driver.manage().addCookie(obj);
	cookies=driver.manage().getCookies(); //store the new cookie in to cookiesset
	System.out.println(cookies.size());
	for(Cookie i:cookies)
	{
		System.out.println(i.getName()+" :  "+i.getValue()); 
	}
	driver.manage().deleteAllCookies();
	cookies=driver.manage().getCookies(); 
	System.out.println(cookies.size());
	
	driver.close();
	

	}

}
