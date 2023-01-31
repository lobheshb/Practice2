package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample2 
{
	 public static void main(String[] args) throws InterruptedException {
			
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.navigate().to("file:///C:/Users/admin/Desktop/Daily%20Practice/html/Practice%201/Multiple_ListBox1.html");
		   
		   WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		   
		   Select s=new Select(country);
		   
		   s.selectByVisibleText("IND");
		   Thread.sleep(2000);
		   
		   s.selectByVisibleText("AUS");
		   Thread.sleep(2000);
		   
		   s.selectByVisibleText("PAK");
		   Thread.sleep(2000);
		   
//		   s.deselectByVisibleText("IND");
//		   Thread.sleep(2000);
//		   
//		   s.deselectByVisibleText("AUS");
//		   Thread.sleep(2000);
//		   
//		   s.deselectByVisibleText("PAK");
//		   Thread.sleep(2000);
		   
		   s.deselectAll();
		   boolean s1 = s.isMultiple();
		   
		   if(s1==true)
		   {
			   System.out.println("list box is multiselectable");
		   }
		   else
		   {
			   System.out.println("listbox is single selectable");
		   }
		   
		   
		   driver.quit();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
}