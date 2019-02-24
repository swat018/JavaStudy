package com.godofjava.chapter6;

public class ControlIf {
	public static void main(String[] args) {
		ControlIf control = new ControlIf();
//		control.ifStatement();
//		control.ifElseStatement();
//		control.ifAndOr();
		control.elseIf(85);
	}
	public void ifStatement() {
		if(true);
		if(true) System.out.println("It's true");
		if(true)
			System.out.println("It's also true");
		if(false) System.out.println("It's false");
	}
	public void ifElseStatement() {
		int intValue = 10;
		
		if (intValue > 5) System.out.println("It's bigger then 5.");
		else System.out.println("It's smaller or equal than 5.");
		
		if(intValue <= 5)
			System.out.println("It's smaller or equal than 5.");
		else
			System.out.println("It's bigger than 5.");
	}
	public void ifAndOr() {
		int age = 25;
		boolean isMarried = true;
		
		if(age > 25 && isMarried) {
			System.out.println("Age is over 25 and Married");
		}
		if(age > 25 || isMarried) {
			System.out.println("Age is over 25 and Married");
		}
	}
	public void tripleOrAnd() {
		int age = 25;
		boolean isMarried = true;
		double height = 180;
		if((age>25 || isMarried) && height >=180) {
			System.out.println("Age is over 25 or Married and height is over 180");
		}
	}
	public void elseIf(int point) {
		if(point>90) {	// 90점 초과일 경우
			System.out.println("A");
		} else if(point>80) {	// 90점 초과는 아니자만 80점  초과인 경우
			System.out.println("B");
		} else if(point>70) {	// 80점 초과는 아니지만 70점 초과인 경우
			System.out.println("C");
		} else if(point>60) {	// 70점 초과는 아니지만 60점 초과인 경우
			System.out.println("D");
		} else {	// 60점 초과가 아닌 모든 경우
			System.out.println("F");
		}
	}
}
