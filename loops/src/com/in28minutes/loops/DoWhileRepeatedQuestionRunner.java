package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Cube is " + (number * number * number));
	}

}
