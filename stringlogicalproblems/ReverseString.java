/**
 * 
 */
package com.bridgelabz.stringlogicalproblems;

/**
 * @author admin
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Eclipse";
		String rstr = reverseString(str);
		System.out.println(rstr);

	}
	
	
	static String reverseString(String str) {
		String rstr = "";
	 	for(int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			 rstr = rstr + ch;
		}
		return rstr;
	}

}
