/**
 * 
 */
package com.bridgelabz.com.praticeproblems;

import java.util.Scanner;
/**
 * @author admin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bag bag = new Bag();
		Scanner sc = new Scanner(System.in);

		
		for(int i = 0 ; i < bag.SIZE_OF_BAG; i++) {
			System.out.println("Enter the ball color");
			String input = sc.nextLine();
			bag.addToBags(input, i);
		}
		
			bag.displayBag();
	
	

	}

}
