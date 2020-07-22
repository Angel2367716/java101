package com.in28minutes.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(15);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("SumUptoN " + sum);
		//		int sumfOfDivisors = number.sumOfDivisors();
		//		number.printNumberTriangle();
	}

}
