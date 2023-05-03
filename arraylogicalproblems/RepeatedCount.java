/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

/**
 * @author admin
 *
 */
public class RepeatedCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 2,3,4,5,2,4,6};
		
		for(int i = 0; i < array.length; i++) {
			int count = 1;
			for(int j = i+1; j < array.length; j++) {
				if( array[i] == array [j]) {
					count ++;
				}
			}
			System.out.println(array[i] + " " +count);
		}
		
		

	}

}
