package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex04 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 주소를 저장하는 배열을 선언한다.
		// 주소 3개를 저장하고 출력한다.
		// 주소 문자열의 길이를 함께 출력한다.
		
		String[] address = new String[3];
		
		for (int i=0; i<3; i++){
			System.out.print("주소를 입력하세요 : ");
			address[i] = scan.nextLine();
			
		}
		
		for (int i=0; i<3; i++){
			System.out.println("주소는 " + address[i] + "이고, 길이는 " + address[i].length()+"입니다");
		}
		
		
	}
}
