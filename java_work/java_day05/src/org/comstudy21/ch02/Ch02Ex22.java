package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex22 {
	static Scanner scan = new Scanner(System.in);
	
	public static void test(String[] args) {
		// 정수 3개를 입력 받는다
		// 큰 수, 작은 수를 판별해서 츌력한다.
		// 단, 논리연산자 사용하지 않기
		
		int a, b, c;
		int max, min;
		
		System.out.print("입력 1: ");
		a = scan.nextInt();
		System.out.print("입력 2: ");
		b = scan.nextInt();
		System.out.print("입력 3: ");
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
	
	
	// 3개의 수를 입력 받아, max, mid, min 찍기
	
	public static void main(String[] args) {

		int a, b, c;
		int max, min, mid;
		
		System.out.print("입력 1: ");
		a = scan.nextInt();
		System.out.print("입력 2: ");
		b = scan.nextInt();
		System.out.print("입력 3: ");
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
