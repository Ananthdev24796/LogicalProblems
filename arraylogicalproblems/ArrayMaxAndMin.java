package com.bridgelabz.arraylogicalproblems;

public class ArrayMaxAndMin {
	
	static int findMaximum(int[] array) {
		int max = array[0];
		
		for(int i = 0; i<array.length ; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	static int findMinimum(int[] array) {
		int min = array[0];
		
		for(int i = 0; i<array.length ; i++) {
			if(array[i] < min) {
				min = array[i];
			}
			  
		}
		return min;
	}
		

	public static void main(String[] args) {
		int[] array = {12,14,6,7,2,9,14,8};
		int max =findMaximum(array);
		int min = findMinimum(array);
		
		System.out.println("minimum" + " " + min + "\n" +  "maximum" + " " + max );
		
		
	}

}
