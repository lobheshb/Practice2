package Selenium2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample7 
{
   @Test(groups="login")
   public void TC1()
   {
	   Reporter.log("running TC1 method ",true);
   }
   
   @Test(groups="fund")
   public void TC2()
   {
	   Reporter.log("running TC2 method",true);
   }
   
   @Test(groups="profile")
   public void TC3() throws InterruptedException
   {
	  
	   Reporter.log("running TC3 method", true);
   }
   
   
   @Test(groups="login")
   public void TC4()
   {
	   Reporter.log("running TC4 method", true);
   }
   
   
   
   
   
   
   
   
   
   
   
}
