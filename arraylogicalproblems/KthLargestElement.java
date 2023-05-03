/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author admin
 *	Given an integer array nums and an integer k, return the kth largest element in the array.
 */
public class KthLargestElement {

	/**
	 * @param array 
	 * @param args
	 */
	
	
	public void findLargest(int[] array, int input) {
		
		//Sorting the array
		
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " " );
		}
		System.out.println();
		int max = array.length - input;
		System.out.println("Kth Largest number " + array[max]);
		
	}
	public static void main(String[] args) {
		int[] array = {3,2,1,5,6,4,3,9,7,9,11};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the K value:");
		int input = sc.nextInt();
		KthLargestElement kthobj = new KthLargestElement();
		kthobj.findLargest(array,input);
		
		

	}

}
