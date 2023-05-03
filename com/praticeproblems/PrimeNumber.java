/**
 * 
 */
package com.bridgelabz.com.praticeproblems;

/**
 * @author admin
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int num = 1000;
	
	for(int i = 2; i <= num; i++) {
		int cnt = 0;
		for(int j = 1; j < i; j++) {
			if(i % j == 0) {
				cnt = cnt + 1;
			}
		}
		if( cnt < 2) {
			System.out.println(i);
		}
	}
	
	}
	
}
