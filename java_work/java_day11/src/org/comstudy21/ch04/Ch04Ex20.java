package org.comstudy21.ch04;

import org.comstudy21.ch04.point.Point3D;

//// 수퍼 클래스 선언
//class Point2D {
//	protected int x; // 서브클래스에서는 접근가능, 클래스 외부에서는 사용 불가능(다른패키지)
//	public int y;
//}
//
//// 서브 클래스 선언 (수퍼 클래스의 모든 필드와 메소드를 상속 받는다.)
//// 생성자는 상속 되지 않는 유일한 멤버
//class Point3D extends Point2D {
//	public int z;
//}


class Ch04Ex20 {
	public static void main(String[] args) {
		// Point3D로 객체를 생성하면 수퍼클래스의 멤버인 x,y도 사용 가능
		Point3D p3d = new Point3D();
		//p3d.x = 100;	// protected로 해놔서 다른패키지를 접근하는 것이 사용 불가능
		p3d.setX(100);
		p3d.y = 200;
		p3d.z = 300;
		
		System.out.printf("x : %d, y : %d, z : %d", p3d.getX(), p3d.y, p3d.z);
	}

}
