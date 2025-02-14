package Abstract;

public class Travel  extends GooglePay{
	@Override
	void Pay() {
		System.out.println("Pay RS 400");
	}
	void BookCab() {
		System.out.println("Travelling to Ernakulam");
	}

public static void main(String args[]) {
Travel t=new Travel();
t.BookCab();
t.Pay();
}

}
