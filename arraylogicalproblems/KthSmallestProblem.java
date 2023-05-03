/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author admin
 *https://www.google.com/url?q=https://practice.geeksforgeeks.org/problems/
 *kth-smallest-element5635/1&sa=D&source=editors&ust=1683014986612049&usg=AOvVaw1Kso51DD8pEU5nB4WA4Vyu
 */
public class KthSmallestProblem {

	/**
	 * @param k 
	 * @param array 
	 * @param args
	 * @return 
	 * 
	 */
	
	public void smallestNumber(int[] array, int k) {
		
//		
//		int min = array[0];
//		for(int i = 0; i < array.length; i++) {
//			if( array[i] < min) {
//				min = array[i];
//				
//			}
//		}
//		return min;
		
		
		Arrays.sort(array);
		int i = 0;
		for(i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int min = array[k];
		System.out.println("Kth smallest number :" + min + " ");
		
		
		
	}
	

	
	
//	public void printArray(int[] array) {
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int input = sc.nextInt();
		int[] array = new int[input];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Add elements to  array");
			int element = sc.nextInt();
			array[i] = element;
		}
		System.out.println("Enter the  kTH element");
		int k = sc.nextInt();
		KthSmallestProblem obj = new KthSmallestProblem();
		//obj.printArray(array);
		obj.smallestNumber(array,k);
		
		

	}

}
