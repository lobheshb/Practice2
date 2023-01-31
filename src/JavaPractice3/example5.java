package JavaPractice3;

public class example5 
{
  public static void main(String[] args) {
	
	  String [] ar= {"lobhesh"};
	  
	  try {
		  ar[2]="abc";
	  }
	  
	  catch(ArithmeticException e)
	  {
		  System.out.println("handled arithmetic exception");
	  }
	  
	  catch(ArrayIndexOutOfBoundsException lobhesh)
	  {
		  System.out.println("handled Array Index out of bound");
	  }
	  
	  catch(StringIndexOutOfBoundsException lobhesh)
	  {
		  System.out.println("String index out of bound handled");
	  }
	  
	  catch(Exception rahul)
	  {
		  System.out.println("handled generic execption handled");
		  rahul.printStackTrace();
	  }
	  
	  System.out.println("good morning");
	  
	  
}
}
