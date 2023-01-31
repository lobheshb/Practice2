package JavaPractice3;

public class sample13 
{
   int num1;
   int num2;
   
   sample13()
   {
	   num1=10;
	   num2=20;
   }
   
   public void addition()
   {
	   System.out.println(num1+ num2);
   }
   
   public void multi()
   {
	   System.out.println(num1*num2);
   }
   
   public static void main(String[] args) {
	
	   sample13 s1=new sample13();
	   s1.addition();
	   s1.multi();
	   System.out.println(s1.num1);
	   
	   sample14 s2=new sample14();
	   s2.substraction();
	   
	   
	   
}
   
   
}
