package JavaPractice3;

public class example1
{
   public static void main(String[] args) {
	
	   int a=10;
	   int b=0;
	   int div=0;
	   
//	   div=a/b;
//	   
//	   System.out.println(div);
	   
	   try {
		   
		   div=a/b;
	   }
	   
	   catch(ArithmeticException  e)
	   {
		   System.out.println("hello");
	   }
	   
	   System.out.println(div);
	   
	   
	   
}
}
