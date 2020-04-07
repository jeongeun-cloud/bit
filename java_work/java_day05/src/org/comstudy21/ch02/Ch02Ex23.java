package org.comstudy21.ch02;

import static java.lang.System.out;

import java.util.Scanner;

public class Ch02Ex23 {
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		/*
		 	 
		 ***2***	***3***		***4***
		 2*1=2		3*1=3
		 2*2=4		3*2=6
		 ...		...
		 
		 ***5***	***6***		***7***
		 
		 ***8***	***9***	
		 
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
	
	
	
	public static void test2(String[] args) {

		int startDan = 0;
		int endDan = 0;
		
		System.out.print("시작 단 : ");
		startDan = scan.nextInt();
		System.out.print("종료 단 : ");
		endDan = scan.nextInt();
		
		if(startDan>endDan){
			int tmp = startDan;	
			startDan = endDan;
			endDan = tmp;
		}
		
		for(int dan=startDan; dan<=endDan; dan++){
			System.out.printf("----%d단----\n", dan);
			for(int cnt=1; cnt<=9; cnt++){
				System.out.printf("%d*%d=%d \n", dan, cnt, dan*cnt);
			}
		}
	}
	
	
	public static void test(String[] args) {
		// 구구단 출력
		
		for(int dan =2; dan<=9; dan++){
			System.out.printf("---- %d단 ---- \n", dan);
			for(int cnt=1; cnt<=9; cnt++){
				System.out.printf("%d*%d=%d \n",dan, cnt, dan*cnt);
			}
		}
	}

}
