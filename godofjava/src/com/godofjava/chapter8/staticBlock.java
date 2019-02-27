package com.godofjava.chapter8;

public class staticBlock {
	static int data = 1;
	public staticBlock() {
		System.out.println("StaticBlock Constructor");
	}
	
	static {
		System.out.println("*** First static block. ***");
		data = 3;
	}
	
	static {
		System.out.println("*** Second static block ***");
		data = 5;
	}
	
	public static int getData() {
		return data;
	}
}
