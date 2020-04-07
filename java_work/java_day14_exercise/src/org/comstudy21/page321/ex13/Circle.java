package org.comstudy21.page321.ex13;

public class Circle implements Shape {
	
	int x;

	@Override
	public void draw() {
		System.out.println("�������� " + x + "�� ���Դϴ�.");		
	}

	@Override
	public double getArea() {
		return x*x*PI;
	}

	public Circle(int x) {
		this.x = x;
	}
	
	
	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("������ " + donut.getArea());

	}
	
}
