package com.bridgelabz.singleton;

public class LazySingleton {

	
	
	private LazySingleton() {
		
	}
	
	private static LazySingleton instance;
	
	
	public static LazySingleton getinstance() {
		if(instance == null) {
			synchronized(LazySingleton.class) {
				if(instance == null) {
					instance = new LazySingleton();
				}
			}
			
		} 
		return instance;
	}
}
