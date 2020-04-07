package org.comstudy21.ch02;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch02Ex24 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
/*
		 
		 ***2***	***3***		***4***
		 2*1=2		3*1=3		4*1=4
		 2*2=2		3*2=6		4*2=8
		 ...		...			...
		 
		 ***5***	***6***		***7***
		 ...		...			....
		 
		 ***8***	***9***
		 ...		...
		 
*/
		for(int dan=2; dan<=9; dan+=3) {
			for(int i=0; i<3; i++) {
				if(dan+i != 10) {
					out.printf("***%d***\t", dan+i);
				}
			}
			System.out.println();
			//---- 구구단 들어가는 부분
			for(int cnt=1; cnt<=9; cnt++) {
				for(int i=0; i<3; i++) {
					if(dan+i != 10) {
						out.printf("%d*%d=%d\t", dan+i, cnt, (dan+i)*cnt);
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void test02(String[] args) {
		int startDan = 0;
		int endDan = 0;
		
		out.print("시작 단: ");
		startDan = scan.nextInt();
		out.print("종료 단: ");
		endDan = scan.nextInt();
		
		if(startDan>endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan   = temp;
		}
		
		for(int dan=startDan; dan<=endDan; dan++) {
			System.out.printf("***%d***\n", dan);
			for(int cnt=1; cnt<=9; cnt++) {
				System.out.printf("%d*%d=%d\n", dan, cnt, dan*cnt);
			}
		}
	}

	public static void test01(String[] args) {
		// 구구단 출력
		for(int dan=2; dan<=9; dan++) {
			System.out.printf("***%d***\n", dan);
			for(int cnt=1; cnt<=9; cnt++) {
				System.out.printf("%d*%d=%d\t",dan, cnt, dan*cnt);
			}
			System.out.println();
		}
	}

}
