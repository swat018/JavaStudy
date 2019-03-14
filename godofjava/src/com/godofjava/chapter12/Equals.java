package com.godofjava.chapter12;

public class Equals {
	public static void main(String[] args) {
		Equals thisObject = new Equals();
//		thisObject.equalMethod();
		thisObject.equalMethod2();
	}
	public void equalMethod() {
		MemberDTO obj1 = new MemberDTO("SangMin");
		MemberDTO obj2 = new MemberDTO("SangMin");
		if(obj1 == obj2) {
			System.out.println("obj1 and obj2 is same");
		} else {
			System.out.println("obj1 and obj2 is difference");
		}
	}
	public void equalMethod2() {
		MemberDTO obj1 = new MemberDTO("SangMin");
		MemberDTO obj2 = new MemberDTO("SangMin");
		if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is same");
		} else {
			System.out.println("obj1 and obj2 is difference");
		}
	}
}
