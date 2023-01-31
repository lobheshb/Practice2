package Selenium2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.navigate().to("file:///C:/Users/admin/Desktop/Daily%20Practice/html/Practice%201/WebTable_1.html");
		   
//		   int size = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
//		   
//		   System.out.println(size);
//		   
//		   int size1 = driver.findElements(By.xpath("//table[@id='1234']//tr//td |  //table[@id='1234']//tr//th")).size();
//		   
//		   System.out.println(size1);
//		   
//		   String text = driver.findElement(By.xpath("//table[@id='1234']//tr[1]")).getText();
//		   
//		   System.out.println(text);
		   
//		   List<WebElement> data = driver.findElements(By.xpath("//table[@id='1234']//tr//td[2] | //table[@id='1234']//tr//th[2]"));
//		   
//		   for(WebElement s1 :data)
//		   {
//			   String text = s1.getText();
//			   System.out.println(text);
//		   }
//		   
//		  String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]//td[2] ")).getText();
//		   
//		   System.out.println(text);
		   
		   List<WebElement> text = driver.findElements(By.xpath("//table[@id='1234']//tr[3]//td"));
		   
		   for(WebElement s1 :text)
		   {
			   String text1 = s1.getText();
			   System.out.print(text1+ " ");
		   }
		   
		   
		   
		   
		   
		   
		   driver.quit();
		   
		   
		   
		   
}
}