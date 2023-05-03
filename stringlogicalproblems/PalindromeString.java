/**
 * 
 */
package com.bridgelabz.stringlogicalproblems;

import java.util.Scanner;

/**
 * @author admin
 *
 */
public class PalindromeString {

	/**
	 * @param args
	 * 
	 */
	
	
	static int panlindrome(String str) {
		
		int j = str.length()-1;
		
		for(int i = 0; i < j-1; i++) {
			if(str.charAt(i) != (str.charAt(j))) {
				return -1;	
			}
			j--;
		}
		return 1;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check");
		String str = sc.next();
		//String str = "Madam";
		str = str.trim();
		int result = panlindrome(str.toLowerCase());
		if( result != -1) {
			System.out.print("panlidrome");
		} else {
			System.out.println("Not panlindrome");
		}
		
		
		
	}

}
