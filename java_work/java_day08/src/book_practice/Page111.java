package book_practice;

import java.util.Scanner;

public class Page111 {
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.print("점 (x,y)의 좌표를 입력하시오 >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(x>=100 && x<=200) {
			if(y>=100 && y<=200) {
				System.out.printf("(%d,%d)는 사각형 안에 있습니다.",x,y);
			} else {
				System.out.printf("(%d,%d)는 사각형 안에 없습니다.",x,y);
			}
		} else {
			System.out.printf("(%d,%d)는 사각형 안에 없습니다.",x,y);
		}
		
	}
		
	
	public static void Ex06(String[] args) {
		
		System.out.print("1-99 사이의 정수를 입력하시오 >> ");
		int num = scan.nextInt();
		int div = num/10; // 10,20,30,40,50,60,70,80,90
		int div2 = num%10; //03, 13, 23, 33, 43, 53, 63, 

		if(div2 == 3 | div2 == 6 |div2 == 9){
			if(div == 3 | div == 6 | div == 9) {
				System.out.println("박수짝짝");
			} else{
				System.out.println("박수짝");
			}
		}
	}
	
	
}
