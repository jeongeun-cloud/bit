package book_practice;

import java.util.Scanner;

public class Page110 {
	static Scanner scan = new Scanner(System.in);
	
	
	public static void ex01(String[] args) {

		int won = 0;
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>> ");
		won = scan.nextInt();
		
		double usd = won/1100;
		System.out.println(won+"���� $"+usd+"�Դϴ�.");
		
	}
	
	
	
	public static void ex02(String[] args) {
		
		int num = 0;
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>> ");
		num = scan.nextInt();
		
		if(num/10 == num%10){
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else{
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		
	}
	
	
	
	public static void ex03(String[] args) {
		
		int money = 0;
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		money = scan.nextInt();
		
		if(money/50000>=1){
			int a = money/50000;
			money %= 50000;
			System.out.println("�������� " + a);
		}
		if(money/10000>=1){
			int b = money/10000;
			money %= 10000;
			System.out.println("������ " + b);
		}
		if(money/1000>=1){
			int d = money/1000;
			money %= 1000;
			System.out.println("õ���� " + d);
		}
		if(money/500>=1){
			int e = money/500;
			money %= 500;
			System.out.println("����� " + e);
		}
		if(money/100>=1){
			int f = money/100;
			money %= 100;
			System.out.println("��� " + f);
		}
		if(money/50>=1){
			int g = money/50;
			money %= 50;
			System.out.println("���ʿ� " + g);
		}
		if(money/10>=1){
			int h = money/10;
			money %= 10;
			System.out.println("�ʿ� " + h);
		}
		if(money/1>=1){
			int i = money;
			System.out.println("�Ͽ� " + i);
		}
		
	}
	
	
	public static void ex04(String[] args) {
		int a,b,c;
		int min,mid,max;
		
		System.out.print("���� 3�� �Է� >> ");
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
		
		
		System.out.println("�߰� ���� " + mid);
	}
	
	
	
	
	public static void ex05(String[] args) {
		
		int a,b,c;
		
		System.out.print("���� 3���� �Է��Ͻÿ� >> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		
		while(!(a>0 && b>0 && c>0)){
			System.out.println("���� ����!");
			System.out.print("���� 3���� �Է��Ͻÿ� >> ");
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
		}
		
		if(a+b<c || a+c<b || b+c<a){
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		}else {
			System.out.println("�ﰢ���� �˴ϴ�");
		}
		
	}
	
	
}
