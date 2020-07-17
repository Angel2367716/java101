package com.in28minutes.primitive.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());// 2+3
		System.out.println(numbers.multiply());// 2*3
		numbers.doubleValue();// double both numbers
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());

	}

}
