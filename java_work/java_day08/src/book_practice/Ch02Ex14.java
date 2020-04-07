package book_practice;

import java.util.Scanner;

public class Ch02Ex14 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		String in = "";
		System.out.print("가위, 바위, 보 입력 : ");
		in = scan.nextLine();
		
		switch(in){
		case "가위" : System.out.println(1); break;
		case "바위" : System.out.println(2); break;
		case "보" : System.out.println(3); break;
		default : System.out.println(0); break;
		
		}
	}
}
