package com.bridgelabz.com.praticeproblems;

public class Bag {
	
	static int SIZE_OF_BAG = 12;	
	int yellowBall = 0;
	int redBall = 0 ;
	int greenBall = 0;
	
	int avg = 0 ;
	
	String[] bagArray = new String[SIZE_OF_BAG];
	

	public void addToBags(String input, int i) {
		
			
			avg = 40 * SIZE_OF_BAG / 100; 
		
			if(greenBall < redBall && "green".equals(input)) {
				bagArray[i] = "Green";
				greenBall ++ ;
			}
			
			else if (yellowBall < avg && "yellow".equals(input)) {
				bagArray[i] = "Yellow";
				yellowBall ++ ;
			}
			else {
				bagArray[i] = "Red";
				redBall ++;
				
			}
		
	}
	
	public void displayBag() {
		
		for(int i = 0; i < bagArray.length; i++) {
			System.out.println("Bages:" + bagArray[i]+" ");
		}
	}

}
