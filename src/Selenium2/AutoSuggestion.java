package Selenium2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("https://www.google.com/"); 
		   
		   driver.findElement(By.name("q")).sendKeys("redmi");
		   
		   String expResult = "redmi note 10 pro";
		   
		   List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		   
		   for(WebElement s1 :allOptions)
		   {
			   String actResult = s1.getText();
			   if(expResult.equals(actResult))
			   {
				   s1.click();
				   break;
			   }
			   
			   
			   
			   
		   }
		   
		   
		   
		   
		   
}
}