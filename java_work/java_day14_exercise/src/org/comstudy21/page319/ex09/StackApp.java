package org.comstudy21.page319.ex09;

import java.util.Scanner;

class StringStack implements Stack{

	int capacity;
	String[] stack;
	int top;
	
	public StringStack(int capacity) {
		this.capacity = capacity;
		stack = new String[capacity];
		top = 0;
	}

	@Override
	public int length() {
		return top;		
	}

	@Override
	public int capacity() {
		return capacity;
	}

	@Override
	public String pop() {
		return stack[--top];
	}

	@Override
	public boolean push(String val) {
		if(top >= capacity) {
			System.out.println("스택이 꽉 차서 푸시 불가");
			return false;
		}
		stack[top++] = val;
		return true;
	}
	
}

public class StackApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 : ");
		StringStack stack = new StringStack(scan.nextInt());
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String word = scan.next();
			if(word.equals("그만")) break;
			stack.push(word);
		}
		
		while(stack.length() >0 ) {
			System.out.print("스택에 저장된 모든 문자열 팝 : " + stack.pop() + " ");
		}

	}

}
