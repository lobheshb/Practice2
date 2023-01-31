package JavaPractice4;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class sample3 
{
   public static void main(String[] args) {
	
	   Vector V=new Vector();
	   
	      V.add("lobhesh");
		  V.add(200);
		  V.add('a');
		  V.add(25.5f);
		  V.add("vikas");
	      V.add("");
	      V.add(null);
	      V.add(null);
	      V.add(300);
	      
	      System.out.println(V);
	      System.out.println(V.size());
	      System.out.println(V.isEmpty());
	      System.out.println(V.contains('a'));
	      System.out.println(V.get(0));
	      
	      System.out.println("------");
	      
	      V.add(0,"sushant");
	      
	      System.out.println(V);
	      
	      V.remove(0);
	      
	      V.set(1, 450);
	      System.out.println(V);
	      
	      System.out.println("use of iteator");
	      Iterator itr = V.iterator();
	      while(itr.hasNext())
	      {
	    	  System.out.print(itr.next()+ " ");
	      }
	      
	      System.out.println("use of list of iterator");
	       
	      ListIterator itr1 = V.listIterator();
	      while(itr1.hasNext())
	      {
	    	  System.out.print(itr1.next()+ " ");
	      }
	      
	      System.out.println("use of for loop");
	      
	      for(int i=0;i<V.size();i++)
	      {
	    	  System.out.print(V.get(i)+ " ");
	      }
	      
	      System.out.println("for each loop");
	      for(Object s1:V)
	      {
	    	  System.out.print(s1+ " ");
	      }
	      
	      System.out.println("use of enamuration");
	      
	      Enumeration enu = V.elements();
	      
	      while(enu.hasMoreElements())
	      {
	    	  System.out.print(enu.nextElement()+ " ");
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
