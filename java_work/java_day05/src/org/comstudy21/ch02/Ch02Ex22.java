package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex22 {
	static Scanner scan = new Scanner(System.in);
	
	public static void test(String[] args) {
		// ���� 3���� �Է� �޴´�
		// ū ��, ���� ���� �Ǻ��ؼ� �����Ѵ�.
		// ��, �������� ������� �ʱ�
		
		int a, b, c;
		int max, min;
		
		System.out.print("�Է� 1: ");
		a = scan.nextInt();
		System.out.print("�Է� 2: ");
		b = scan.nextInt();
		System.out.print("�Է� 3: ");
		c = scan.nextInt();
		
		if(a>b){
			if(a>c){
				max = a;
			} else {
				max = c;
			}
		}else {
			if(b>c){
				max = b;
			} else {
				max = c;
			}
		}
		
		if(a<b) {
			if(a<c){
				min = a;
			} else {
				min = c;
			}
		} else {
			if(b<c){
				min = b;
			} else { 
				min = c;
			}
		}
		
		System.out.println("MAX : "+max);
		System.out.println("MIN : "+min);
		
	}
	
	
	// 3���� ���� �Է� �޾�, max, mid, min ���
	
	public static void main(String[] args) {

		int a, b, c;
		int max, min, mid;
		
		System.out.print("�Է� 1: ");
		a = scan.nextInt();
		System.out.print("�Է� 2: ");
		b = scan.nextInt();
		System.out.print("�Է� 3: ");
		c = scan.nextInt();
		
		if(a>b){
			if(a>c){
				max = a;
				if(b>c){
					mid = b;
					min = c;
				}else {
					mid = c;
					min = b;
				}
			} else {
				max = c;
				if(a>b){
					mid = a;
					min = b;
				}else {
					mid = b;
					min = a;
				}
			}
		}else {
			if(b>c){
				max = b;
				if(a>c){
					mid = a;
					min = c;
				} else{
					mid = c;
					min = a;
				}
			} else {
				max = c;
				if(a>b){
					mid = a;
					min = b;
				} else { 
					mid = b;
					min = a;
				}
			}
		}

		
		System.out.println("MAX : "+ max);
		System.out.println("MID : "+ mid);
		System.out.println("MIN : "+ min);
		
	}
}
