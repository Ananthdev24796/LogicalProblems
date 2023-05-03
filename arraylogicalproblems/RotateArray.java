/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

/**
 * @author admin
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	
	
	public void originalArray(int[] array) {
		System.out.println();
		for (int i = 0; i <  array.length; i++) {
			System.out.print(  array[i] + " ");
		}
	}
	
	public void arrayRotate(int[] array) {
		for(int i = 0; i < array.length-1; i++) {                                  
			for(int j = 0 ; j < array.length -1; j++) {

				array[j] = array[j] + array[j+1];
				array[j+1] = array[j] - array[j+1];
				array[j] = array[j] - array[j+1];
			}
			
			originalArray(array);
		}
		
	}
	public static void main(String[] args) {
		int[] array = {10,6,9,34,23,99,43};
		RotateArray arr = new RotateArray();
		arr.originalArray(array);
		arr.arrayRotate(array);
		
		
		

	}

}
