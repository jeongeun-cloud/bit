package org.comstudy21.page322.ex14;

public class Oval implements Shape {
	int x,y;
	
	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println(x + "*" + y + "�� �����ϴ� Ÿ���Դϴ�.");		
	}

	@Override
	public double getArea() {
		return x * y* PI;
	}

}