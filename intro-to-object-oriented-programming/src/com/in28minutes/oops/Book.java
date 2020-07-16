package com.in28minutes.oops;

public class Book {
	// no of copies
	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	void read() {
		System.out.println("you read your first book!");
	}

	public void increaseNoOfCopies(int howMuch) {
		this.noOfCopies = this.noOfCopies + howMuch;
	}

	public void decreaseNoOfCopies(int howMuch) {
		this.noOfCopies = this.noOfCopies + howMuch;
	}
}
