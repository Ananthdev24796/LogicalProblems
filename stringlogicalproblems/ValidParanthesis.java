/**
 * 
 */
package com.bridgelabz.stringlogicalproblems;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author admin
 *
 */
public class ValidParanthesis {

	/**
	 * @param args
	 */
	
	public boolean isValid(String s) {
		
		
		if(s.length() % 2 != 0) {
			return false;
		}
		char ch ;
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(s.charAt(i));
			} else if (ch == ')' && !stack.isEmpty() && stack.peek() == '('){
				stack.pop();
				
			}else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
				stack.pop();
			}else if (ch == ']' && !stack.isEmpty() && stack.peek() == '['){
				stack.pop();
		} 
		
		
	}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		//String s = "{}{" ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		String s = sc.next();
		
		ValidParanthesis vp = new ValidParanthesis();
		boolean n = vp.isValid(s);
		
		if (n == true) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
		

	}

}
