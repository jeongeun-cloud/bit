package org.comstudy21.ch16;

import java.util.ArrayList;

class Person {
	private String name;
	private String phone;
	
	public Person() {}

	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}


public class Ex02ArrayList {
	
	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<>();
		pList.add(new Person("유인나","010-1234-5678"));
		pList.add(new Person("홍길동","010-1111-1111"));
		pList.add(new Person("김길동","010-2222-2222"));
		pList.add(new Person("주정은","010-3333-3333"));
		pList.add(new Person("일지매","010-4444-4444"));
				
		Person tmp = new Person("김길동","010-2222-2222");
		System.out.println(tmp.equals(pList.get(2)));
		// 개체 ArrayList에서 indexOf를 사용하려면 equals()를 재정의 해야 한다.
		System.out.println(pList.indexOf(tmp));
	}

	
	
	public static void test(String[] args) {
		// ArrayList는 배열과 유사하다.
		// Set과 달리 값의 중복을 허용한다.
		// 요소 접근은 index로 한다.
		ArrayList<String> list = new ArrayList<>();
		list.add("오징어");
		list.add("꼴뚜기");
		list.add("대구");
		list.add("명태");
		list.add("거북이");
		
		System.out.println(list.size());
		System.out.println(list);
		
		// add()는 append()기능과 insert()기능이 모두 있다.
		list.add(2,"상어");
		System.out.println(list);
		System.out.println(list.get(4));		 // 위치에 있는 요소가 뭔지
		System.out.println(list.indexOf("명태")); // 몇 번지에 있는지

		// 수정 - set()
		list.set(4, "고래");
		System.out.println(list);
		
		// 삭제 - remove()
		list.remove(1);
		System.out.println(list);
	}

}
