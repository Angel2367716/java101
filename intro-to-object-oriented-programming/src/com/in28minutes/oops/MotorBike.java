package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed; // member variable

	// behavior

	// method
	// inputs - int speed
	// outputs - void
	// name - setSpeed

	void setSpeed(int speed) { // local variable
		this.speed = speed;
	}

	int getSpeed() {
		return this.speed;
	}
	void start() {
		System.out.println("bike started");
	}
}
