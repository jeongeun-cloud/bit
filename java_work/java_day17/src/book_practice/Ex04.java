package book_practice;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		int sum = 0;
		int avg = 0;
		
		while (true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			int rate = scan.nextInt();
			
			if(rate == 0) {
				System.exit(0);
			}

			v.add(rate);
			sum += rate;
			
			for(int i=0; i<v.size(); i++) {
				System.out.print(v.get(i) + " ");
			}
			
			avg = sum/v.size();
			
			System.out.println();
			System.out.println("���� ��� " + avg); 
		}
	}
}