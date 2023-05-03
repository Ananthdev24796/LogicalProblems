/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

/**
 * @author admin
 *
 */
public class AdditionOfElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {1,2,5,2,7,3,6};
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}

}
