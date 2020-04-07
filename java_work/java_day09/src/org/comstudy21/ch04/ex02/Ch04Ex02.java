package org.comstudy21.ch04.ex02;

class Point {
	// private�� ��ü ���ο����� ���� �����ϴ�.
	private int x;
	private int y;
	
	// public�� ��ü �ܺ�(�ٸ� Ŭ����, �ٸ� ��Ű��)���� ���� ����
	// ĸ��ȭ�� ���ؼ� ��� �ʵ�� private �����ϰ�,
	// �׸��� �޼ҵ�� public���� �����Ѵ�. (�Ϲ����� Ŭ������ ����)
	
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
	
	
	// ���콺 ��Ŭ�� -> source -> Generate getters setters
	// this�� ��ü �ڽ��� ����Ű�� ���� �����̴�.
	
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
