package book_practice;

import java.util.Scanner;

public class Ch02Ex14 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		String in = "";
		System.out.print("����, ����, �� �Է� : ");
		in = scan.nextLine();
		
		switch(in){
		case "����" : System.out.println(1); break;
		case "����" : System.out.println(2); break;
		case "��" : System.out.println(3); break;
		default : System.out.println(0); break;
		
		}
	}
}
