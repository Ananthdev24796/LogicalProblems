/**
 * 
 */
package com.bridgelabz.com.praticeproblems;

/**
 * @author admin
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	
	public int findSum(int n,int sum) {
		int  rem ;
		while(n != 0 ) {
			rem = n % 10 ;
			sum = sum + rem;
			n = n / 10;
			
		}
	
		if(sum > 10) {
			 return findSum(sum,0);
	
		} else {
			return sum;
		}
		
		
	}
	public static void main(String[] args) {
		int n = 349;
		int sum = 0;
		Sum s = new Sum();
		int result = s.findSum(n,sum);
		System.out.println(result);
		

	}

}
