package main.java.org.dmitrynikol.javapatterns.proxy;

public class Main {
	public static void main(String[] args) {
		ImageProxy proxy = new ImageProxy("test image file");
		proxy.render();
	}
}
