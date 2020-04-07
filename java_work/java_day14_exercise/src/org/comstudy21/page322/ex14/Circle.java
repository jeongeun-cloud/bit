package org.comstudy21.page322.ex14;

public class Circle implements Shape {
	int x;
	
	public Circle(int x) {
		this.x = x;
	}
	
	@Override
	public void draw() {
		System.out.println("반지름이 " + x + "인 원입니다.");		
	}

	@Override
	public double getArea() {
		return x*x*PI;
	}
	

	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		
		for(int i=0; i<list.length; i++) {
			list[i].redraw();
		}
		
		for(int i=0; i<list.length; i++) {
			System.out.println("면적은 " + list[i].getArea());
		}

	}
	
}
