/**
 * 
 */
package com.bridgelabz.searchalgorithm;

import java.util.Scanner;

/**
 * @author admin
 *
 */
public class LinearSearch {

	/**
	 * @param key 
	 * @param args
	 */
	
	static int searchElement(int[] array, int key) {
		
		for(int i = 0; i <= array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {4,5,6,7,8,9}; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		int result = searchElement(array,key);
		if(result == -1 ) {
			System.out.println("Key Not Present");
		} else {
			System.out.println(result);
		}
	}

}
