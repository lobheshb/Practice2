package JavaPractice4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class sample4 
{
   public static void main(String[] args) {
	
	   LinkedList ll=new LinkedList();
	   
	      ll.add("lobhesh");
		  ll.add(200);
		  ll.add('a');
		  ll.add(25.5f);
		  ll.add("vikas");
	      ll.add("");
	      ll.add(null);
	      ll.add(null);
	      ll.add(300);
	      
	     System.out.println(ll); 
	     System.out.println(ll.size());
	     System.out.println(ll.isEmpty());
	     System.out.println(ll.contains(ll));
	     System.out.println(ll.get(0));
	     
	     System.out.println("---add--");
	     ll.add(1,500);
	     
	     System.out.println(ll);
	     
	     ll.remove(1);
	     
	     System.out.println(ll);
	      
	      ll.set(1, "rahul");
	      System.out.println(ll);
	      
	      System.out.println("used of iterator");
	      
	      Iterator itr = ll.iterator();
	      
	      while(itr.hasNext())
	      {
	    	  System.out.print(itr.next()+" ");
	      }
	      
	      
	      System.out.println("used of list iterator");
	      
	      ListIterator itr1 = ll.listIterator(); 
	      
	      while(itr1.hasNext())
	      {
	    	  System.out.print(itr1.next()+ " ");
	      }
	      
	      System.out.println("used of for loop ");
	      for(int i=0;i<ll.size();i++)
	      {
	    	  System.out.print(ll.get(i)+ " ");
	      }
	      
	      System.out.println("for each loop");
	      for(Object s1:ll)
	      {
	    	  System.out.print(s1+ " ");
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
}
}
