package book_practice;

public class Student {
	private String name;
	private String major;
	private int num;
	private double avg;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String major, int num, double avg) {
		this.name = name;
		this.major = major;
		this.num = num;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "이름 : " + name + "\n학과 : " + major + "\n학번 : " + num + "\n평균 : " + avg ;
	}
	
	
}