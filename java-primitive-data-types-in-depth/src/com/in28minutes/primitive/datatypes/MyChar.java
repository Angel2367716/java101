package com.in28minutes.primitive.datatypes;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}

	public boolean isVowel() {
		// TODO Auto-generated method stub
		if (ch == 'a' || ch == 'A') {
			return true;
		}
		if (ch == 'e' || ch == 'E') {
			return true;
		}
		if (ch == 'i' || ch == 'I') {
			return true;
		}
		if (ch == 'o' || ch == 'O') {
			return true;
		}
		if (ch == 'u' || ch == 'U') {
			return true;
		}

		return false;
	}

	public char[] isNumber() {
		// TODO Auto-generated method stub

		return false;
	}

	public char[] isAlphabet() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub

	}

	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub

	}

}
