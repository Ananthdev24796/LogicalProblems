package com.bridgelabz.singleton;

public class EarlySingleton {

	public static void main(String[] args) {
		Singleton instance = Singleton.getinstance();
		System.out.println(instance.hashCode());
		
		
		Singleton instance1 = Singleton.getinstance();
		System.out.println(instance.hashCode());


	}

}
