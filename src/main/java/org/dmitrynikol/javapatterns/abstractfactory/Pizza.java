package main.java.org.dmitrynikol.javapatterns.abstractfactory;

public abstract class Pizza {

	private Type type;
	private Size size;
	
	public Pizza(Type type, Size size) {
		this.type = type;
		this.size = size;
	}
	
	protected abstract void make();
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Pizza: " + type + " and " + size;
	}
}
