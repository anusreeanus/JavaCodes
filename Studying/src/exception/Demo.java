package exception;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	System.out.println("Start");
	Scanner sc= new Scanner(System.in);
	System.out.println("value of a is" );
	int a=sc.nextInt();
	System.out.println("value of b is" );
	int b=sc.nextInt();
	try
	{
		System.out.println(a/b);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("cannot Divide by zero");
	}
	
}
}
