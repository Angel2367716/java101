package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		//Type obj = new Type (argument);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();


		System.out.println("The Options you have are the following");

		System.out.println("1 - add");
		System.out.println("2 - subtract");
		System.out.println("3 - divide");
		System.out.println("4 - multiply");

		System.out.print("choose Operator: ");
		int operator = scanner.nextInt();

		System.out.println("your choices are");
		System.out.println("Number1 " + number1);
		System.out.println("Number2 " + number2);
		System.out.println("Operator " + operator);

		//		if (operator == "1") {
		//
		//			System.out.println(number1 + number2);
		//
		//		} else if (operator == "2") {
		//			System.out.println(number1 - number2);
		//
		//		} else if (operator == "3") {
		//			System.out.println(number1 / number2);
		//		} else if (operator == "4") {
		//			System.out.println(number1 * number2);
		//		}
	}
}
