package m1;

import java.util.Scanner;

public class HelloWorld {
	 public static void main (String [] args) {
		System.out.println("HEllO WORLD");
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println(" the number entered is:"+ a);
		System.out.println("enter the number");
		int b=s.nextInt();
		s.close();
		if(b<0) {
			System.out.println(" negative");
		}
		else {
			System.out.println("positive");
		}
		
	 }
}