package Dropdownsorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsorted1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait
driver.manage().window().maximize();
WebElement scroll=driver.findElement(By.xpath("//*[@id=\"HTML6\"]/div[1]/form/fieldset[2]/label"));
Actions act=new Actions(driver);
act.moveToElement(scroll).build().perform(); //performs scrolling

WebElement Products=driver.findElement(By.id("products")); //locate the element to be sorted
Select sel=new Select(Products);
List OriginalList=new ArrayList(); //creating an arraylist .. this list contains all products
List TempList=new ArrayList();
TempList=OriginalList;
List <WebElement>Options=sel.getOptions(); //to capture the products available we using getoptions method and storing in options

for(WebElement e:Options) //creating a foreach loop
	{
	OriginalList.add(e.getText());
	}
	System.out.println("OriginalList is " +OriginalList);
	System.out.println("TemperorayList is " +TempList); // both list are same
	
//to sort the templist
	Collections.sort(TempList);
	System.out.println("Sorted List is  " +TempList); //list is sorted now
	
}

	
}
