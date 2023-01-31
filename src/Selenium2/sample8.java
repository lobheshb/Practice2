package Selenium2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample8 
{
	 @Test(groups="fund")
	   public void TC5()
	   {
		   Reporter.log("running TC5 method ",true);
	   }
	   
	   @Test(groups="profile")
	   public void TC6()
	   {
		   Reporter.log("running TC6 method",true);
	   }
	   
	   @Test(groups="fund")
	   public void TC7()
	   {
		   Reporter.log("running TC7 method", true);
	   }
	   
	   
	   @Test(groups="login")
	   public void TC8()
	   {
		   Reporter.log("running TC8 method", true);
	   }
	   
}
