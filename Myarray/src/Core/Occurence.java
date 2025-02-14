package Core;

public class Occurence  {
	public static void main(String[]args) {
		 int a[]= {10,20,50,30,40,10,20,10,20,10,10};
		 
		 int i,j;
		 for( i=0;i<a.length;i++)
		 {
			 int count=0;
			 for( j=0;j<a.length;j++)
			 {
				 if(a[i]==a[j])
					
					 count++;
					
		     }
			 System.out.println(a[i]+"  "+count);
		 	}
	
		 
	 }
}
