/**
 * 
 */
package com.bridgelabz.searchalgorithm;


import java.util.Scanner;
/**
 * @author admin
 *
 */
public class binaryseachRecursive {

	/**
	 * @param element 
	 * @param args
	 */
	 static int binarySearch(int[] array, int element , int low, int high) {
//		 int low = 0;
//		 int high = array.length - 1;
		 
			 // to find the mid element
			 
			 int mid = low + (high - low ) / 2;
			 
			 // to check the mid element is key element
			 
			 if(array[mid] == element ) {
				return mid ;
				 
			 }
			 
			 if(array[mid] < element) {
				 return binarySearch(array,element,mid+1, high);
			 }
			 
			 else {
				 return binarySearch(array,element, low , mid -1 );
			 }
			
	 }
	public static void main(String[] args) {
		int[] array = {3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key element to find ");
		int element = sc.nextInt();
		int result = binarySearch(array,element,0,array.length-1);
		if(result == -1 ) {
			System.out.print("No key found in array");
		} else {
			System.out.println("Key found at index:" + result);
		}

	}

}
