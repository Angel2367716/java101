package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(200);
		Book cleanCode = new Book(100);
		Book harryPotter = new Book();

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		System.out.println(harryPotter.getNoOfCopies());

		artOfComputerProgramming.read();
		effectiveJava.read();
		cleanCode.read();

		artOfComputerProgramming.setNoOfCopies(2);
		effectiveJava.setNoOfCopies(5);

		artOfComputerProgramming.increaseNoOfCopies(100);
		effectiveJava.increaseNoOfCopies(500);
		cleanCode.increaseNoOfCopies(1000);

		artOfComputerProgramming.decreaseNoOfCopies(3);
		effectiveJava.decreaseNoOfCopies(5);
		cleanCode.decreaseNoOfCopies(10);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

	}

}
