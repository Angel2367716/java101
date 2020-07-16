package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed; // member variable
	// co-generation right click > source > generate getters and setters

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("bike started");
	}
}
