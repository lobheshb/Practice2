package JavaPractice3;

public class son extends father
{
	
	 public void car()
	  {
		  System.out.println("car:Kia Seltos");
	  }
	  
	  public void money()
	  {
		  System.out.println("money:2L");
	  }
	
	public static void main(String[] args) {
		
		father f=new father();
		f.car();
		f.money();
		f.home();
		
		son s=new son();
		s.car();
		s.home();
		s.money();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//  public void laptop()
//  {
//	  System.out.println("laptop:hp");
//  }
//  
//  public static void main(String[] args) 
//  {
//	 
//	  father f=new son();
//	  f.car();
//	  f.home();
//	  f.money();
//    

  
  
  
  
  
  
}
  

