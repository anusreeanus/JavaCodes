package core;

public class Son  extends Father{
String name= "Jerry";
int age=22;

   public static void main(String []args) {
	   Son s=new Son();
	   System.out.println(s.age);
	   System.out.println(s.fage);
	   System.out.println(s.fname);
	   System.out.println(s.name);
	   
   }
}