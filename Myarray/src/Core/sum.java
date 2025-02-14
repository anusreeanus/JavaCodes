package Core;

public class sum {
	public static void main(String [] args)
	{
		int sum=0;int avg=0;
		int[]a= {10,20,30,40,50};
		for( int i=0;i<a.length;i++)
		{
			sum+=a[i];
			avg=sum/a.length;
			
			
		}
		System.out.println("sum is: " +sum);
		System.out.println("average is :"+avg);
	}

}
