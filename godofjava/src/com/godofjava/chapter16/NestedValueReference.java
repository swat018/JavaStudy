package com.godofjava.chapter16;

public class NestedValueReference {
	public int publicInt = 0;
	protected int protectedInt = 1;
	int justInt = 2;
	private int privateInt = 3;
	static int staticInt = 4;
	
	static class StaticNestied {
		public void setValue() {
			staticInt = 14;
		}
	}
	class Inner {
		
	}
}

