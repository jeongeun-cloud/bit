package org.comstudy21.ch04.point;

//���� Ŭ���� ����
class Point2D {
	protected int x; // ����Ŭ���������� ���ٰ���, Ŭ���� �ܺο����� ��� �Ұ���(�ٸ���Ű��)
	public int y;
}

//���� Ŭ���� ���� (���� Ŭ������ ��� �ʵ�� �޼ҵ带 ��� �޴´�.)
//�����ڴ� ��� ���� �ʴ� ������ ���
public class Point3D extends Point2D {
	public int z;
	
	public void setX(int x) { 
		super.x = x;
	}

	public int getX() {
		return x;
	}
	
}
