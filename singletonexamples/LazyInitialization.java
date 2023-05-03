package com.bridgelabz.singletonexamples;

public class LazyInitialization {
	
	
	private LazyInitialization() {
		
	}
	
	private static LazyInitialization theOnlyInstance;
	
	
	public static LazyInitialization getInstance() {
		
		if (theOnlyInstance == null) {
			theOnlyInstance = new LazyInitialization();
		}
		return theOnlyInstance;
		
	}

}

