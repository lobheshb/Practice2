package Selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 
{
   public static void main(String[] args) throws InterruptedException {
	
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
	   
	   WebDriver driver =new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	   driver.navigate().to("https://www.facebook.com/");   
	    
	   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    
	    Select s=new Select(month);

//      s.selectByVisibleText("Feb");
//      Thread.sleep(2000);
//      s.selectByVisibleText("Mar");
//      Thread.sleep(2000);
//      s.selectByVisibleText("Jun");
//      Thread.sleep(2000); 

//	   String text = s.getFirstSelectedOption().getText();
//	   
//	   System.out.println(text);
	   
//	   int size = s.getAllSelectedOptions().size();
//	   System.out.println(size);
	   
//	   for(WebElement s1 :alloptions)
//	   {
//		   String text = s1.getText();
//		   System.out.println(text);
//	   }
	    
	    int size = s.getOptions().size();
	    System.out.println(size);
	    
//	    for(WebElement s1 :alloptions)
//	    {
//	    	String text = s1.getText();
//	    	System.out.println(text);
//	    }
	    
	    
	    driver.quit();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
