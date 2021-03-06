package org.comstudy21.ch16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01Set {

	public static void main(String[] args) {
		// key도 없고, index도 없는 Set구조
		// Value의 중복이 없다.
		// <> 기호는 제네릭 : 사용 될 타입을 고정시킨다.
		// HashSet 뒤에 <>안에 타입은 생략해도 무방 (자바6부터)
		Set<String> set = new HashSet<>();
		set.add("오징어");
		set.add("꼴뚜기");
		set.add("대구");
		set.add("명태");
		set.add("거북이");
		set.add("명태"); // Value의 중복이 없기 때문에 중복되는 값은 set의 크기에 포함되지 않음 
		
		System.out.println("set의 크기 : " + set.size());
		
		// 열거자로 반환한다
//		Iterator<String> iterator = set.iterator();
//		while(iterator.hasNext()) { // 요소가 있는지
//			System.out.println(iterator.next()); 
//		}
		
		// 배열로 변환
		String[] arr = new String[set.size()];
		set.toArray(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}	
}



