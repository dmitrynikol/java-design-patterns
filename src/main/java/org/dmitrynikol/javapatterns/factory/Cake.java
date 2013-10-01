package main.java.org.dmitrynikol.javapatterns.factory;

public abstract class Cake {
	
	private CakeType type;
	
	public Cake(CakeType type) {
		this.type = type;
		commonCooking();
	}
	
	protected abstract void make();
	
	public CakeType getType() {
		return type;
	}

	public void setType(CakeType type) {
		this.type = type;
	}
	
	private void commonCooking() {
		// some common part of cooking
	}
}
