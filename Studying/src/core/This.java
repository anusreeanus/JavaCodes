package core;


public class This {
	int age=20;
	String name ="pri";
	This(int age,String name){
	    this. age=	age;
	 this.name=name;
	}
	public static void main(String[] args) {
		This s=new This(22,"ANU");
		System.out.println(s.age);
		
		System.out.println(s.name);
	}
	

}
