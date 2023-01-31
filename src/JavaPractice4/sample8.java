package JavaPractice4;

import java.util.Iterator;
import java.util.TreeSet;

public class sample8 
{
    public static void main(String[] args) {
		
    	TreeSet tr=new TreeSet();
    	
    	tr.add(300);
    	tr.add(200);
    	tr.add(500);
    	tr.add(400);
    	tr.add(800);
    	tr.add(137);
    	tr.add(900);
    	tr.add(346);
    	tr.add(300);
    	tr.add(200);
    	
    	System.out.println(tr);
    	System.out.println(tr.size());
    	System.out.println(tr.isEmpty());
    	System.out.println(tr.contains(100));
    	
    	System.out.println("addd");
    	tr.add(100);
    	System.out.println(tr);
    	
    	tr.remove(137);
    	
    	System.out.println(tr);
    	
    	System.out.println("use of iterator");
    	
    	Iterator itr = tr.iterator();
    	
    	while(itr.hasNext())
    	{
    		System.out.print(itr.next()+ " ");
    	}
    	
    	System.out.println("use of each loop");
    	
    	for(Object s1:tr)
    	{
    		System.out.print(s1+ " ");
    	}
    	
    	
    	
    	
	}
}
