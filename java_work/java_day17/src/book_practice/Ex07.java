package book_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex07 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Double> school = new HashMap<String, Double>();
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		
		while(school.size()<5) {
			System.out.print("�̸��� ���� >> ");
			
			String name = scan.next();
			double grade = scan.nextDouble();
			
			school.put(name, grade);
		}
		
		System.out.print("���л� ���� ���� ���� �Է� >> ");
		double stan = scan.nextDouble();
		
		Set<String> keys = school.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.print("���л� ���� : ");
		while(it.hasNext()) {
			String key = it.next();
			double value = school.get(key);
			if(value >= stan) {
				System.out.print(key + " ");
			}
		}
		
	}

}