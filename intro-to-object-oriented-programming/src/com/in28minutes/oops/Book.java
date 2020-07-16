package com.in28minutes.oops;

public class Book {
	// no of copies
	private int noOfCopies;

	void setNoOgCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;

		System.out.println(noOfCopies);
		System.out.println(this.noOfCopies);
	}

	void read() {
		System.out.println("you read your first book!");
	}
}
