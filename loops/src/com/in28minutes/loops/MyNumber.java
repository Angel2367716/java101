package com.in28minutes.loops;

public class MyNumber {
	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		// 2 to number -1
		// how can check if a number is divisible by 2?
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return false;
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
