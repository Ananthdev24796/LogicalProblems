package com.bridgelabz.singleton;

public class LazySingletonNew {

	public static void main(String[] args) {
		LazySingleton instance = LazySingleton.getinstance();
		System.out.println(instance.hashCode());
		
		
		LazySingleton instance1 = LazySingleton.getinstance();
		System.out.println(instance1.hashCode());

	}

}
