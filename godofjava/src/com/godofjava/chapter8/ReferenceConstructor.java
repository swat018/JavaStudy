package com.godofjava.chapter8;

public class ReferenceConstructor {
	public static void main(String[] args) {

	}
	public void makeMemberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("Jinwoo");
		MemberDTO dto3 = new MemberDTO("Jinwoo","01051162882");
		MemberDTO dto4 = new MemberDTO("Jinwoo","01051162882","swat018@gmail.com");
	}
}
