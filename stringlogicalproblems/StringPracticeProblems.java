/**
 * 
 */
package com.bridgelabz.stringlogicalproblems;

/**
 * @author admin
 *
 */
public class StringPracticeProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] hobbies = { "hobbies1","hobbies2","hobbies3"};
		
		
		for(int i = 0; i < hobbies.length; i++) {
			if(i != hobbies.length-1) {
				System.out.print(hobbies[i]+",");
			}
			
			if(i == hobbies.length-1) {
				System.out.print(hobbies[i] + ".");
			}
			
		}

		}
  }
