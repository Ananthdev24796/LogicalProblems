/**
 * 
 */
package com.bridgelabz.stringlogicalproblems;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author admin
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		
		
		if(str1.length() ==  str2.length()) {
			
			// conver the string to char array
			
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();
			
			// sort 
			Arrays.sort(array1);
			System.out.println(array1);
			
			Arrays.sort(array2);
			System.out.println(array2);
			
			
			boolean result = Arrays.equals(array1, array2);
			
			if(result) {
				System.out.println("Given Two sring are anagram");
			} else {
				System.out.println("Not a anagram");
			}
			
		}
		
		
		

	}

}
