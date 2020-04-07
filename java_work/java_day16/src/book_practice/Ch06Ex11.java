package book_practice;

import java.util.Random;

// 이론문제 11번 
public class Ch06Ex11 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			System.out.print(100 + rand.nextInt(156));
			System.out.print(" ");
		}
	}
	
	public static void test(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.print((int)(100 + Math.random()*156));
			System.out.print(" ");
		}
	}

}
