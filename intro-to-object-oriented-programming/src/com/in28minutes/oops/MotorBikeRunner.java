package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike ford = new MotorBike(300);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(ford.getSpeed());

		ducati.start();
		honda.start();
		ford.start();

		ducati.setSpeed(100);

		ducati.increaseSpeed(10);
		honda.increaseSpeed(100);
		ford.increaseSpeed(100);

		ducati.decreaseSpeed(250);
		honda.decreaseSpeed(250);
		ford.decreaseSpeed(250);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(ford.getSpeed());

	}

}
