package com.godofjava.chapter13;

import com.godofjava.chapter13.MemberDTO;

public interface MemberManager {
	public boolean addMember(MemberDTO member);
	public boolean removeMember(String name, String phone);
	public boolean updateMember(MemberDTO member);
}
