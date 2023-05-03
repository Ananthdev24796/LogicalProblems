/**
 * 
 */
package com.bridgelabz.searchalgorithm;

/**
 * @author admin
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {4,3,13,54,23,2,12,52,18};
		
		int j = 0 ;
		for(int i = 0; i < array.length-1; i++) {
			for(j = 0 ;j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}

			}
		}
		for(int i = 0; i < array.length;i++ ) {
			System.out.println(array[i]);
		}
		
	}

}
