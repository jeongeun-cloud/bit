package java_day06;

import java.util.Scanner;

public class Day05Homework2 {
static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
			
			int startDan = 0;
			int endDan = 0;
			
			do {
				System.out.print("���� ��(2~9���� �Է�): ");
				startDan = scan.nextInt();
			} while(startDan<2 || startDan >9 );
			System.out.println(">>> ���� �� �Է��� �����߽��ϴ�!");
			do {
				System.out.print("���� ��(2~9���� �Է�): ");
				endDan = scan.nextInt();
			} while(endDan<2 || endDan>9);
			System.out.println(">>> ���� �� �Է��� �����߽��ϴ�!");
			System.out.println();
			
			if(startDan>endDan) {
				int temp = startDan;
				startDan = endDan;
				endDan   = temp;
			}
				
			for(int dan=startDan; dan<=endDan; dan+=3) {
				for(int i=0; i<3; i++) {
					if(dan+i <= endDan) {
						System.out.printf("***%d***\t", dan+i);
					}
				}
				System.out.println();
				//---- ������ ���� �κ�
				for(int cnt=1; cnt<=9; cnt++) {
					for(int i=0; i<3; i++) {
						if(dan+i <= endDan) {
							System.out.printf("%d*%d=%d\t", dan+i, cnt, (dan+i)*cnt);
						}
					}
					System.out.println();
				}
			}
		}
		
	
}
