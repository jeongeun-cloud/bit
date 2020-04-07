package org.comstudy21.ch04.ex02;

class Point {
	// private은 객체 내부에서만 접근 가능하다.
	private int x;
	private int y;
	
	// public은 객체 외부(다른 클래스, 다른 패키지)에서 접근 가능
	// 캡슐화를 위해서 멤버 필드는 private 선언하고,
	// 그리고 메소드는 public으로 선언한다. (일반적인 클래스의 구조)
	
	// setters
	public void setX(int _x) {
		x = _x;
	}
	public void setY(int _y) {
		y = _y;
	}
	// getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	// 마우스 우클릭 -> source -> Generate getters setters
	// this는 객체 자신을 가리키는 참조 변수이다.
	
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


}

public class Ch04Ex02 {

	public static void main(String[] args) {
		Point pt = new Point();
		//pt.x = 100;
		//pt.y = 200;
		pt.setX(1000);
		pt.setY(2000);
		
		//System.out.println(pt);
		System.out.println("x=>" + pt.getX());
	}
	
}
