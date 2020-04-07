package org.comstudy21.ch02;

//static import
import static java.lang.System.out;

import java.util.Scanner;

public class Ch02Ex03 {
	public static void main(String[] args) {
		//데이터 입력을 위한 Scanner 객체 선언
		Scanner scan = new Scanner(System.in); //Scan 쓰고 ctrl + space bar 하고 맞는 거 찾아 클릭하면 임포트 들어감
				
		// 변수 선언		
		int cnt01 = 5, price = 2400, cnt02 = 12;
		
		out.print("cnt01 입력 : ");
		cnt01 = scan.nextInt();
		out.print("price 입력 : ");
		price = scan.nextInt();
		out.print("cnt02 입력 : ");
		cnt02 = scan.nextInt();
		
		
		out.printf("연필이 필통에 %d자루 있다.\n", cnt01);		
		out.printf("연필 한 다스는  %d원인데\n", price);		
		out.printf("한 다스에는 연필이 %d자루 있다.\n", cnt02);		
		
	}

}
