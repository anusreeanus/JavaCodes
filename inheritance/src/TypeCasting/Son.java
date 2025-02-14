package TypeCasting;

public class Son extends Father {
int sage=20;
public static void main (String args [])
{
Father f=new Son();
System.out.println(f.fage);
Son s =(Son) f;
System.out.println(s.fage);
System.out.println(s.sage);
}
}
