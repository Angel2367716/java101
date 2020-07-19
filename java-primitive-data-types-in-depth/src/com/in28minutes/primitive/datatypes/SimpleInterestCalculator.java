package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal string;
	BigDecimal string2;

	public SimpleInterestCalculator(String string, String string2) {
		this.string = new BigDecimal(string);
		this.string2 = new BigDecimal(string2).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int i) {
		BigDecimal i = BigDecimal(string);
	}

}
