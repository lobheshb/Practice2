package JavaPractice4;

public class String2 
{ 
	public static void main(String[] args) {
		
		String s1="velocity";
		String s2="ABCD";
		String s3="abcd";
		String s4="my name is rahul";
		String s5="";
		String s6="abcaba";
		String s7="suraj";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s4.startsWith("my"));
		System.out.println(s4.endsWith("rahul"));
		
		
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(0));
		
		System.out.println(s5.isEmpty());
		System.out.println(s6.contains("b"));
		
		System.out.println(s6.lastIndexOf("b"));
		
		System.out.println(s1.substring(0,4));
		
		System.out.println(s1.substring(4));
		
		System.out.println(s2.concat(s3));
		
		System.out.println(s2.concat(s3));
		
		System.out.println(s1+s3);
		
		System.out.println(s1+s2+s3);
		
		System.out.println(s3+s4);
		
		System.out.println(s7.replace("suraj", "akash"));

	}

}
