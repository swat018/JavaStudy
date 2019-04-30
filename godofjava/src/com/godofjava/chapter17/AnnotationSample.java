package com.godofjava.chapter17;

public class AnnotationSample {
	public static void main(String[] args) {

	}
	@SuppressWarnings("deprecation")
	public void useDeprecated() {
		AnnotationDeprecated child = new AnnotationDeprecated();
		child.noMoreUse();
	}
}
