package main.java.org.dmitrynikol.javapatterns.prototype;

public class Headphone extends Product {
	private int impedance;
	private int sensitivity;
	
	public Headphone() {
		this.setType(Type.HEADPHONE);
	}
	
	public int getImpedance() {
		return impedance;
	}
	public void setImpedance(int impedance) {
		this.impedance = impedance;
	}
	public int getSensitivity() {
		return sensitivity;
	}
	public void setSensitivity(int sensitivity) {
		this.sensitivity = sensitivity;
	}
}
