/**
 * 
 */
package com.bridgelabz.stringlogicalproblems;

/**
 * @author admin
 *
 */
public class fibn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a = 0, b = 1 , c , count = 94;
		
		
		for ( long i =1 ;i<count;i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		
			
		}
		
	}

}
