package book_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		
		char c = 'a';
		double sum = 0;
		
		for(int i=0; i<6; i++) {
			String s = scan.next();
			c = s.charAt(0);
			list.add(c);
			
			switch(c){
			case 'A' : sum += 4.0; break;
			case 'B' : sum += 3.0; break;
			case 'C' : sum += 2.0; break;
			case 'D' : sum += 1.0; break;
			case 'F' : sum += 0.0; break;
			}
	
		}
		System.out.println(sum/6);

	}
	
}
