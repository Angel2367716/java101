package com.in28minutes.loops;

public class MyNumber {
	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {

		if (number < 2) {
			return false;
		}

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return false;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	//	public int sumUptoN() {
	//		return 0;
	//	}
	//
	//	public int sumOfDivisors() {
	//		return 0;
	//	}
	//
	//	public void printNumberTriangle() {
	//
	//	}


}
