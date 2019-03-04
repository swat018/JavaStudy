package com.godofjava.chapter8;

public class StaticBlockCheck {
	public static void main(String[] args) {
		StaticBlockCheck check = new StaticBlockCheck();
//		check.makeStaticBlockObject();
		check.makeStaticBlockObjectWithData();
	}
	
	public void makeStaticBlockObject() {
		System.out.println("Creating block1");
		staticBlock block1 = new staticBlock();
		System.out.println("Created block1");
		System.out.println("-------------------");
		System.out.println("Creating block2");
		staticBlock block2 = new staticBlock();
		System.out.println("Created block2");
	}
	public void makeStaticBlockObjectWithData() {
		System.out.println("data="+staticBlock.getData());
		staticBlock block1 = new staticBlock();
		block1.data = 1;
		System.out.println("-------------------");
		staticBlock block2 = new staticBlock();
		block2.data = 2;
		System.out.println("data="+staticBlock.getData());
	}
}
