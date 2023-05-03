/**
 * 
 */
package com.bridgelabz.arraylogicalproblems;


import java.util.Scanner;
/**
 * @author admin
 *
 */
public class BuyAndSellStocks {

	/**
	 * @param args
	 * @return 
	 * @return 
	 */
	
	
	public  int buyMethod(int[] price) {
		int buy = 0 ;
		for(int i = 0; i < price.length; i++) {
			if(price[buy] > price[i]) {
				buy =  i;
			}
		}
		return buy;
		
	}
	
	public int sellMethod(int[] price, int buy2) {
		int sell = buy2 ;
		for(int i = buy2; i < price.length; i++) {
			if(price[sell] < price [i]) {
				sell = i;
			}
			
		}
		return sell;
		
	}
	
	public static void main(String[] args) {
		int[] price = {7,1,5,3,6,4};
		BuyAndSellStocks buyandsell = new BuyAndSellStocks();
		int buy = buyandsell.buyMethod(price);
		int sell = buyandsell.sellMethod(price, buy);
		System.out.println("purchase Date"+ buy + "Selling day" + sell );
		
		
		
		
		
		  
	}

}
