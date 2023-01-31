package JavaPractice3;

public class example4_nested_If1 
{
   public static void main(String[] args) {
	
	   int age=17;
	   int weight=50;
	   
	   if(age>=18)
	   {
		   System.out.println("candidate eligible : age>18");
		   
		   if(weight>=50)
		   {
			   System.out.println("candidate eligiable: weight>50");
		   }
		   
		   else
		   {
			   System.out.println("candidate not eligiable: weight<50");
		   }
	   }
	   
	   else
	   {
		   System.out.println("candidate not eligiable: age<18");
	   }
	   
	   
	   
	   
	   
	   
	   
}
}
