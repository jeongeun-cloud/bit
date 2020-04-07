package org.comstudy21.ch04.point;

//수퍼 클래스 선언
class Point2D {
	protected int x; // 서브클래스에서는 접근가능, 클래스 외부에서는 사용 불가능(다른패키지)
	public int y;
}

//서브 클래스 선언 (수퍼 클래스의 모든 필드와 메소드를 상속 받는다.)
//생성자는 상속 되지 않는 유일한 멤버
public class Point3D extends Point2D {
	public int z;
	
	public void setX(int x) { 
		super.x = x;
	}

	public int getX() {
		return x;
	}
	
}
