package encapsulation;

public class Mobile {
	private String brand;
	private String color;
	private double cost;
		public void setBrand(String brand)
	{
	this.brand = brand;
	}
		public void setColor(String color) {
	this.color = color;
	}
		public void setCost(double cost)
	{
	this.cost=cost;
	
	}
public String getBrand() {
	return brand;
}
public String getColor() {
	return color;
}
public double getCost() {
	return cost;
}
}
