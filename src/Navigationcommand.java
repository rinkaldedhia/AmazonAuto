import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dedhi\\\\eclipse-workspace\\\\AmazonAuto\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");  //get gmail page
		String i= driver.getTitle(); //revoke title of the page gmail
		System.out.println(i); // give output in console
		driver.navigate().to("https://www.facebook.com/"); // navigate to fb page
		String r=driver.getTitle(); // revoke title of the page
		System.out.println(r); // give output in console
		driver.navigate().back();
		String x=driver.getTitle();
		System.out.println(x);
		driver.navigate().forward();
		String y=driver.getTitle();
		System.out.println(y);
		driver.navigate().refresh();
		driver.close();


			}

		}