package book_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Location> locationMap = new HashMap<>();
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		
		while(locationMap.size()<4) {
			System.out.print(">> ");
			Location location = new Location();
			String s = scan.nextLine();
			String[] sArr = s.split(", ");
			location.setCity(sArr[0]);
			location.setLongitude(Integer.parseInt(sArr[1]));
			location.setLatitude(Integer.parseInt(sArr[2]));
			
			locationMap.put(sArr[0], location);
		}
		
		// �ؽø� ��ü �˻�
		Set<String> keys = locationMap.keySet();
		Iterator<String> it = keys.iterator();
		System.out.println("----------------------");
		while(it.hasNext()) {
			String key = it.next();
			Location value = locationMap.get(key);
			System.out.println(value.toString());
		}
		System.out.println("----------------------");

		while(true) {
			System.out.print("�����̸� >> ");
			String city = scan.next();
			if(city.equals("�׸�")) {
				System.exit(0);
			}
			
			if(locationMap.get(city) == null) {
				System.out.println(city + "�� �����ϴ�.");
			} else {
				System.out.println(locationMap.get(city).toString());
			}
			
		}
	}
}