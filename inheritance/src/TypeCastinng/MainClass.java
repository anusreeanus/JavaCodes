package TypeCastinng;

public class MainClass {
//	static Pen ChoosePen(int choice)
//	{ 
//		if(choice==1)
//		{
//		return new InkPen();
//		}
//		else
//		{
//			return new SketchPen();
//			}
//			
//	}
public static void main (String [] args) {
//	Pen p=ChoosePen(1);
//	p.write();
//	
	Pen p= new InkPen();
	
	InkPen inkPen=(InkPen) p;
	p.write();
	p.write();
//	Pen p= new SketchPen();
//	p.write();
}

	
}
