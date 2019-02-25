package com.godofjava.chapter7;

public class ArrayLength {
	public static void main(String[] args) {
		ArrayLength array = new ArrayLength();
		array.printArrayLength();
	}
	public void printArrayLength() {
		int[] oneDim = new int[3];
		int[][] twoDim = new int[4][2];
		System.out.println(oneDim.length);
		System.out.println(twoDim.length);
	}
}
