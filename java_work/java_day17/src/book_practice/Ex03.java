package book_practice;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		
		System.out.println("나라 이름과 인구를 입력하세요. (예 : Korea 5000)");
		
		while (true) {
			System.out.print("나라이름, 인구 >> ");
			String key = scan.next();
			if (key.equals("그만")) {
				break;
			} else {
				Integer value = scan.nextInt();
				nations.put(key, value);
			}			
		}
		
		while (true) {
			System.out.print("인구 검색 >> ");
			String ppl = scan.next();
			
			if (ppl.equals("그만")) {
				System.exit(0);
			} else {
				if (nations.get(ppl) == null) {
					System.out.println(ppl + " 나라는 없습니다.");
				} else {
					System.out.println(ppl + "의 인구는 " + nations.get(ppl));		
				}
			}
		}
	}

}
