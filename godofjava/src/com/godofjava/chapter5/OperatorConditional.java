package com.godofjava.chapter5;

public class OperatorConditional {
	public static void main(String[] args) {
		OperatorConditional operator = new OperatorConditional();
		operator.conditional();
	}
	public void conditional() {
		boolean x = true;
		boolean y = true;
		System.out.println(x && y);
		System.out.println(x || y );
		System.out.println("------");
		x = false;
		System.out.println(x && y);
		System.out.println(x || y );
		System.out.println("------");
		y = false;
		System.out.println(x && y);
		System.out.println(x || y );

	}
}
