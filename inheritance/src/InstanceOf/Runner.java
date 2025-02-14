package InstanceOf;

public class Runner {
	static void display(Father obj) {
		if(obj instanceof Son) { 
			Son s= (Son) obj;
			System.out.println(s.fname+" "+s.sname);
			
		}
		else if(obj instanceof Daughter) {
			Daughter d= (Daughter) obj;
			System.out.println(d.fname+" "+d.dname);
		}	
	}
	public static void main(String args [])
	{
		 display(new Son());
		 display(new Daughter());
	}

}
