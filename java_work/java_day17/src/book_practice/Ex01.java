package book_practice;

import java.util.Scanner;
import java.util.Vector;

public class Ex01 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		int max = 0;
		
		System.out.print("����(-1�� �Էµ� ������) >> ");
		
		while (true) {
			v.add(scan.nextInt());
			for (int i = 0; i < v.size(); i++) {
				if (v.elementAt(i) > max) {
					max = v.get(i);
				}
				
				if (v.elementAt(i) == -1) {
					System.out.println("���� ū���� " + max);
					System.exit(0);
				}
			} 
		}
	}

}
