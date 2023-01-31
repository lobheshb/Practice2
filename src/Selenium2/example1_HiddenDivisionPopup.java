package Selenium2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_HiddenDivisionPopup 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("https://www.flipkart.com/"); 
		   
		   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		   
		   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("realme");
		   
		   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		   
		   String text = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		   
		   System.out.println(text);
		   
		   driver.quit();
		   
		   
}
}