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
			System.out.println("������ �� ���� Ǫ�� �Ұ�");
			return false;
		}
		stack[top++] = val;
		return true;
	}
	
}

public class StackApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� ���� ���� ������ ũ�� �Է� : ");
		StringStack stack = new StringStack(scan.nextInt());
		
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String word = scan.next();
			if(word.equals("�׸�")) break;
			stack.push(word);
		}
		
		while(stack.length() >0 ) {
			System.out.print("���ÿ� ����� ��� ���ڿ� �� : " + stack.pop() + " ");
		}

	}

}
