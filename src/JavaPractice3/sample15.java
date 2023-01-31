package JavaPractice3;

public class sample15 
{
   int num1;
   int num2;
   String name;
   
//   public sample15()
//   {
//	   num1=20;
//	   num2=30;
//	   
//   }
   
   public sample15(String a)
   {
	   name=a;
   }
   
   public sample15(int a,int b)
   {
	   num1=a;
	   num2=b;
   }
   
  public void addition()
  {
	  System.out.println(num1+num2);
  }
  
  public void multiplication()
  {
	  System.out.println(num1*num2);
  }
  
  public void Name()
  {
	  System.out.println(name);
  }
   
   public static void main(String[] args) {
	
	//   sample15 s1=new sample15();
//	  s1.addition();
//	  s1.multiplication();
	  
	sample15 s2=new sample15(5,6);
	s2.addition();
	s2.multiplication();
	
	sample15 s3=new sample15("lobhesh");
	s3.Name();
	   
}
   
   
}
