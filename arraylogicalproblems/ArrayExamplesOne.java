package com.bridgelabz.arraylogicalproblems;

public class ArrayExamplesOne {
	
	public static void main(String args[]) {
		
		int[] array = new int[5];
		
		for (int i = 0; i < 5; i++) {
			array[i] = i+1;
		}
		
		//System.out.print(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
