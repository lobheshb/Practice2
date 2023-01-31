package Selenium2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("file:///C:/Users/admin/Desktop/Daily%20Practice/html/Practice%201/WebTable_1.html");
		   
		   int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		   
		   for(int i=0;i<rowSize;i++)
		   {
			    int ColSize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]/*")).size();
			  //  driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]/*")).size();  //3
			   for(int j=0;j<ColSize;j++)
			   {
			     // String text = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/*["+j+"]")).getText();
			      
			  String text =   driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/*["+j+"]")).getText();
			      System.out.print(text+ " ");
				   
				  
			   }
			   
			  System.out.println(); 
		   }
		   
		   driver.quit();
}
}