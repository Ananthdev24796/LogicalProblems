/**
 * 
 */
package com.bridgelabz.stringlogicalproblems;

/**
 * @author admin
 *
 */
public class StringArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "bridgelabz";
		
		char charArray[] = new char[str.length()];
		
		for(int i = 0 ; i < str.length(); i++) {
			charArray[i] = str.charAt(i); 
		}
		
		for(int i = charArray.length-1; i >= 0; i--) {
			System.out.print(charArray[i]);
			
		
			
		}
		
		
	}

}
