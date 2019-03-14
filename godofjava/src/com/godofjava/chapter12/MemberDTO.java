package com.godofjava.chapter12;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	
	public MemberDTO() {
		// 아무 정보도 모를때
	}
	public MemberDTO(String name) {
		// 이름만 알때
		this.name = name;
	}
	public MemberDTO(String name, String phone) {
		//이름과 전화번호만 알때
		this.name = name;
		this.phone = phone;
	}
	public MemberDTO(String name, String phone, String email) {
		// 모든 정보를 알고 있을 때,
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String toString() {
		return "Name="+name+" Phone="+phone+" eMail="+email;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;					// 주소가 같으므로 당연히 true		
		if (obj == null) return false;					// obj가 null이므로 당연히 false
		if (getClass() != obj.getClass()) return false; // 클래스의 종류가 다르므로 false
		MemberDTO other = (MemberDTO) obj;				// 같은 클래스 이므로 형 변환 실행
		
		// 이제부터는 각 인스턴스 변수가 같은지 비교하는 작업 수행
		if (email == null) {							// email값이 null 일 때
			if (other.email != null)					
				return false;							// 비교 대상의 email값이 null이 아니면 false	
		} else if (!email.equals(other.email))			
			return false;								// 두 개의 email값이 다르면 false
		// email과 같은 비교 수행
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		// email. phone과 같은 비교 수행
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
}


