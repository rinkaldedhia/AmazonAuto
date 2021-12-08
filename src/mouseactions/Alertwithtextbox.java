package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwithtextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//clicking on alert with textbox button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		//clicking on promptbox
		driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
		
		driver.switchTo().alert().sendKeys("Rinkal");
		String Exptext="Hello Rinkal How are you today";
		driver.switchTo().alert().accept();
		String Acttext=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		if(Exptext.equals(Acttext)==true)
		{
			System.out.println("test is passed");
		}
		
		
	}

}
