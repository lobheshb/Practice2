package Selenium2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample4 
{
	 public static void main(String[] args) throws InterruptedException, IOException {
			
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("https://www.facebook.com/");  
		   
		   //take a screenshot 
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    System.out.println(src);
		    
		    File dest=new File("D:\\Selenium\\Screenshot\\xyz1.jpg");
		    
		    FileHandler.copy(src, dest);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
}
}