/**
 * 
 */
package com.bridgelabz.oopsconcepts;

/**
 * @author admin
 *
 */
class Bike implements Engine {

	
	
	


	@Override
	public void print() {
		System.out.println("BS-6");
		
	}
	
	public static void main (String args[]) {
		Bike bike = new Bike();
		bike.print();
	}

	


}
