 package file;

import java.io.File;
//import java.io.IOException;

public class Test {
public static void main(String[] args) {
	int count =0;
	File f= new File("C:\\Windows");
	String[]s=f.list();
	for(String s1:s) {
		File f1=new File(f,s1);
		if(f1.isDirectory()) {
			System.out.println(s1);
		}
		
		count++;
	}
System.out.println(count);	
}
}
//	File f1= new File("Madhu.pdf");
//	File f2= new File("priya.txt");
//	boolean res=f.mkdir();
//	System.out.println(res);
//	try {
//		System.out.println(f.createNewFile());
//		System.out.println(f1.createNewFile());
//		System.out.println(f2.createNewFile());
//	}
//	catch(IOException e) {
//		e.printStackTrace();
//	}
//	
//}
//}

