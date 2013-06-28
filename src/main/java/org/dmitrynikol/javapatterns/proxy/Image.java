package main.java.org.dmitrynikol.javapatterns.proxy;

public class Image implements Renderer {
	
	private byte[] data;
	
	public Image(String filename) {
		data = loadImage(filename);
	}
	
	@Override
	public void render() {
		System.out.println("*(-_-)*");
	}
	
	private byte[] loadImage(String filename) {
		return null;
	}
}
