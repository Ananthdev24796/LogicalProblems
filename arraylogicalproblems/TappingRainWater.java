/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;

/**
 * @author admin
 *
 *Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 *Output: 6
 *Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
 * In this case, 6 units of rain water (blue section) are being trapped.
 */
public class TappingRainWater {

	/**
	 * @param n 
	 * @param height 
	 * @param args
	 * @return 
	 */
	
	
	static int  holdingWater(int[] height, int n) {
		int res = 0;
		
		for(int i = 1; i < n-1; i++) {
			 int left = height[i];
			 for(int j = 0; j <= i; j++) {
				 left = Math.max(left, height[j]);
				// System.out.println(left);
			 }
			 
			 int right = height[i];
			 for(int j = i+1  ; j < n; j++) {
				 right =Math.max(right, height[j]);
				 //System.out.println(right);
				 
			 }
			 res += Math.min(left, right) - height[i];
		}
		
		return res;
	}
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int n = height.length;
		System.out.println(holdingWater(height,n));
		

	}

}
