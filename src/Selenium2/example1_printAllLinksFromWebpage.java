package Selenium2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_printAllLinksFromWebpage 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("https://www.facebook.com/"); 
		   
//		   int size = driver.findElements(By.xpath("//a")).size();
//		   
//		   System.out.println(size);
		   
//		   List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//		   
//		   for(WebElement s1 :allLinks)
//		   {
//			    String text = s1.getText();
//			    
//			    System.out.println(text);
//			    
//			   }
//		   
		   WebElement footerLink = driver.findElement(By.xpath("//div[@class='_95ke _8opy']"));
		   
		   int link = footerLink.findElements(By.tagName("a")).size();
		  
//		  for(WebElement s1 :link)
//		  {
//			  String text = s1.getText();
//			  System.out.println(text);
//		  
//		  
//		  }
		   
		   System.out.println(link);
		   
		  driver.quit(); 
		   
		   
		   
		   
		   
		   
}
}