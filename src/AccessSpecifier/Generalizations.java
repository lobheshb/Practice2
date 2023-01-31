package AccessSpecifier;

public class Generalizations 
{
   public static void main(String[] args) {
	
	   System.out.println("new feature of jio");
	   
	   jio j=new jio();
	   j.sms();
	   j.calling();
	   j.data();
	   
	   System.out.println("new feature of VI");
	   VI v=new VI();
	   v.sms();
	   v.calling();
	   v.data();
	   v.newFeature();
	   
	   System.out.println("new feature of airtel");
	   airtel a=new airtel();
	   a.sms();
	   a.calling();
	   a.data();
	   a.newFeature();
	   
	   
	   
}
}
