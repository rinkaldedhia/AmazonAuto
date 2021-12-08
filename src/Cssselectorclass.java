import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectorclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.findElement(By.cssSelector("input#email")).sendKeys("dedhia.rinkal@gmail.com"); //Tag & id combination seperated by #
//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("niravi"); //Tag & class combination seperated by .
driver.findElement(By.cssSelector("input[type=password]")).sendKeys("123niravi"); //Tag & Attribute combination seperated by []

driver.close();
	}

}
