package Selenium2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		   
		   
		   JavascriptExecutor js = ((JavascriptExecutor)driver);
		   
		   js.executeScript("window.scrollBy(0,3000)");
		   
		   Thread.sleep(1000);
		   
		   js.executeScript("window.scrollBy(0,-2500)");
		   
		   Thread.sleep(3000);
		   driver.quit();
		   
		   
		   
}
}