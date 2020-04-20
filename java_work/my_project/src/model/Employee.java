package model;

public class Employee {
	int no;
	String id;
	String pw;
	String name;
	String email;
	String birth;
	String sex;
	String code;

	public Employee() {
		this("","");
	}

	public Employee(String id) {
		this.id = id;
	}
	
	public Employee(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public Employee(int no, String id, String pw, String name, String email, String birth, String sex, String code) {
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.birth = birth;
		this.sex = sex;
		this.code = code;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", pw=" + pw + "]";
	}
	

}
