package org.comstudy21.ch04;

class Super {
	String name;
//	public Super() {
//		System.out.println("수퍼 클래스 생성자");
//	}
	
	// 생성자 오버로딩
	public Super(String name) {
		this.name = name;
		System.out.println("수퍼 클래스의 인자 있는 생성자");
	}
	public void showData() {
		System.out.println("부모클래스의 showData 호출");
		System.out.println("name = " + this.name);
	}
}

class Sub extends Super {
	public Sub() {
		// 생성자 호출 전에 다른 문장이 올 수 없다.
		// 명시적으로 부모 클래스의 생성자를 호출 해야 한다.
		super("Ju");
		System.out.println("서브 클래스 생성자");
	}
	public void showData() {
		super.showData(); // 수퍼클래스의 showData 호출
		//showData(); // 이렇게만 쓰면 재귀호출
		//System.out.println("name = " + super.name);
	}
}

public class Ch04Ex21 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.showData();
	}

}
