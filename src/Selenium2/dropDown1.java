package Selenium2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropDown1 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("http://demo.guru99.com/test/drag_drop.html"); 
		   
	//	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		   
	//	  WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		   
		   Actions act=new Actions(driver);
		   
		  //   act.moveToElement(more).perform();
		   
		  //  act.contextClick(more).perform(); 
		   
		  //  act.click(cart).perform();
		
		   
	//	   act.doubleClick(doubleClick).perform();
		   
		   
		   WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		   
		   
		   WebElement drop1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		   
		   act.dragAndDrop(drag1, drop1).perform();
		   
		   WebElement drop2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		   
		   act.dragAndDrop(drop1, drop2).perform();
		   
		   
		   
		   
}
}