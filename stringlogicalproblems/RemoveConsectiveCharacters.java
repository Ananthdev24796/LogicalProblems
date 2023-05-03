/**
 * 
 */
package com.bridgelabz.stringlogicalproblems;


import java.util.Scanner;
/**
 * @author admin
 *
 */
public class RemoveConsectiveCharacters {

	/**
	 * @param args
	 */
	
	
	public String removeConsective(String input) {
//		String subString = " ";
//		for(int i = 0; i < input.length(); i++) {
//			for(int j = i+1; j < input.length(); j++) {
//				if(input.charAt(i) == input.charAt(j)) {
//						subString = (subString + input.charAt(i)); 
//				} else {
//					r
//				}
//			}
//		}
//		System.out.println(subString);
		
		char[] array = input.toCharArray();
		char prev = 0;
		char k = 0;
		
		
		for (char c : array) {
			if( prev != c) {
				array[k++] = c;
				prev = c;
				
			}
			
		}
		return new String(array).substring(0,k);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = sc.next();
		RemoveConsectiveCharacters obj = new RemoveConsectiveCharacters();
		String str = obj.removeConsective(input);
		System.out.println(str);
		
		
		
		
				

	}

}
