package org.comstudy21.ch04;

// 같은 패키지 내에서 접근 가능
// public class는 다른 패키지에서도 접근 가능
class Point { 	
	int x;
	int y;

	
	// 모든 클래스는 Object 클래스를 묵시적으로 상속 받는다.
	// 상속이 되면 부모 클래스의 멤버를 재정이(Override) 가능하다.
	// toString() 메소드 재정의
	// 객체를 사용 할 때 자동으로 호출된다.
	
	
	// toString + ctrl + space bar 
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "x=" + x + ", y=" + y;
//	}
	
	
	// 이클립스의 자동화 기능
	// 마우스 우클릭 - > Source - > Generate toString()...
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}


public class Ch04Ex01 {	

	public static void main(String[] args) {
		// 참조변수를 선언한다.
		// 클래스는 사용자 정의 자료형(type)이다.
		// 클래스로 선언한 변수는 참조(reference)변수이다.
		// 참조변수에는 객체의 주소가 들어간다.
		Point pt01;
		// 객체를 생성해서 참조변수에 주소(참조값)를 넘긴다.
		pt01 = new Point();
		
		// 참조변수를 통해서 객체내의 멤버를 접근한다.
		// 멤버접근 연산자 : 점(.)
		pt01.x = 100;
		pt01.y = 200;
		
		// 객체에 저장된 값을 확인한다.
		// System.out.println("x=" + pt01.x + ", y=" + pt01.y );
		System.out.println(pt01);	
		// => System.out.println(pt01.toString()); 같음 
		// toString은 자동으로 생성되기 때문에 안써줘도 됌
		
	}
	
}
