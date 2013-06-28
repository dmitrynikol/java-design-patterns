package main.java.org.dmitrynikol.javapatterns.prototype;

import java.util.HashMap;
import java.util.Map;

import main.java.org.dmitrynikol.javapatterns.prototype.Product.Type;

public class ProductCache {
	private static Map<Product.Type, Product> cache = new HashMap<Product.Type, Product>();
	
	public static Product getProduct(Type type) {
		Product cachedProduct = null;
		if (cache.containsKey(type) && cache.get(type) != null) {
			cachedProduct = cache.get(type).clone();
		}
		
		return cachedProduct;
	}
	
	public static void loadCache() {
		Book book = new Book("Design Patterns");
		book.setDescription("Must have every...");
		book.setPages(1000);
		book.setPrice(100);
		cache.put(book.getType(), book);
		
		Headphone headphone = new Headphone();
		headphone.setDescription("Yamaha quality...");
		headphone.setImpedance(40);
		headphone.setSensitivity(120);
		headphone.setPrice(200);
		cache.put(headphone.getType(), headphone);
		
		Laptop laptop = new Laptop();
		laptop.setDescription("Mobility, productivity, all in one...");
		laptop.setSize(2);
		laptop.setWeight(1500);
		laptop.setPrice(2000);
		cache.put(laptop.getType(), laptop);
	}
}
