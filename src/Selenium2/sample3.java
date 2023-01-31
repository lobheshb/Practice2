package Selenium2;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample3 
{
	 public static void main(String[] args) throws InterruptedException {
			
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.navigate().to("file:///C:/Users/admin/Desktop/Daily%20Practice/html/Practice%201/Multiple_ListBox1.html");
		   
		   WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		   
		   Select s=new Select(country);
		   
		   s.selectByIndex(0);
		   s.selectByIndex(2);
		   s.selectByIndex(3);
		   s.selectByIndex(1);
		   
//		   String text = s.getFirstSelectedOption().getText();
//		   
//		   System.out.println(text);
		   
//		   int size = s.getAllSelectedOptions().size();
//		   System.out.println(size);
//		   
//		   for(WebElement s1:alloptions)
//		   {
//			   String text = s1.getText();
//			   System.out.println(text);
//		   }

		   int size = s.getOptions().size();
		   System.out.println(size);
		   
		   TreeSet<String> ts=new TreeSet<String>();
//		   for(WebElement s1:alloptions)
//		   {
//			   String text = s1.getText();	
//			   ts.add(text);
//			 
//		   }
//		   
//		   for(String s1:ts)
//		   {
//			   System.out.println(s1);
//		   }
		   
		   
		   
		   
		   
		    
		   driver.quit();
		   
		   
		   
		   
		   
}
}