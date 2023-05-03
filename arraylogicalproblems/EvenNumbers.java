package com.bridgelabz.arraylogicalproblems;

public class EvenNumbers {
	public static void main (String [] args) {
		
		int startingNumber = 10;
		int endingNumber = 20;

		int[] array = new int[10];
		int j = 0;
		
		for(int i = startingNumber; i < endingNumber; i++) {
			if (i % 2 == 0) {
				//System.out.print(i);
				array[j] = i ;
				j++;
			}
		
		}
		
		for(int i = 0; i < array.length - 1; i++) {
			//System.out.print(array[i]+ " ");
			
			if (array[i] != 0 ) {
				System.out.println(array[i]+ " ");
			}
		}
	}
			
}
