package JavaPractice3;

public class sample5 
{
    public static void addition(int num1,int num2)
    {
    	System.out.println(num1 + num2);
    	
    }
    
    public void addition(int num1,int num2,int num3)
    {
    	System.out.println(num1+num2+num3);
    }
    
    public void multiplication(int num1,int num2)
    {
    	System.out.println(num1*num2);
    }
    
    public void substraction(int num1,int num2)
    {
    	System.out.println(num1-num2);
    }
    
    public void divison(float num1,float num2)
    {
    	System.out.println(num1/num2);
    }
    
    public static void main(String[] args) {
		
    	sample5 s1=new sample5();
    	System.out.println("addition");
    	s1.addition(10, 20);
    	addition(20,30);
    	s1.addition(10, 20, 30);
    	System.out.println("multiplications");
    	s1.multiplication(5, 4);
    	
    	System.out.println("substractions");
    	s1.substraction(20, 10);
    	System.out.println("divison");
    	s1.divison(20, 3);
	}
    
    
    
    
}
