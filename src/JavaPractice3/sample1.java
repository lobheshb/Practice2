package JavaPractice3;

public class sample1 
{
    //static regular method from same class
	
	public static void m1()
	{
		System.out.println("running m1 method in same class");
	}
	
	public static void m2()
	{
		System.out.println("running m2 method in same class");
	}
	
	public static void m3()
	{
		System.out.println("running m3 method in same class");
	}
	
	
	public static void main(String[] args) {
		
		m1();
		m2();
		m3();
		
		System.out.println("using the class name");
		
		sample1.m1();
		sample1.m2();
		sample1.m3();
		
		sample2.m4();
		sample2.m5();
		
		System.out.println("print the output using object");
		
		sample1 s1=new sample1();
		s1.m1();
		s1.m2();
		s1.m3();
		
		sample2 s2=new sample2();
		s2.m4();
		s2.m5();
		
		
		
	}
	
	
	
	
	
	
	
	
}
