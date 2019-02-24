package com.godofjava.chapter4;

public class PrimitiveTypes {
	int intDefault1;
	byte byteDefault;
	short shortDefault;
	long longDefault;
	float floatDefault;
	double doubleDefault;
	char charDefault;
	boolean booleanDefault;
	
	public static void main(String[] args) {
		PrimitiveTypes types = new PrimitiveTypes();
		//types.checkByte();
		//types.checkOtherTypes();
		//types.checkChar();
		//types.checkBoolean();
		types.defaultValues();
	}
	public void checkByte() {
		byte byteMin = -128;
		byte byteMax = 127;
		System.out.println("byteMin="+byteMin);
		System.out.println("byteMax="+byteMax);
		byteMin = (byte)(byteMin-1);
		byteMax = (byte)(byteMax+1);
		System.out.println("byteMin-1="+byteMin);
		System.out.println("byteMax+1="+byteMax);
	}
	public void checkOtherTypes() {
		short shortMax = 32767;
		int intMax = 2147483647;
		long longMax = 9223372036854775807L;
		System.out.println("shortMax="+shortMax);
		System.out.println("intMax="+intMax);
		System.out.println("longMax="+longMax);
		shortMax = (short)(shortMax+1);
		intMax = (int)(intMax+1);
		longMax = (long)(longMax+1);
		System.out.println("shortMax+1="+shortMax);
		System.out.println("intMax+1="+intMax);
		System.out.println("longMax+1="+longMax);
	}
	public void checkChar() {
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println("charMin=["+charMin+"]");
		System.out.println("charMax=["+charMax+"]");
		int intValue = 'a';
		System.out.println("intValue=["+intValue+"]");
	}
	public void checkBoolean() {
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
	}
	public void defaultValues() {
		System.out.println("byteDefault="+byteDefault);
		System.out.println("shortDefault="+shortDefault);
		System.out.println("intDefault="+intDefault1);
		System.out.println("longDefault="+longDefault);
		System.out.println("floatDefault="+floatDefault);
		System.out.println("doubleDefault="+doubleDefault);
		System.out.println("charDefault="+charDefault);
		System.out.println("booleanDefault="+booleanDefault);
	}
	
}
