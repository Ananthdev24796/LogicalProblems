package com.bridgelabz.arraylogicalproblems;

import java.util.Scanner;

public class ChocolateDistribution {

	public static void main(String[] args) {
		int[] array = {7,3,2,4,9,12,56};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number of students");
		int m = input.nextInt();
		int max = 0;
		int min = array[0];
		
		System.out.println("Enter the Box Number");
		
		for(int i = 0; i < m; i++) {
			
			int box = input.nextInt();
			if( box < array.length) {
				if(array[box] > max) {
					max = array[box];
				}
				if(array[box] < min) {
					min = array[box];
				}
			} else {
				System.out.println("Number you enter is invalid");
			}
			
		}
		
		System.out.println("Mimimum" + " " + min + "\n" + "maximum" + " "+ max);
		
		
		System.out.println("Difference" + " "  + ( max - min )  );
		
	}

}
