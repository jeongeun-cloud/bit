package book_practice;

import java.util.Scanner;

public class Ex09 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			System.out.print("철수 [가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
			int user = scan.nextInt();
			int com = (int)(Math.random()*3 + 1);
			
			
			if(user == com) {
				System.out.println("비겼습니다!");
			} else {
				switch(user){
				case 1 : 
					switch(com) {
					case 2 :
						System.out.println("철수(가위) : 컴퓨터(바위)");
						System.out.println("컴퓨터가 이겼습니다.");
						break;
					case 3 : 
						System.out.println("철수(가위) : 컴퓨터(보)");
						System.out.println("철수가 이겼습니다.");
						break;
					}
				break;
					
				case 2 : 
					switch(com) {
					case 1 :
						System.out.println("철수(바위) : 컴퓨터(가위)");
						System.out.println("철수가 이겼습니다.");
						break;
					case 3 : 
						System.out.println("철수(바위) : 컴퓨터(보)");
						System.out.println("컴퓨터가 이겼습니다.");
						break;
					}
				break;
				
				case 3 : 
					switch(com) {
					case 1 :
						System.out.println("철수(보) : 컴퓨터(가위)");
						System.out.println("컴퓨터가 이겼습니다.");
						break;
					case 2 : 
						System.out.println("철수(보) : 컴퓨터(바위)");
						System.out.println("철수가 이겼습니다.");
						break;
					}
				break;
				
				case 4 : 
					System.out.println("프로그램 종료!");
					System.exit(0);
				}
	
			}
		}
		
	}
}
