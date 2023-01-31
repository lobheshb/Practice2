package JavaPractice4;

import java.util.ArrayList;
import java.util.HashSet;

public class sample6 
{ 
   public static void main(String[] args) {
	
	   ArrayList al=new ArrayList();
	  
	      al.add("lobhesh");
		  al.add(200);
		  al.add('a');
		  al.add(25.5f);
		  al.add("vikas");
	      al.add("");
	      al.add(null);
	      al.add(null);
	      al.add(100);
	      
	      
	    HashSet hs=new HashSet(al);  
	      
	   System.out.println(hs);
	   
}
}
