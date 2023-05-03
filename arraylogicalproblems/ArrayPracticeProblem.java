/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

import java.util.Scanner;

/**
 * @author admin
 *
 */
public class ArrayPracticeProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arrayElement;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int input = sc.nextInt();
		int[] array = new int[input];
		
	
		for(int i = 0; i < input; i++ ) {
			arrayElement = sc.nextInt();
			array[i] = arrayElement;
			sum += array[i];
		}
		
		
		for(int i = 0; i < array.length; i++ ) {
			for(int j = i+1; j < array.length; j++) {
				if( array[i] + array[j] == 10 ) {
					System.out.println(array[i]+ " " +  array[j]);
				}
			}
		}
		
		System.out.println();
		System.out.println("Total sum :" + sum);
	}

}
