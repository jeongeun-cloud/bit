package org.comstudy21.view;

import org.comstudy21.model.People;

public class Modify implements PhonebookView {

	@Override
	public void display() {
		System.out.println(":::: ���� ��� ::::");
		if(data.pArr.length == 0) {
			System.out.println("������ �����Ͱ� �����ϴ�!");
			return;
		}
		
		System.out.print("���� �� idx �Է� : ");
		int idx = scan.nextInt();
		boolean flag = false;
		
		for(int i=0; i<data.pArr.length; i++) {
			if(idx == data.pArr[i].getIdx()) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("���� �� �����͸� ã�� �� �����ϴ�.");
			display();
		} else {
			System.out.println("���� �� �����͸� ã�ҽ��ϴ�.");
			People newPeople = new People();
			newPeople.setIdx(idx);
			System.out.print("�� �̸� �Է� : ");
			newPeople.setName(scan.next());
			System.out.print("�� ��ȭ��ȣ : ");
			newPeople.setPhone(scan.next());
			data.people = newPeople;
		}

	}

}