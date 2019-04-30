package com.godofjava.chapter17;

import c.inheritance.Parent;

public class AnnotationOverride extends Parent {
	@Override
	public void printName() {
		System.out.println("AnnotationOverride");
	}
	
	public static void main(String[] args) {
		
	}
}
