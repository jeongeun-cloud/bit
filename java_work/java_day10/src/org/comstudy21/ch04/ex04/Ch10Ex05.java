package org.comstudy21.ch04.ex04;

class Shape {
	// protected 로 하면 setter, getter 따로 만들지 않아도 됨
	protected double res;
	// 오버라이드를 목적으로 선언했다.
	public void area(){
		
	}
}


class Circle extends Shape{
	private int r;
	public Circle() {
		this(1);
	}
	public Circle(int r){
		this.r = r;
	}
	
	// setter getter
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public void area(){
		System.out.println(Math.PI * r * r);
	}
	
}


class Rectangle extends Shape{
	private int w;
	private int h;
	
	public Rectangle() {
		this(1,1);
	}
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void area(){
		System.out.println(w*h);
	}
	
}



class Triangle extends Shape{
	private int w;
	private int h;
	
	public Triangle() {
		this(1,1);
	}
	
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void area(){
		System.out.println(w*h/2);
	}
	
}


public class Ch10Ex05 {
	
	static void showShape(Shape shape) {
		System.out.print("도형의 면적은 : ");
		shape.area();
	}

	public static void main(String[] args) {
		Shape[] arr = {
			new Circle(10),
			new Rectangle(10,10),
			new Triangle(10, 10)
		};
		
		for(int i=0; i<arr.length; i++){
			showShape(arr[i]);
		}

	}

}
