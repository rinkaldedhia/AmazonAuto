package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertandifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//click on ok cancel button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		//click on a display button
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		//capturing text box
		System.out.println(driver.switchTo().alert().getText());
		
		String Exptext="You pressed Ok";  // creating variable
		
		driver.switchTo().alert().accept();
		String Acttext=driver.findElement(By.xpath("//*[@id='demo']")).getText(); //after pressing my actual text is
		
		if(Exptext.equals(Acttext)==true)
		{
			System.out.println("test is passed");
		}
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click(); //clicking on the display button again
		String Expresult="You Pressed Cancel";
		driver.switchTo().alert().dismiss();
		String Actresult=driver.findElement(By.id("demo")).getText();
		if(Expresult.equals(Actresult)==true)
		{
			System.out.println("test is passed");
		}
		
	}	

}
