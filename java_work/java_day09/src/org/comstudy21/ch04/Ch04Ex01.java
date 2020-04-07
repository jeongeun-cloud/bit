package org.comstudy21.ch04;

// ���� ��Ű�� ������ ���� ����
// public class�� �ٸ� ��Ű�������� ���� ����
class Point { 	
	int x;
	int y;

	
	// ��� Ŭ������ Object Ŭ������ ���������� ��� �޴´�.
	// ����� �Ǹ� �θ� Ŭ������ ����� ������(Override) �����ϴ�.
	// toString() �޼ҵ� ������
	// ��ü�� ��� �� �� �ڵ����� ȣ��ȴ�.
	
	
	// toString + ctrl + space bar 
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "x=" + x + ", y=" + y;
//	}
	
	
	// ��Ŭ������ �ڵ�ȭ ���
	// ���콺 ��Ŭ�� - > Source - > Generate toString()...
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}


public class Ch04Ex01 {	

	public static void main(String[] args) {
		// ���������� �����Ѵ�.
		// Ŭ������ ����� ���� �ڷ���(type)�̴�.
		// Ŭ������ ������ ������ ����(reference)�����̴�.
		// ������������ ��ü�� �ּҰ� ����.
		Point pt01;
		// ��ü�� �����ؼ� ���������� �ּ�(������)�� �ѱ��.
		pt01 = new Point();
		
		// ���������� ���ؼ� ��ü���� ����� �����Ѵ�.
		// ������� ������ : ��(.)
		pt01.x = 100;
		pt01.y = 200;
		
		// ��ü�� ����� ���� Ȯ���Ѵ�.
		// System.out.println("x=" + pt01.x + ", y=" + pt01.y );
		System.out.println(pt01);	
		// => System.out.println(pt01.toString()); ���� 
		// toString�� �ڵ����� �����Ǳ� ������ �Ƚ��൵ ��
		
	}
	
}
