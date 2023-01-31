package JavaPractice3;

public class sample9 
{
  
	
	  int a=30;
	  
	  public void m1()
	  {
		  int b=20;
		  int a=40;
		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(this.a);
	  }
	  
	  public void m2()
	  {
		  int c=10;
		  System.out.println(c);
		  System.out.println(a);
	  }
	  
	  public static void main(String[] args) 
	  {
		  sample9 s1=new sample9();
		  s1.m1();
		  s1.m2();
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
