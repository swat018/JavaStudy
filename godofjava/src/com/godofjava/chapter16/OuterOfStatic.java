package com.godofjava.chapter16;

public class OuterOfStatic {
	static class StaticNested {
		private int value = 0;
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
	}

}