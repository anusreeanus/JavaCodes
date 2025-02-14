package abstraction;

public class Employee{
	 public static void main(String[] args) {
	   Employee obj;   
	   obj=new Developer();
	   obj.work();
	   obj=new Tester();
	   obj.work();
}

	void work() {
		// TODO Auto-generated method stub
		
	}

static void display (Employee obj) {
  obj=new Developer();
  obj.work();
 obj=new Tester();
	   obj.work();
}
public static void main1(String[] args) {
display( new Developer());  
}
}