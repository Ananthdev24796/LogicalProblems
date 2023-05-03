package com.bridgelabz.singleton;

public class SingletonObject {
	
	
	
	private SingletonObject() {
		
	}
	
	private static class SingletonHelper {
		private static final SingletonObject instance = new SingletonObject(); 
		
	}
	public static SingletonObject getinstance() {
		return SingletonHelper.instance;
		
	}
}


