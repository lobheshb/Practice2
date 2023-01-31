package JavaPractice3;

public class example6 
{
   public static void main(String[] args) {
	
	   int num1=10;
	   int num2=20;
	   int num3=2;
	   
	   int num4=multiplication(num1,num2);
	   System.out.println(num4);
	   
	   example6 s1=new example6();
	   int num5=s1.addition(num3, num4);
	   System.out.println(num5);
	  
	
			   
	  
	   
}
   
   public static int multiplication(int a,int b)
   {
	  int mult =a*b;
	   return mult;
   }
   
   public int addition(int c,int d)
   {
	   int sum=c+d;
	   return sum;
   }

}
