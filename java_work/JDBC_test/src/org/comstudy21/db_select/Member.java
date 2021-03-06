package org.comstudy21.db_select;

public class Member {
	int no;
	String name;
	String email;
	String phone;
	
	public Member() {
		this(0, "", "", "");
	}

	public Member(int no, String name, String email, String phone) {
		this.no = no;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
}
