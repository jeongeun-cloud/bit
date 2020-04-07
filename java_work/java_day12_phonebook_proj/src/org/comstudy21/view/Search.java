package org.comstudy21.view;

import org.comstudy21.model.People;

public class Search implements PhonebookView {

	@Override
	public void display() {

		System.out.println(":::: �˻� ��� ::::");
		data.people = new People();
		System.out.print("�˻� �� �̸� : ");
		data.people.setName(scan.next());
		
	}

	public void display(People[] pArr) {
		System.out.println(":::: �˻� ��� ::::");
		if(pArr.length == 0) {
			System.out.println("------ �˻� ����� �����ϴ� ------");
			return;
		}
		
		for(People p : pArr) {
			System.out.println(p);
		}
		
	}

}
