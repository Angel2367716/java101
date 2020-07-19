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

	public boolean isDigit() {
		// TODO Auto-generated method stub
		if (ch >= 48 && ch <= 57) {
			return true;
		}
		return false;
	}

	//use (int) 'a' to figure out the value of a on ch which is 97
	public boolean isAlphabet() {
		// between a to z and A to Z
		if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub

	}

	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub

	}

	public boolean isConsonant() {
		// Alphabet and it is not a Vowel
		// ! [a, e, i, o, u]
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

}
