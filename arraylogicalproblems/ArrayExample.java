package com.bridgelabz.arraylogicalproblems;

public class ArrayExample {
	
  
	/*
	 * public int max(int[] array) {
	 * 
	 * 
	 * return max ; }
	 */
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int [] array = {23, 34, 56, 21, 66, 76, 16};
		
		for (int i = 0; i < array.length; i++) {
			System.out.print( array[i] + " ");
		}
		
		System.out.println( "\n" + array[5] + " " + "Fifth position");
		
		int startIndex = 0;
		int endIndex = 4;
		int sum = 0;
		
		for ( int i = startIndex; i < endIndex; i++) {
			sum = sum + array[i];
		}
		
		System.out.print(sum);
		
	}

}
