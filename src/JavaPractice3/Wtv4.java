package JavaPractice3;

public class Wtv4 extends Wtv3
{
   public void videocalling()
   {
	   System.out.println("video calling:200");
   }
   
   public static void main(String[] args) {
	
	   //multilevel level inheritance
	   
	   Wtv4 w1=new Wtv4();
	   w1.sms();
	   w1.calling();
	   w1.data();
	   w1.videocalling();
	   
	   
	   
}
   
   
   
}
