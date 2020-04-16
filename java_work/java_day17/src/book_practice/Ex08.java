package book_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Ex08 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> point = new HashMap<>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		
		
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			
			String userName = scan.next();
			int userP = scan.nextInt();
			
			
			if(userName.equals("그만")) {
				System.exit(0);
			}
			
			if(point.containsKey(userName)) {
				point.put(userName, point.get(userName)+userP);
			} else {
				point.put(userName, userP);
			}

	
			Set<String> keys = point.keySet();
			Iterator<String> it = keys.iterator();		
			
			
			while(it.hasNext()) {
				String key = it.next();
				int value = point.get(key);

				System.out.print("("+ key + ", " + value +") ");
				
			}
			System.out.println();
		
		}
	}
}
