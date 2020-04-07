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
		pList.add(new Person("���γ�","010-1234-5678"));
		pList.add(new Person("ȫ�浿","010-1111-1111"));
		pList.add(new Person("��浿","010-2222-2222"));
		pList.add(new Person("������","010-3333-3333"));
		pList.add(new Person("������","010-4444-4444"));
				
		Person tmp = new Person("��浿","010-2222-2222");
		System.out.println(tmp.equals(pList.get(2)));
		// ��ü ArrayList���� indexOf�� ����Ϸ��� equals()�� ������ �ؾ� �Ѵ�.
		System.out.println(pList.indexOf(tmp));
	}

	
	
	public static void test(String[] args) {
		// ArrayList�� �迭�� �����ϴ�.
		// Set�� �޸� ���� �ߺ��� ����Ѵ�.
		// ��� ������ index�� �Ѵ�.
		ArrayList<String> list = new ArrayList<>();
		list.add("��¡��");
		list.add("�öѱ�");
		list.add("�뱸");
		list.add("����");
		list.add("�ź���");
		
		System.out.println(list.size());
		System.out.println(list);
		
		// add()�� append()��ɰ� insert()����� ��� �ִ�.
		list.add(2,"���");
		System.out.println(list);
		System.out.println(list.get(4));		 // ��ġ�� �ִ� ��Ұ� ����
		System.out.println(list.indexOf("����")); // �� ������ �ִ���

		// ���� - set()
		list.set(4, "��");
		System.out.println(list);
		
		// ���� - remove()
		list.remove(1);
		System.out.println(list);
	}

}
