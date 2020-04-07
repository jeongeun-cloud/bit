package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex37 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 100;
		int div = 0;
		
		System.out.print("나눗수 입력 : ");
		div = scan.nextInt();
		
		try{
			System.out.println("100을 "+ div +"로 나눈 목 : " + 100/div);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
			// System.err.println("0으로 나눌 수 없습니다!"); //syserr (ctrl + space bar) 에러메세지
			main(null); // main 다시 호출
		}
		
		scan.close();
	}
	
	
	
	public static void test(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("나눗 수 입력 : ");
			int div = scan.nextInt();
			
			int res = 0;
			try {
				res = 100/div;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
				continue;
			}
			System.out.println("100을 "+div+"로 나눈 몫 : "+ res);
			break;
		}
		
		scan.close();
		
		
	}
}
