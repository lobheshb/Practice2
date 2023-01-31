package JavaPractice3;

public class example3 
{
  public static void main(String[] args) {
	
	  String s1="abc";
	  
	//  System.out.println(s1.charAt(6));
	  
	  try {
		  System.out.println(s1.charAt(6));
	  }
	  
	  catch(StringIndexOutOfBoundsException e)
	  {
		  System.out.println("handled String index out of bound exeception");
	  }
	  
	  System.out.println("gm");
}
}
