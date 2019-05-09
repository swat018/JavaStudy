package com.godofjava.chapter20;

public class NumberObjects {
	public static void main(String[] args) {
		NumberObjects sample = new NumberObjects();
		
		sample.personLong("r1024");
		sample.personLong("1024");
		sample.printOtherBase(1024);
	}
	public long personLong(String data) {
		long refLong = -1;
		try {
			refLong = Long.parseLong(data);
			System.out.println(refLong);
		} catch(NumberFormatException ne) {
			System.out.println(data + " is not a number.");
		} catch(Exception e) {
			
		}
		return refLong;
	}
	public void printOtherBase(long value) {
		System.out.println("Original: " + value);
		System.out.println("Binary  : " + Long.toBinaryString(value));
		System.out.println("Hex     : " + Long.toHexString(value));
		System.out.println("Octal   : " + Long.toOctalString(value));
	}
	
}
