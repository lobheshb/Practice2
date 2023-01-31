package AccessSpecifier;

public class sample5 implements I1,I2
{
   public void m1()
   {
	   System.out.println(a);
	   System.out.println("running m1");
   }
   
   public void m2()
   {
	   System.out.println("running m2");
   }
   
   public void m3()
   {
	   System.out.println("running m3");
   }
   
   public void m4()
   {
	   System.out.println("running m4");
   }
   
   public void m5()
   {
	   System.out.println("running m5");
   }
   
   public void m6()
   {
	   System.out.println(b);
	   System.out.println("running m6");
   }
   
   public static void main(String[] args) 
   {
	  sample5 s1=new sample5();
	  s1.m1();
	  s1.m2();
	  s1.m3();
	  s1.m4();
	  s1.m5();
	  s1.m6();
}
   
   
   
   
   
}
