package org.comstudy21.ch04.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 참조변수 3개 준비
		People[] pArr = new People[3];
		
		// People 객체에 데이터를 저장하고 출력하라.
		// 3명의 성명과 전화번호를 입력 받아서 pArr 배열에 저장한다.
		
		for(int i=0; i<pArr.length; i++){
			// 방법 1.
			// pArr[i] = new People();
			// pArr[i].setIdx(i);
			
			
			// 1. People 객체를 만든다.
			People p = new People();
			
			// 2. People 객체에 값을 넣는다.
			p.setIdx(i);
			System.out.print("성명 입력 : ");
			p.setName(scan.next());
			System.out.print("전화번호 : ");
			p.setPhone(scan.next());
			
			// 3. People 객체를 pArr에 추가한다.
			pArr[i] = p;
			
		}
		
		System.out.println(Arrays.toString(pArr));
		
	}

}
