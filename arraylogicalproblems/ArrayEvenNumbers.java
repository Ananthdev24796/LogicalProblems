package com.bridgelabz.arraylogicalproblems;

public class ArrayEvenNumbers {

	public static void main(String[] args) {
		int[] array = { 23,34,87,21,66,76,16,8,88};
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i] + " ");
			}
		}

	}

}
