package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex10 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 나이를 입력 받는다.
		// 미성년자, 청년, 장년, 노년을 구분하는 프로그램 
		// 0~19, 20~40, 41~65, 66~
		
		int age = 0;
		String result ="미성년자";
		
		System.out.print("나이 입력 : ");
		age = scan.nextInt();
		
		while (age < 0 || age > 150){ //(!(age >= 0 && age <= 150))
			System.out.println("Error! 유효하지 않은 값입니다!");
			System.out.print("나이 입력 : ");
			age = scan.nextInt();
		}
		

//		do ~ while 로 바꿀 시, while 뒤에 세미콜론 필수!
//				
//		do{
//			System.out.println("Error! 유효하지 않은 값입니다!");
//			System.out.print("나이 입력 : ");
//			age = scan.nextInt();
//		}while (age < 0 || age > 150);
			
			
		if(age<20){
			System.out.println(result);
		}else if(age <= 40){
			result = "청년";
			System.out.println(result);
		}else if(age <= 65){
			result = "장년";
			System.out.println(result);
		}else{
			result = "노년";
			System.out.println(result);
		}
		
		
		
	//	if(age > 65){
	//		result = "노년";
	//	}else if(age > 40){
	//		result = "장년";
	//	}else if(age > 19){
	//		result = "청년";
	//	}
	//	System.out.printf("%d세는 %s입니다", age, result);	
		
	}
}
