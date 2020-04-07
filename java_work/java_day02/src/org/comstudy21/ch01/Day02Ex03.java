package org.comstudy21.ch01;

import java.io.IOException;

public class Day02Ex03 {
	
	public static void main(String[] arg) throws IOException {
		// System.in 필드를 이용해서 데이터 입력 받기
		// Scanner를 이용하면 더 편리하다.
		
		System.out.print("나이 입력 : "); // 나이를 입력 받아서 출력한다.
		int age = System.in.read() - '0';   
		age = age * 10; //자릿 수 올려주기 
		age += System.in.read() - 48;  
		
		// 키보드의 아스키코드(유니코드)가 입력된다. 
		// 0 - 48, 1 - 49 , 2 - 50 , 3 - 51
		// System.in.read(); 는 한 번에 한 글자만 읽음 , 그래서 26 입력해도 50으로 출력. 
		
		
		System.out.printf("나이 : %d\n", age);
			
	}

}
