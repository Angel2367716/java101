package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());

		honda.setSpeed(80);
		System.out.println(honda.getSpeed());
		//
		//		ducati.setSpeed(20);
		//		System.out.println(ducati.getSpeed());
		//
		//		honda.setSpeed(0);
		//		System.out.println(honda.getSpeed());

	}

}
