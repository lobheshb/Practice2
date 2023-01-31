package JavaPractice3;

public class Overloading
{
   
	public void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void StudentName(String name)
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Overloading ov=new Overloading();
		ov.addition(10, 20);
		ov.addition(10, 20, 30);
		ov.StudentName("lobhesh");
		
		
		
	}
	
	
	
}
