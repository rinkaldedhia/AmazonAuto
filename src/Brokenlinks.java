import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println(links.size());
for(int i=0; i<links.size(); i++)
	{
	WebElement ele=links.get(i);  // this will read each link which is stored in i
	String url=ele.getAttribute("href"); // as every link has attribute href
	verifylink(url);
	}
}
public static void verifylink(String linkurl){
	try {
	URL url=new URL(linkurl);  // url object creation
	HttpURLConnection httpconnect= (HttpURLConnection)url.openConnection();
	httpconnect.setConnectTimeout(3000); //timeout
	httpconnect.connect();
	if(httpconnect.getResponseCode()==200)
	{
	System.out.println(linkurl+" - "+httpconnect.getResponseMessage());
	}
	else
	{
	System.out.println("Response not found");	
	}	
	}
	catch(Exception e)
	{
		
	}
}			
}				
			
			
			
		

	


