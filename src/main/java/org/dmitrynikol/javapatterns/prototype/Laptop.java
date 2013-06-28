package main.java.org.dmitrynikol.javapatterns.prototype;

public class Laptop extends Product {
	private double weight;
	private double size;
	
	public Laptop() {
		this.setType(Type.LAPTOP);
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
}
