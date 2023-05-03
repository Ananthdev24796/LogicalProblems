/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

import java.util.Arrays;

/**
 * @author admin
 *
 */
public class MinimumInRotatedArray {

	/**
	 * @param args
	 */
	
	
	public  void printArray(int[] array) {
		System.out.println();
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	public void rotateArray(int[] array,int min) {
		
		for(int i = 0; i < min ; i++) {
			for(int j = 0; j < min; j++) {
				array[j] = array[j] + array[j+1];
				array[j+1] = array[j] - array[j+1];
				array[j] = array[j] - array[j+1];
			}
			printArray(array);
		}
		
	}
	
	public void findMinimum(int[] array) {
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(min < array[0]) {
				min = array[0];
			}
		}
		System.out.println("Mimimum in rotated Array:" + array[min] + " "+ "at position" + min );
		rotateArray(array,min);
	}
	public static void main(String[] args) {
		int[] array = {4,5,6,7,0,1,2};
		MinimumInRotatedArray obj = new MinimumInRotatedArray();
	
		obj.findMinimum(array);
		Arrays.sort(array);
		//obj.printArray(array);
		//obj.rotateArray(array);

	}

}
