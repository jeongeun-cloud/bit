package org.comstudy21.page321.ex13;

public class Circle implements Shape {
	
	int x;

	@Override
	public void draw() {
		System.out.println("반지름이 " + x + "인 원입니다.");		
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
		System.out.println("면적은 " + donut.getArea());

	}
	
}
