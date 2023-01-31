package JavaPractice3;

public class example2 
{
   public static void main(String[] args) {
	
	   String [] ar= {"abcd"};
	   
//	   ar[2]="abc";
//	   
//	   System.out.println(ar[2]);
	   
	   try {
		   ar[2]="abc";
	   }
	   
	   
	   catch(ArrayIndexOutOfBoundsException e) 
	   {
		   System.out.println("handled arrey index out of bound execption");
	   }
	   
	   System.out.println("hello world");
	   
	   
}
}
