/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

/**
 * @author admin
 *
 */
public class panlindromSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {2,6,3,8,12,5};
		int b = -1;
		int c = 1;
		int d = b+c;
		//System.out.println(d);
		int sum = a[d];
		//System.out.println(a[d]);
		for(int i = 0; i <= a.length; i++) {
			b = c            ;
			c = d;
			d = b+c;
			
			if(d < a.length) {
				sum += a[d];

			}
		}
		System.out.println(sum);
		

	}

}
