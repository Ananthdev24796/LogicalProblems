package com.bridgelabz.singleton;

public class Singleton {
	
	
	
	private Singleton() {
			
	}

	// Early Instantiation
	
	private static Singleton instance = new Singleton();
	
	
	
	public static Singleton getinstance() {
		return instance ;
	}
}
