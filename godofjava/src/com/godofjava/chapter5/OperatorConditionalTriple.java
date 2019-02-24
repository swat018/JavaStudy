package com.godofjava.chapter5;

public class OperatorConditionalTriple {
	public static void main(String[] args) {
		OperatorConditionalTriple operator = new OperatorConditionalTriple();
		operator.doBindDate(30);
		operator.doBindDate(80);
	}
	public boolean doBindDate(int point) {
		boolean doBlindDataFlag = false;
		doBlindDataFlag = (point>=80) ? true : false;
		System.out.println(point+" : "+doBlindDataFlag);
		return doBlindDataFlag;
	}

}
