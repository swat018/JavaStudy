package com.godofjava.chapter13;
import com.godofjava.chapter13.MemberDTO;

public class FinalReferenceType {
	final MemberDTO dto = new MemberDTO();
	
	public static void main(String args[]) {
		FinalReferenceType referenceType = new FinalReferenceType();
		referenceType.checkDTO();
		
	}
	public void checkDTO() {
		System.out.println(dto);
//		dto = new MemberDTO();
		
		dto.name = "sangmin";
		System.out.println(dto);
	}
}
