package abstraction;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Deposit\t 2.Withdraw \t 3.Balance \t4.exit");
			Bank b=new Atm();
			System.out.println("\n");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("AMOUNT to be deposited is Rs");
				int amount=sc.nextInt();
				b.deposit(amount);
				
				
				b.checkBalance();
				
				break;
				
			case 2:
				System.out.println("AMOUNT to be withdrawn is Rs");
				int amount1=sc.nextInt();
				
				b.withDraw(amount1);
				
				b.checkBalance();
				
				break;
			case 3:
				
				b.checkBalance();
			
				break;
			case 4:
				System.out.println(0);
			break;
			default:
			{System.out.println(" invalid output ,enter avalid option");}
			
			}
		
	}

}
}
