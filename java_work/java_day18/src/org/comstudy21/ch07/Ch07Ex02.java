package org.comstudy21.ch07;

import java.util.Vector;

class Point {
	private int x,y;
	
	// 생성자 오버로딩
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// toString 메소드 오버라이드
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class Ch07Ex02 {
	
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		// 3개의 Point 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -9));
		
		v.remove(1); // 인덱스 1의 Point(-5,20) 객체 삭제
		
		printVector(v);
	}
	
	public static void printVector(Vector<Point> v) {
		for(Point p : v) {
			System.out.println(p);
		}
	}

}
