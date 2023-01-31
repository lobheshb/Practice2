package Selenium2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		   
		   Thread.sleep(1000);
//		   WebElement software = driver.findElement(By.xpath("//a[text()='Software Testing']"));
//		   
//		   JavascriptExecutor js = ((JavascriptExecutor)driver);
//		   
//		   js.executeScript("arguments[0].scrollIntoView();",software);
//		   
		   
//		   WebElement guru = driver.findElement(By.xpath("//a[text()='Career Guru99']"));
//		   
//		   JavascriptExecutor js = ((JavascriptExecutor)driver);
//		   
//		   js.executeScript("arguments[0].scrollIntoView();",guru);
//		   
		   
//		   WebElement contest = driver.findElement(By.xpath("//a[text()='Contest']"));
//		   JavascriptExecutor js = ((JavascriptExecutor)driver);
//		   
//		   js.executeScript("arguments[0].scrollIntoView();",contest);
//		   
//		   WebElement guru = driver.findElement(By.xpath("//a[text()='Contest']"));
//		   JavascriptExecutor js = ((JavascriptExecutor)driver);
//		   
//		   js.executeScript("arguments[0].scrollIntoView();", guru);
		   
		   
		   WebElement guru = driver.findElement(By.xpath("//a[text()='Contest']"));
		   JavascriptExecutor js = ((JavascriptExecutor)driver);
		   js.executeScript("arguments[0].scrollIntoView();",guru);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
}