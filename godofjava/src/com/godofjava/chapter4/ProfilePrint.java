package com.godofjava.chapter4;

public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;
	
	public void setAge(byte paramAge) {
		this.age = paramAge;
	}
	public byte getAge() {
		return this.age;
	}
	public void setName(String paramName) {
		this.name = paramName;
	}
	public String getName() {
		return this.name;
	}
	public void setMarried(boolean flag) {
		this.isMarried = flag;
	}
	public boolean getMarried() {
		return this.isMarried;
	}
	
	public static void main(String[] args) {
		ProfilePrint profilePrint = new ProfilePrint();
		byte age = 35;
		String name = "jinwoo";
		boolean isMarried = true;
		
		profilePrint.setAge(age);
		System.out.println("Age="+profilePrint.getAge());
		profilePrint.setName(name);
		System.out.println("name="+profilePrint.getName());
		profilePrint.setMarried(isMarried);
		System.out.println("Married="+profilePrint.getMarried());
		
	}

}
