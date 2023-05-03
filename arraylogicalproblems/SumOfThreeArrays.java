/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

/**
 * @author admin
 *
 */
public class SumOfThreeArrays {

	/**
	 * @param array 
	 * @param args
	 */
	
	
	public void findthreeArrays(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				for(int k = j+1; k < array.length; k++) {
					int array1 = array[i] + array[j] + array[k]; 
					if( array1 == 0) {
						System.out.println(array[i] + " " + array[j] + " " + array[k]);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] array = {-1,0,1,2,-1,-4};
		SumOfThreeArrays st = new SumOfThreeArrays();
		st.findthreeArrays(array);

	}

}
