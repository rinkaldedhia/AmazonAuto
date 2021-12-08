import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		List<WebElement>options=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]"));
		//List<WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement names:options)
		{
			if(names.getText().equalsIgnoreCase("India"));
			names.click();
			System.out.println(names);
			break;
		}
				
	}



	}