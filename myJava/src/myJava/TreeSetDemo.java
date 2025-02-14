package myJava;

import java.util.TreeSet;

public class TreeSetDemo{
public static void main(String[] args) {
	TreeSet<String> t=new  TreeSet<String>();
	t.add("Ban");
	t.add("Bad");
	t.add("Bat");
	t.add("BAG");
	t.add("BAT");
	t.add("BET");
	for(String s:t) {
		System.out.println(s);
		System.out.println(s.hashCode());
	}
}
}
