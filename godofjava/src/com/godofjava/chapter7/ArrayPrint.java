package com.godofjava.chapter7;

public class ArrayPrint {
	public static void main(String[] args) {
		ArrayPrint array = new ArrayPrint();
//		array.printString();
//		array.printPrimitiveArray();
		array.printArray();
	}
	public void printString() {
		System.out.println("strings="+new String[0]);
		System.out.println("array="+new ArrayPrint[0]);
	}
	public void printPrimitiveArray() {
		System.out.println("byteArray=" + new byte[1]);
		System.out.println("shortAray=" + new short[1]);
		System.out.println("intArray=" + new int[1]);
		System.out.println("longArray=" + new long[1]);
		System.out.println("float=" + new float[1]);
		System.out.println("doubleArray=" + new double[1]);
		System.out.println("charArray=" + new char[1]);
		System.out.println("booleanArray" + new boolean[1]);
	}
	public void printArray() {
		int [][]twoDim = {{1,2,3},{4,5,6}};
		System.out.println("twoDim.length="+twoDim.length);
		System.out.println("twoDim[0].length="+twoDim[0].length);
		
		int twoDimLength = twoDim.length;
		for(int oneLoop=0; oneLoop<twoDimLength; oneLoop++) {
			int twoDimOneLength = twoDim[oneLoop].length;
			for(int twoLoop=0; twoLoop<twoDimOneLength; twoLoop++) {
				System.out.println("twoDim["+oneLoop+"]["+twoLoop+"]="
						+twoDim[oneLoop][twoLoop]);
			}
		}
	}
}
