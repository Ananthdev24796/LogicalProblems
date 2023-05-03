package com.bridgelabz.singletonexamples;

public class DoubleCheckedSingleton {
	
	
	private DoubleCheckedSingleton() {
		
	}
	
	private static DoubleCheckedSingleton theOnlyInstance;
	
	
	public static DoubleCheckedSingleton getInstance() {
		
		
		if(theOnlyInstance == null) {
			synchronized(DoubleCheckedSingleton.class) {
				
				if(theOnlyInstance == null) {
					theOnlyInstance = new DoubleCheckedSingleton();
				}
			}
		
		}
		return theOnlyInstance;
		
	}
		

}
