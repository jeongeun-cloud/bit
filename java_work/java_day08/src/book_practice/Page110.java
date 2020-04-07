package book_practice;

import java.util.Scanner;

public class Page110 {
	static Scanner scan = new Scanner(System.in);
	
	
	public static void ex01(String[] args) {

		int won = 0;
		
		System.out.print("원화를 입력하세요(단위 원)>> ");
		won = scan.nextInt();
		
		double usd = won/1100;
		System.out.println(won+"원은 $"+usd+"입니다.");
		
	}
	
	
	
	public static void ex02(String[] args) {
		
		int num = 0;
		System.out.print("2자리수 정수 입력(10~99)>>> ");
		num = scan.nextInt();
		
		if(num/10 == num%10){
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else{
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
	}
	
	
	
	public static void ex03(String[] args) {
		
		int money = 0;
		System.out.print("금액을 입력하시오>> ");
		money = scan.nextInt();
		
		if(money/50000>=1){
			int a = money/50000;
			money %= 50000;
			System.out.println("오만원권 " + a);
		}
		if(money/10000>=1){
			int b = money/10000;
			money %= 10000;
			System.out.println("만원권 " + b);
		}
		if(money/1000>=1){
			int d = money/1000;
			money %= 1000;
			System.out.println("천원권 " + d);
		}
		if(money/500>=1){
			int e = money/500;
			money %= 500;
			System.out.println("오백원 " + e);
		}
		if(money/100>=1){
			int f = money/100;
			money %= 100;
			System.out.println("백원 " + f);
		}
		if(money/50>=1){
			int g = money/50;
			money %= 50;
			System.out.println("오십원 " + g);
		}
		if(money/10>=1){
			int h = money/10;
			money %= 10;
			System.out.println("십원 " + h);
		}
		if(money/1>=1){
			int i = money;
			System.out.println("일원 " + i);
		}
		
	}
	
	
	public static void ex04(String[] args) {
		int a,b,c;
		int min,mid,max;
		
		System.out.print("정수 3개 입력 >> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if(a>b){
			max = a;
			min = b;
		} else {
			max = b;
			min =a;
		}

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
		
		
		System.out.println("중간 값은 " + mid);
	}
	
	
	
	
	public static void ex05(String[] args) {
		
		int a,b,c;
		
		System.out.print("정수 3개를 입력하시오 >> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		
		while(!(a>0 && b>0 && c>0)){
			System.out.println("숫자 오류!");
			System.out.print("정수 3개를 입력하시오 >> ");
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
		}
		
		if(a+b<c || a+c<b || b+c<a){
			System.out.println("삼각형이 안됩니다");
		}else {
			System.out.println("삼각형이 됩니다");
		}
		
	}
	
	
}
