package main.java.org.dmitrynikol.javapatterns.proxy;

/**
 * Java Design Patterns Proxy.
 * One class controls the creation of and access to objects in another class.
 */
public class ImageProxy implements Renderer {
	
	private String filename;
	private Image image;
	
	public ImageProxy(String filename) {
		this.filename = filename;
	}

	@Override
	public void render() {
		if (image == null) {
			image = new Image(filename);
		}
		
		image.render();
	}
}
