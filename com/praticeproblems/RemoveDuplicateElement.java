/**
 * 
 */
package com.bridgelabz.com.praticeproblems;

import java.util.Arrays;

/**
 * @author admin
 *
 */
public class RemoveDuplicateElement {

	/**
	 * @param args
	 */
	
	
	public int removeElement(int[] array, int n) {
		
		int[] temp = new int[n];
		int j = 0 ;
		
		
		for(int i = 0; i < n-1; i++) {
			if(array[i] != array[i+1]) {
				temp[j++] = array[i];
			}
		}
		temp[j++] = array[n-1];
		
		
		for(int i =0; i < j; i++) {
			array[i] = temp[i];
			
			
		}
		return j ;
	}


	public static void main(String[] args) {
		int[] array = {2,44,5,44,66, 44, 77,33,2};
		Arrays.sort(array);
		int n = array.length;
		RemoveDuplicateElement rE = new RemoveDuplicateElement();
		n = rE.removeElement(array,n);
		for( int i= 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
