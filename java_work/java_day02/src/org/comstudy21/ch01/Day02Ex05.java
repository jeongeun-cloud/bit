package org.comstudy21.ch01;

import java.io.IOException;

public class Day02Ex05 {
	
	public static void main(String[] args) {
		
		System.out.printf("%c, %d \n", '0', (int)'0');
		System.out.printf("%c, %d \n", 'A', (int)'A');
		System.out.printf("%c, %d \n", 'a', (int)'a');
		
	}
	
	
	public static void test(String[] args) throws IOException {
		//Scanner 통한 입력 (java.util)
		// 나이 입력 -> 이름 입력
		
		int age = 0; // 변수 선언 및 초기화
		int name = 0;
		
		System.out.print("나이입력 : ");
		age = System.in.read() - '0';
		System.in.read();
		System.in.read();
		
		System.out.print("이름입력 : ");
		name = System.in.read();

		System.out.printf("나이: %d, 이름: %c", age, name);
	}

}
