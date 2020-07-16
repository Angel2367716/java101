package com.in28minutes.oops;

public class Book {
	// no of copies
	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}


	void read() {
		System.out.println("you read your first book!");
	}
}
