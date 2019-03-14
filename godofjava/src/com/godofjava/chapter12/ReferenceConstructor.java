package com.godofjava.chapter12;

public class ReferenceConstructor {
	public static void main(String[] args) {
		ReferenceConstructor dto = new ReferenceConstructor();
		dto.makeMemberObject();
	}
	public void makeMemberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("Jinwoo");
		MemberDTO dto3 = new MemberDTO("Jinwoo","01051162882");
		MemberDTO dto4 = new MemberDTO("Jinwoo","01051162882","swat018@gmail.com");
		
		System.out.println(dto1);
		System.out.println(dto2);
		System.out.println(dto3);
		System.out.println(dto4);



	}

}
