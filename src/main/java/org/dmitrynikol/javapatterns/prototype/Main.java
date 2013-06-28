package main.java.org.dmitrynikol.javapatterns.prototype;

import main.java.org.dmitrynikol.javapatterns.prototype.Product.Type;

public class Main {
	public static void main(String[] args) {
		ProductCache.loadCache();
		
		Book clonedBook = (Book) ProductCache.getProduct(Type.BOOK);
		System.out.println(clonedBook.getType());
		System.out.println(clonedBook.getPages());
		System.out.println(clonedBook.getPrice());
		System.out.println(clonedBook.getDescription());
		System.out.println(clonedBook.getContent());
		System.out.println();
		
		Headphone clonedHeadphone = (Headphone) ProductCache.getProduct(Type.HEADPHONE);
		System.out.println(clonedHeadphone.getType());
		System.out.println(clonedHeadphone.getDescription());
		System.out.println(clonedHeadphone.getImpedance());
		System.out.println(clonedHeadphone.getSensitivity());
		System.out.println(clonedHeadphone.getPrice());
		System.out.println();
		
		Laptop clonedLaptop = (Laptop) ProductCache.getProduct(Type.LAPTOP);
		System.out.println(clonedLaptop.getType());
		System.out.println(clonedLaptop.getDescription());
		System.out.println(clonedLaptop.getSize());
		System.out.println(clonedLaptop.getWeight());
		System.out.println(clonedLaptop.getPrice());
	}
}
