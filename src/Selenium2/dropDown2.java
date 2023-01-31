package Selenium2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropDown2 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("https://www.facebook.com/"); 
		   
		   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		   
		   WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		   
		   Actions act=new Actions(driver);
		   
		   act.click(month).perform();
		   
//		   act.sendKeys(Keys.ARROW_DOWN);
//		   Thread.sleep(2000);
//		   act.sendKeys(Keys.ARROW_DOWN);
//		   Thread.sleep(2000);
//		   act.sendKeys(Keys.ARROW_DOWN);
//		   Thread.sleep(4000);
//		   act.sendKeys(Keys.ARROW_DOWN);
//		   act.sendKeys(Keys.ENTER);
//		   Thread.sleep(3000);
//		   act.sendKeys(Keys.END);
//		   act.sendKeys(Keys.ARROW_UP);
//		   Thread.sleep(2000);
//		   act.sendKeys(Keys.ARROW_UP);
//		   Thread.sleep(2000);
//		   act.sendKeys(Keys.ARROW_UP);
//		   Thread.sleep(2000);
//		   
//		   act.sendKeys(Keys.ENTER);
		   
		   act.sendKeys(Keys.HOME).perform();
		   
		   for(int i=1;i<4;i++)
		   {
			   act.sendKeys(Keys.ARROW_DOWN).perform();
		   }
		   
		   act.sendKeys(Keys.ENTER).perform();
		    
		  		   
}
}