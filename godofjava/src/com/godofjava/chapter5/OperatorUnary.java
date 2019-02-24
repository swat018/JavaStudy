package com.godofjava.chapter5;

public class OperatorUnary {

	public static void main(String[] args) {
		OperatorUnary operator = new OperatorUnary();
		operator.unary();
	}

	public void unary() {
		int intVaule = -10;
		int result = +intVaule;
		System.out.println(result);
		result = -intVaule;
		System.out.println(result);
	}
}
