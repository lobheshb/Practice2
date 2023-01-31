package AccessSpecifier;

public class sample4 implements sample3
{

	public void m1()
	{
		System.out.println(a);
		System.out.println("running m1 method of Interface");
	}
	
	public void m2()
	{System.out.println(a);
		System.out.println("running m2 method of interface class");
	}
	
	public void m3()
	{System.out.println(a);
		System.out.println("running m3 method of interface class");
	}
	
	public static void main(String[] args) {
		
		sample4 s1=new sample4();
		s1.m1();
		s1.m2();
		s1.m3();
		
		
	}
	
	
	
	
	
}
