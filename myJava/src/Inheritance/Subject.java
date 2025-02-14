package Inheritance;

public class Subject extends Teacher{
	String sub="Maths";
	
	
	public static void main(String []args) {
	Subject s=new Subject();
	System.out.println(s.sub);
	System.out.println(s.tname);
	
}
}