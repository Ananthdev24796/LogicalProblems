package com.bridgelabz.singletonexamples;

public class ThreadSafeSingleton {
	
	
	
	private ThreadSafeSingleton() {
		
	}
	
	private static ThreadSafeSingleton theOnlyInstance;
	
	
	public static synchronized ThreadSafeSingleton getInstance() {
		
		if(theOnlyInstance == null) {
			theOnlyInstance = new ThreadSafeSingleton();
		}
		return theOnlyInstance;
		
	}

}
