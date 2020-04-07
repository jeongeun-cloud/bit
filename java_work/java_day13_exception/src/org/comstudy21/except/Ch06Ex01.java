package org.comstudy21.except;

import java.util.Scanner;

public class Ch06Ex01 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String name = null;
		
		while (true) {
			try {
				System.out.println("name = " + name.toString());
				break;
			} catch (NullPointerException e) {
				System.out.println("예외 발생 : 문자열이 입력 되지 않았습니다.");
				System.out.print("성명 입력 : ");
				name = scan.next();
			} 
		}
		System.out.println("프로그램 종료!");
		scan.close();
	}
}
