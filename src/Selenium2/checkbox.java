package Selenium2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("file:///C:/Users/admin/Desktop/Daily%20Practice/html/Practice%201/checkbox.html"); 
		   
		  List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		   
		   for(WebElement s1 :checkbox)
		   {
			   s1.click();
			   Thread.sleep(1000);
		   }
		   Thread.sleep(1000);
		   
		 for(int i=checkbox.size()-1;i>=0;i--)
		 {
			 checkbox.get(i).click();
			 Thread.sleep(1000);
		 }
		   
		   
		   
		   
		   
		   
}
}