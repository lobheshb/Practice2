package JavaPractice4;

import java.util.HashSet;
import java.util.Iterator;

public class sample5 
{
    public static void main(String[] args) {
		
    	HashSet hs=new HashSet();
    	
    	 hs.add("lobhesh");
		  hs.add(200);
		  hs.add('a');
		  hs.add(25.5f);
		  hs.add("vikas");
	      hs.add("");
	      hs.add(null);
	      hs.add(null);
	      hs.add(300);
    	
    	System.out.println(hs);
    	System.out.println(hs.size());
    	System.out.println(hs.isEmpty());
    	System.out.println(hs.contains(200));
    	
    	hs.add(345);
    	System.out.println(hs);
    	
    	hs.remove(345);
    	
    	System.out.println(hs);
    	
    	System.out.println("use of iterartor");
    	
    	Iterator itr = hs.iterator();
    	
    	while(itr.hasNext())
    	{
    		System.out.print(itr.next()+ " ");
    	}
    	
    	System.out.println("use for each loop");
    	    	
    	 	for(Object s1:hs) 
    	{
    		System.out.print(s1+ " ");
    	}
   
    
    
    
    
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
