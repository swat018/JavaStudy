package com.godofjava.chapter11;
import c.api.*;

public class APICheck {
	public static void main(String[] args) {
		APICheck check = new APICheck();
		check.useDeprecated();
	}
	public void useDeprecated() {
		String str = "abcee";
		byte[] strBytes = str.getBytes();
		String convertedStr = new String(strBytes,0);
	}
}
