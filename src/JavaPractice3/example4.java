package JavaPractice3;

public class example4 
{
  public static void main(String[] args) {
	
	  String [] ar= {"abc"};
	  
	  try
	  {
		  ar[2]="abc";
	  }
	  
	  catch(Exception lobhesh)
	  {
		  System.out.println("handled generic exception");
		  lobhesh.printStackTrace();
	  }
	  
	  System.out.println("gm");
	  
}
}
