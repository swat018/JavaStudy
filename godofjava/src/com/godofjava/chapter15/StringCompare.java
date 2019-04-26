package com.godofjava.chapter15;

public class StringCompare {

	public static void main(String[] args) {
		StringCompare sample = new StringCompare();
		sample.checkString();
		sample.checkCompare();
	}
	public void checkString() {
		String text = "You must know String class.";
		System.out.println("text.length()=" + text.length());
		System.out.println("text.isEmpty()=" + text.isEmpty());
	}
	public void checkCompare() {
		String text = "Check value";
//		String text2 = "Check value";
		String text2 = new String("Check value");
		String text3 = "Check value";
		if (text == text2) {
			System.out.println("text==text2 result is same.");
		} else {
			System.out.println("text==text2 result is different.");
		}
		
		if (text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same.");
		}
		
		if (text.equalsIgnoreCase(text3)) {
			System.out.println("text.equalsIgnoreCase(text3) result is same.");
		}
		
		String text4 = "a";
		String text5 = "b";
		String text6 = "c";
		System.out.println(text5.compareTo(text4));
		System.out.println(text5.compareTo(text6));
		System.out.println(text4.compareTo(text6));
	}
}
