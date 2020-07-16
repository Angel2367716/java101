package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.read();
		effectiveJava.read();
		cleanCode.read();

		artOfComputerProgramming.setNoOfCopies(2);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		effectiveJava.setNoOfCopies(5);
		System.out.println(effectiveJava.getNoOfCopies());
		cleanCode.setNoOfCopies(6);
		System.out.println(cleanCode.getNoOfCopies());
	}

}
