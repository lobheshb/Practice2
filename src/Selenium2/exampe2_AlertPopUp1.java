package Selenium2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampe2_AlertPopUp1 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("https://demo.guru99.com/test/delete_customer.php"); 
		   
		   driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		   
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
		   
		   Alert alt = driver.switchTo().alert();
		   String text = alt.getText();
		   System.out.println(text);
		   
		   alt.accept();
		   alt.accept();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
}