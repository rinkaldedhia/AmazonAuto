import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait

driver.get("https://www.amazon.com/");

String Title = driver.getTitle();
System.out.println(Title);         //returns title of the page

String CurrentUrl = driver.getCurrentUrl();
System.out.println(CurrentUrl);   //returns current url

driver.findElement(By.linkText("New Releases")).click();  //Click on New Release on webpage

WebDriverWait wait= new WebDriverWait (driver,20);     //Explicit wait

int img= driver.findElements(By.tagName("img")).size();
System.out.println(img);        // getting all the images on the new releases page

driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/li[10]/a")).click();;   //will go to books coloumn
driver.findElement(By.xpath("//*[@title='The Hill We Climb: An Inaugural Poem for the Country']")).click(); 

//driver.close();

	}

}
