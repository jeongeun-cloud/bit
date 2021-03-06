package org.comstudy21.page321.ex12;

import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}


public class GraphicEditor {
	private Shape start;
	private Shape cur;
	private Shape tail;
	private int length;
	
	Scanner scan = new Scanner(System.in);
	
	private int menu() {
		System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >>> ");
		return scan.nextInt();
	}
	
	private void insert() {
		System.out.print("Line(1), Rect(2), Circle(3) >>> ");
		Shape newNode = null; 
		switch(scan.nextInt()) {
		case 1 : newNode = new Line(); break;
		case 2 : newNode = new Rect(); break;
		case 3 : newNode = new Circle(); break;
		default : System.out.println("해당 사항 없습니다!"); return;
		}
		
		// start가 null이면 start에 newNode 대입하고
		// null이 아니면 tail의 next에 대입한다.
		if(start == null) {
			start = newNode;
			tail = start;
			return;
		}
		tail.setNext(newNode);
		tail = tail.getNext();
	}

	private void delete() {
		System.out.print("삭제 할 도형의 위치>> ");
		int idx = scan.nextInt();
		if(idx>length) {
			System.out.println("삭제 할 수 없습니다.");
			return;
		}
		if(idx == 1) {
			start = start.getNext();
			return;
		}
		cur = start;
		int cnt = 2;
		while(cur.getNext() != null) {
			if(cnt == idx) {
				cur.setNext(cur.getNext().getNext());
				return;
			}
			cur = cur.getNext();
			cnt++;
		}
	}
	
	private void print() {
		if(start == null) {
			return;
		}
		cur = start;
		while(cur.getNext() != null) {
			cur.draw();
			cur = cur.getNext();
		}
		cur.draw();
	}
	
	private void finish() {
		System.out.println("beauty를 종료합니다.");
		System.exit(0);
	}
	
	
	public GraphicEditor() {
		while(true) {
			switch(menu()) {
			case 1 : insert(); break;
			case 2 : delete(); break;
			case 3 : print(); break;
			case 4 : finish(); break;
			default : System.out.println("해당 사항 없습니다!");
			}
		}
	}

	
	public static void main(String[] args) {
		new GraphicEditor();
	}

	
}
