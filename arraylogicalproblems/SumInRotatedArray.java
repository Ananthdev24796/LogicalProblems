/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

/**
 * @author admin
 *
 */
public class SumInRotatedArray {

	/**
	 * @param args
	 */
	
	public void findPair(int[] array,int sum) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] + array[j] == sum) {
					System.out.println(array[i] + " "+ array[j]);
				}
			}
		}
		
	}
	
	
		
	public static void main(String[] args) {
		int[] array = {11, 15, 6, 8, 9, 10};
		int sum = 17;
		SumInRotatedArray obj = new SumInRotatedArray();
	    obj.findPair(array,sum);
		//System.out.println(msg);

	}

}
