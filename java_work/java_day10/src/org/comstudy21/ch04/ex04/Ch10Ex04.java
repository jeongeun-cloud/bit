package org.comstudy21.ch04.ex04;


class 할배 {
	public void 나팔() {
		System.out.println("할배가 나팔을 분다~ ");
	}
}

// is A 관계
class 아배 extends 할배 {
	@Override
	public void 나팔() {
		System.out.println("아배가 나팔을 분다~");
	}
}

// is A 관계
class 손자 extends 아배 {
	
	public void 나팔() {
		System.out.println("손자가 나팔을 분다~");
	}
}


public class Ch10Ex04 {
	
	public static void main(String[] args) {
		할배 hal = new 할배();
		hal.나팔(); // 할배 나팔
		
		hal = new 아배();
		hal.나팔(); // 아배 나팔
		
		hal = new 손자();
		// 손자 son = new 할배(); 불가능
		hal.나팔(); // 손자 나팔
		
		// 모든 클래스는 Object를 묵시적으로 상속 받는다.
		Object obj = hal; // 묵시적으로 상속 받아서 가능
		// 부모 클래스에 선언 되지 않은 자손의 멤버는 호출 할 수 없다.
		// obj.나팔(); // 그래서 불가능
		// 자손으로 형변환(캐스팅) 하면 호출 가능하다.
		((아배)obj).나팔(); // 그래서 가능 - > 결과는 손자로만
		
	}

	
	public static void test(String[] args) {
		할배 halbe = new 할배();
		아배 abe = new 아배();
		손자 sonja = new 손자();
		
		System.out.println(sonja instanceof 손자);
		System.out.println(sonja instanceof 아배);
		System.out.println(sonja instanceof 할배);
		
		System.out.println(halbe instanceof 손자);
		System.out.println(halbe instanceof 아배);
		System.out.println(halbe instanceof 할배);

	}

}
