package main.java.org.dmitrynikol.javapatterns.immutable;

import java.util.Date;

/**
 * An immutable class is one whose state can not be changed once created.
 * Benefits:
 * simple to construct, test, and use
 * automatically thread-safe and have no synchronization issues
 * do not need an implementation of clone
 * make good Map keys and Set elements 
 * 
 */
public final class Immutable {
	private final Integer first;
	private final String second;
	private final Date third;

	private Immutable(Integer first, String second, Date third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public static Immutable createInstance(Integer one, String two, Date three) {
		return new Immutable(one, two, three);
	}
	
	public Integer getFirst() {
		return first;
	}

	public String getSecond() {
		return second;
	}

	public Date getThird() {
		return new Date(third.getTime());
	}
}
