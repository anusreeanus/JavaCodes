package abstraction;
public class Person{
	private int age;
	
	
	public void setAge(int age) {
		if(age>=0 && age<=100)
		{
			this.age=age;
			System.out.println("Age Initialised.");
		}
		else {
			System.out.println("Age Invalid.");
		}
	}
	
	public int getAge() {
		return age;
	}
	
}