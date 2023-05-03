/**
 * 
 */
package com.bridgelabz.searchalgorithm;

import java.util.Scanner;

/**
 * @author admin
 *
 */
public class BinarySearch {

	/**
	 * @param element 
	 * @param args
	 */
	
	
	static int  binarySearch(int[] array, int element ) {
		int low = 0;
		int high = array.length -1;
		
		
		
		while(low <= high) {
			
			// to find the mid element
			int mid = low + (high - low) / 2;
			

			// to check mid element is key
			
			if (array[mid] == element) {
				return mid;
				
			}
			
			// check mid is lesser than search element
			else if (array[mid] < element) {
				low = mid + 1;
			}
			
			// check mid is greater than search element
			else {
				high = mid - 1;
				
			}
			
		}
		
		
		return -1 ;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,5,6,7,8,9,13};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int element = sc.nextInt();
		int result = binarySearch(array,element);
		if (result == -1) {
			System.out.println("Invalid key");
			
		}else {
			System.out.println(result);
		}
	}

}
