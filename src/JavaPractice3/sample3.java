package JavaPractice3;

public class sample3 
{
  public void m1()
  {
	  System.out.println("running non static m1 method in same class");
  }
  
  public void m2()
  {
	  System.out.println("running non static m2 method ins same class");
  }
  
  public static void main(String[] args) {
	
	  sample3 s1=new sample3();
	  s1.m1();
	  s1.m2();
	  
	  sample4 s2=new sample4();
	  s2.m3();
	  s2.m4();
}
  
  
  
  
}
