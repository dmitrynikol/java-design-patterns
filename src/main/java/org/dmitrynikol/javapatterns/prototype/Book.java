package main.java.org.dmitrynikol.javapatterns.prototype;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Book extends Product {
	private int pages;
	private List<String> content;

	public Book(String name) {
		content = new ArrayList<String>();
		this.setType(Type.BOOK);

		try {
			BufferedReader file = new BufferedReader(new FileReader(name));
			String line;

			while ((line = file.readLine()) != null) {
				content.add(line);
			}
			file.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<String> getContent() {
		return content;
	}
}
