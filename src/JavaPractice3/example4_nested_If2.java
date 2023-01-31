package JavaPractice3;

public class example4_nested_If2 
{
    public static void main(String[] args) {
		
    	int amount=2000;
    	
    	if(amount>=500)
    	{
    		System.out.println("no delivery charge");
    		
    		if(amount >=5000)
    		{
    			System.out.println("10% discount");
    		}
    		else
    		{
    			System.out.println("no discount");
    		}
    	}
    	else
    	{
    		System.out.println("50rs delivery charges");
    	}
    	
	}
}
