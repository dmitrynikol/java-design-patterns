package main.java.org.dmitrynikol.javapatterns.factory;

/**
 * Factory pattern for creating instances for your classes.
 * Pattern explain loose coupling between classes. 
 * 
 * Some examples of factory pattern in JDK
 * java.sql.DriverManager#getConnection()
 * java.net.URL#openConnection()
 * java.lang.Class#newInstance()
 * java.lang.Class#forName()
 */
public class CakeFactory {
	public static Cake buildCake(CakeType type) {
		Cake cake = null;
		switch(type) {
			case SMALL:  cake = new SmallCake(); break;
			case MEDIUM: cake = new MediumCake(); break;
			case BIG: cake = new BigCake(); break;
			default: break;
		}
		return cake;
	}
}
