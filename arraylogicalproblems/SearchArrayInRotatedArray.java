/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;


import java.util.Scanner;

/**
 * @author admin
 *
 */
public class SearchArrayInRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {4,5,6,7,0,1,2};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target number:");
		int target = sc.nextInt();
		
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == target) {
				System.out.println("Target Found:" + i  );
			}
		}
		
		//System.out.print(array[target]);

	}

}
