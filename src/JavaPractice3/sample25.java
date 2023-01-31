package JavaPractice3;

public class sample25 extends sample26
{
   int a=20;
   
   public void m1()
   {
	   int a=30;
	   System.out.println(a);
	   System.out.println(this.a);
	   System.out.println(super.a);
   }
   
   public void m2()
   {
	   int a=40;
	   System.out.println(a);
	   System.out.println(this.a);
	   System.out.println(super.a);
   }
   
   public static void main(String[] args) {
	
	   sample25 s1=new sample25();
	   s1.m1();
	   s1.m2();
}
   
   
   
   
   
}
