package book_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex07 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Double> school = new HashMap<String, Double>();
		System.out.println("미래장학금관리시스템입니다.");
		
		while(school.size()<5) {
			System.out.print("이름과 학점 >> ");
			
			String name = scan.next();
			double grade = scan.nextDouble();
			
			school.put(name, grade);
		}
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double stan = scan.nextDouble();
		
		Set<String> keys = school.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			String key = it.next();
			double value = school.get(key);
			if(value >= stan) {
				System.out.print(key + " ");
			}
		}
		
	}

}
