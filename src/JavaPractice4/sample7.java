package JavaPractice4;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class sample7
{ 
	public static void main(String[] args) {
		
		LinkedHashSet lhs =new LinkedHashSet();
		
		 lhs.add("lobhesh");
		  lhs.add(200);
		  lhs.add('a');
		  lhs.add(25.5f);
		  lhs.add("vikas");
	      lhs.add("");
	      lhs.add(null);
	      lhs.add(null);
	      lhs.add(100);
	      lhs.add("lobhesh");
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(100));
		
		lhs.add(654);
		System.out.println(lhs);
		
		lhs.remove(654);
		System.out.println(lhs);
		
		System.out.println("used of iterator");
		Iterator itr = lhs.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		
		System.out.println("use of each loop");
		
		for(Object s1:lhs)
		{
			System.out.print(s1+ " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
