package com.bridgelabz.oopsconcepts;

public class Car extends Vehicle {

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Car Running successfully");
		
	}
	
	public static void main(String args[]) {
		Car car = new Car();
		car.run();
	}
	

}
