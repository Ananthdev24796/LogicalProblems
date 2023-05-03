/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

import java.util.Arrays;

/**
 * @author admin
 * Repeat and Missing Number Array
 */
public class RepeatedAndMissingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {1,2,5,2,7,3,6};
		int sum = 0;
		int total = 0;
	
		// sorting array
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
			//System.out.print(array[i]);
			
		}
		
	
		total = array.length * (array.length + 1) / 2 ;
		System.out.println("Addition of every element in array" + " " +  total);
		
	
		for(int i = 0; i < array.length; i++) {
			int count = 0;
			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					System.out.println("Repeated Number in the array is :" + " " +array[j]);
					count ++;
				}		
			}
			if (count < 1) {
				sum += array[i];
			}
		}
		System.out.println("Total sum of the array" + " " + sum);
		System.out.println("Missing number on the array:" + " " + (total - sum));
		
//		
//		int[] array1 =  new int [array.length];
//		int i  , j = 0;
//		for(i = 0; i < array1.length; i++) {
//			
//			array1[i] =  sum ;
//		}
//		
//		for(j=0; j < array1.length-1; j++) {
//			
//		}
//		System.out.println(array1[j]);
//		
		
		

	}

}
