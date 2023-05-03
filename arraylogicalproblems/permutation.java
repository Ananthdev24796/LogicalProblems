/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

/**
 * @author admin
 *
 */
public class permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {1,1,5};
		
		int length = array.length;
		int fact = 1;
		
		for(int i = 1; i <= length; i++) {
			fact = fact * i;
			
		}
		
		System.out.println(fact);
		
		

	}

}
