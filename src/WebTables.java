import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait

		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		// getting all the rows and coloumns
		int rows=driver.findElements(By.xpath("/html/body/div[3]/table/tbody/tr")).size();
		System.out.println(rows);
		int cols=driver.findElements(By.xpath("/html/body/div[3]/table/thead/tr/th")).size();
		System.out.println(cols);
		
		//getting the specific row/column data
		String value=driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(value);
		String value1=driver.findElement(By.xpath("/html/body/div[3]/table//tr[3]/td[1]")).getText();
		System.out.println(value1);
		
		//getting all data from the table
		System.out.println("table data is:");
		for(int r=1; r<=rows; r++)
		{
			for( int c=1; c<=cols; c++)
			{
				String data=driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(data+ "     ");	
			}
			System.out.println();
		}
	driver.quit();
	}

}
