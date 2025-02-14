package encapsulation;

public class Solution {
		public static void main(String []args)
		{
			Mobile m= new Mobile();
			m.setBrand("Iphone");
			m.setColor("Blue");
			m.setCost(2345678.99);
			
			System.out.println("Brand is "+m.getBrand());
			System.out.println("Color is "+m.getColor());
			System.out.println("Cost is "+m.getCost());
		}
}
