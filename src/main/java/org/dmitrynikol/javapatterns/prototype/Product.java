package main.java.org.dmitrynikol.javapatterns.prototype;

/**
 * The Prototype pattern example. 
 */
public abstract class Product implements Cloneable {

	public enum Type {
		BOOK, HEADPHONE, LAPTOP;
	}

	private double price;
	private String description;
	private Type type;
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Product clone() {
		Product product = null;
		try {
			product = (Product) super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

		return product;
	}
}