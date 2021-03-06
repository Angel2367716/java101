package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed; // member variable
	// co-generation right click > source > generate getters and setters

	MotorBike() {
		this(5); // here we are calling the other constructor
	}

	MotorBike(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	void start() {
		System.out.println("bike started");
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed = this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed = this.speed - howMuch);
	}
}
