package com.godofjava.chapter5;

public class OperatorCompound {

	public static void main(String[] args) {
		OperatorCompound sample = new OperatorCompound();
		sample.compound();
	}
	public void compound() {
		int intValue = 10;
		int result = intValue + 5;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 5;
		System.out.println(result);
		result /= 5;
		System.out.println(result);
		result %= 5;
		System.out.println(result);
	}

}
