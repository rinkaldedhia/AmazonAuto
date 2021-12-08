package Dropdownsorted;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdownsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dedhi\\eclipse-workspace\\AmazonAuto\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
WebElement element=driver.findElement(By.id("animals"));
Select se=new Select(element); // creating a select class and giving element as a parameter
List Originallist=new ArrayList(); // Create a original array list
List Temp=new ArrayList(); // Create a temp array list
Temp=Originallist;

//to capture the element in the list we have to use get options method and store it in List Webelement 
List <WebElement> Options=se.getOptions();

// create a foreachloop
for(WebElement e: Options) // now here e is having all the elements now to get the text of these elements 
{
Originallist.add(e.getText());
	}
System.out.println(Originallist);
	
//to sort the templist
Collections.sort(Temp);
System.out.println(Temp);

if(Originallist==Temp)
{
System.out.println("Dropdown is sorted");	
}
else
{
System.out.println("Dropdown is not sorted");
	}
	}
}
