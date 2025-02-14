package Inheritance;

import java.util.Scanner;

public class Cem {
public static void main(String []args)
{
	Subject s=new Subject();
	System.out.println(s.sub);
	System.out.println(s.tname);
	Scanner sc=new Scanner(System.in);
	Student m=new Student("anu", 101, "cs", "history", "tamil");
	
	System.out.println(m.name);
	
	System.out.println(m.id);	
	System.out.println(m.dept);
	System.out.println(m.dept1);
	System.out.println(m.dept2);
}

}
