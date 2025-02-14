package m1;

public class Constructor {
	 int age=25; int b=40;
           Constructor()
           {
        	  System.out.println( " Iam a Constructor");  
        	 
           }
           void method( int age,int b) {
        	   this.age =age;
        	   this.b =b;
        	   System.out.println(age+ "" +b);
     		  System.out.println( " to be finish");
     		  
     	  }
}
