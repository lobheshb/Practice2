package JavaPractice3;

public class sample6 
{
   public static void StudentName(String name)
   {
	   System.out.println(name);
   }
   
   public void StudentFullName(String FName,String LName)
   {
	   System.out.println(FName+ " "+LName);
   }
   
   public void StudentInfo(String name,char grade,float per,int id)
   {
	   System.out.println(name+ " "+grade+" "+per+" "+id );
   }
   
   public static void main(String[] args) {
	
	   sample6 s1=new sample6();
	   s1.StudentName("lobhesh");
	   s1.StudentFullName("lobhesh" ,"bole");
	   
	   s1.StudentInfo("lobhesh", 'a', 35.5f, 100);
}
}
