package JavaPractice4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class sample2 
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
      
      System.out.println(al);
      System.out.println(al.size());
      System.out.println(al.isEmpty());
      System.out.println(al.contains(200));
      System.out.println(al.get(0));
      
      System.out.println("-----");
      
      al.add(2,"sushant");
      System.out.println(al);
      
      al.remove(2);
      System.out.println(al);
      
      al.set(3, 45.5f);
      System.out.println(al);
      
      System.out.println("use of iterator");
      
      Iterator itr = al.iterator();
      while(itr.hasNext())
      {
    	  System.out.print(itr.next()+ " ");
      }
      
      
      System.out.println("use of list iterator");
      ListIterator itr1 = al.listIterator();
      
      while(itr1.hasNext())
      {
    	  System.out.print(itr1.next()+ " ");
      }
      
      
      System.out.println("use of for loop");
      
      for(int i=0;i<al.size();i++)
      {
    	  System.out.print(al.get(i)+ " ");
      }
      
      
      System.out.println("use of for each loop");
      for(Object s1:al)
      {
    	 System.out.print(s1+ " ");
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	  
	  
	  
}
}
