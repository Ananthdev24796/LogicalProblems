/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

/**
 * @author admin
 *
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 3,2,1,5,6,4};
		int max = array[0];
		
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max ) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
