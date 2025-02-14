package Abstract;

public class Ann extends Person{
	@Override
	void eat() {
		System.out.println("She is eating ");
	}
public static void main(String args[]) {
	Ann a=new Ann();
	a.eat();
}
}

