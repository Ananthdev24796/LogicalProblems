/**
 * 
 */
package com.bridgelabz.singletonexamples;

/**
 * @author admin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoubleCheckedSingleton e1 = DoubleCheckedSingleton.getInstance();
		
		DoubleCheckedSingleton e2 = DoubleCheckedSingleton.getInstance();
		
		if( e1 == e2 ) {
			System.out.println("object are same");
		} else {
			System.out.println("object are not same");
		}

	}

}
