package com.bridgelabz.arraylogicalproblems;

public class ReverseTheArray {

	public static void main(String[] args) {
		int[] array = {12,14,6,7,2,9,14,8};
		
		
		
		/*
		 * for( int i = 0; i < array.length ; i++) { System.out.print( array[i] + " ");
		 * }
		 * 
		 * for(int i = array.length-1; i >= 0; i--) { System.out.print(array[i] + " ");
		 * }
		 */
		 
		 
		 
		
		int j = array.length - 1;
		
		for(int i= 0; i<j; i++) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;	
			
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		

	}

}
