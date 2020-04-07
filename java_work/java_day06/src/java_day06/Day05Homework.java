package java_day06;

import java.util.Scanner;

public class Day05Homework {
	static Scanner scan = new Scanner(System.in);
	
	// 괄호() 안에 매개변수 선언
	static void println(String message){ 
		System.out.println(message);
	}
	
	static void print(String message){
		System.out.print(message);
	}
	
	public static void main(String[] args) {
		int a, b, c;
		int max, mid, min;
		
		// 매개 변수로 인수 전달
		// 이클립스 복제 단축키 : Ctrl + Alt + 방향키
		// 이동 : Alt + 방향키
		// 행 삭제 : Ctrl + D
		print("정수 입력 1 : ");
		a = scan.nextInt();
		print("정수 입력 2 : ");
		b = scan.nextInt();
		print("정수 입력 3 : ");
		c = scan.nextInt();
		
		System.out.printf("입력 값 : %d, %d, %d\n", a, b, c);
		// 일단, 두 수를 비교해서 큰 것과 작은 것을 분류한다.
		// 남은 수를 큰 것과 비교해서 더 크면 남은 수가 가장 큰 수 
		// 아니면 작은 수와 비교해서 작은 수 보다 작으면 남은 수가 젤 작은 것
		// 단순화 하는 것이 기술이다. (할 수 있는 것부터 하자)
		
		if(a>b){
			max = a;
			min = b;
		} else {
			max = b;
			min =a;
		}
		// 모든 경우의 수를 생각한다.
		if(c>max){
			mid = max;
			max = c;
		} else {
			if(c<min){
				mid = min;
				min = c;
			} else {
				mid = c;
			}
		}
		System.out.println("max : " + max);
		System.out.println("mid : " + mid);
		System.out.println("min : " + min);
		
	}

	
	
	public static void homework01(String[] args) {		
		// 주말 과제 1   cnt  (9-cnt)
		
		// *********	5	4
		// **** ****	4	5
		// ***   ***	3	6
		// **     **	2	7
		// *       *	1	8
		// **     **	2	7
		// ***   ***	3	6
		// **** ****	4	5
		// *********	5	4
		
		// for문을 9회전 하면서 5,4,3,2,1,2,3,4,5 출력 되도록 한다.
		int cnt = 5;
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				System.out.print(j<cnt || j>=9-cnt?"*":" ");
			}
			
			System.out.println();
			cnt = i<4?cnt-1 : cnt+1;
		}
		
	}
}
