package org.comstudy21.ch04;

import org.comstudy21.ch04.point.Point3D;

//// ���� Ŭ���� ����
//class Point2D {
//	protected int x; // ����Ŭ���������� ���ٰ���, Ŭ���� �ܺο����� ��� �Ұ���(�ٸ���Ű��)
//	public int y;
//}
//
//// ���� Ŭ���� ���� (���� Ŭ������ ��� �ʵ�� �޼ҵ带 ��� �޴´�.)
//// �����ڴ� ��� ���� �ʴ� ������ ���
//class Point3D extends Point2D {
//	public int z;
//}


class Ch04Ex20 {
	public static void main(String[] args) {
		// Point3D�� ��ü�� �����ϸ� ����Ŭ������ ����� x,y�� ��� ����
		Point3D p3d = new Point3D();
		//p3d.x = 100;	// protected�� �س��� �ٸ���Ű���� �����ϴ� ���� ��� �Ұ���
		p3d.setX(100);
		p3d.y = 200;
		p3d.z = 300;
		
		System.out.printf("x : %d, y : %d, z : %d", p3d.getX(), p3d.y, p3d.z);
	}

}
