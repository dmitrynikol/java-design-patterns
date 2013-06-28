package main.java.org.dmitrynikol.javapatterns.builder;

/**
 * The Builder pattern is a good choice when designing classes whose 
 * constructors or static factories would have more than a handful of parameters,
 * especially if most of those parameters are optional.
 */
public class Nutrition {
	
	public enum Taste { 
		INSPIRID, SOUR, SWEET, BITTER, SALTY;
	}
	
	private final int servingSize;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final Taste taste;
	
	public static class Builder {
		// required parameters 
		private final int servingSize;
		private final int calories;
		
		// optional parameters - initialized to default values
		private int fat = 0;
		private int sodium = 0;
		private Taste taste = Taste.INSPIRID;
		
		public Builder(int servingSize, int calories) {
			this.servingSize = servingSize;
			this.calories = calories;
		}
		
		public Builder fat(int value) {
			this.fat = value;
			return this;
		}
		
		public Builder sodium(int value) {
			this.sodium = value;
			return this;
		}
		
		public Builder taste(Taste taste) {
			this.taste = taste;
			return this;
		}
		
		public Nutrition build() {
			return new Nutrition(this);
		}
	}
	
	private Nutrition(Builder builder) {
		servingSize = builder.servingSize;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		taste = builder.taste;
	}
	
	@Override
	public String toString() {
		return "Nutrition: servingSize: " + servingSize + ", calories: " + calories +
				", fat: " + fat + ", sodium: " + sodium + ", taste: " + taste.name();
	}
}
