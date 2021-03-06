package org.comstudy21.ch07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch07Ex03 {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		// 4명의 이름을 입력 받는다.
		for(int i=0; i<4; i++) {
			System.out.printf("이름 입력 %d >> ", i+1);
			String s = scan.next();
			a.add(s);
		}
		
		// 출력한다.
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		// 제일 긴 이름의 index 찾기
		int idx = 0;
		for(int i=0; i<a.size(); i++) {
			if(a.get(idx).length() < a.get(i).length()) {
				idx = i;
			}
		}
		// 제일 긴 이름 출력
		System.out.println();
		System.out.println("가장 긴 이름은 : " + a.get(idx));
		scan.close();
	}

}
