package JavaPractice4;

import java.util.ArrayList;

public class sample1 
{
  public static void main(String[] args) {
	
	  ArrayList al =new ArrayList();
	  
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
      System.out.println(al.isEmpty());
      System.out.println(al.size());
      System.out.println(al.contains(100));
      System.out.println(al.get(2));
      
      System.out.println("--------");
      al.add("rahul");
      
      System.out.println(al);
      
      al.remove("25.5");
      
      System.out.println(al);
      
      al.set(3, 35.5f);
      
      System.out.println(al);
      
      
      
      
	  		
}
}
