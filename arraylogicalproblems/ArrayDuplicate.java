package com.bridgelabz.arraylogicalproblems;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] array = {22,44,66,77,44,55,22,77};
		
		for(int i = 0; i < array.length; i++ ) {
			for(int j =i+1; j< array.length; j++ ) {
				if (array[i] == array[j]) {
					System.out.println( array[j] + " ");
				}
			}
		}
	}

}
