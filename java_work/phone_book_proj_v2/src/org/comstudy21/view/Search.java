package org.comstudy21.view;

import org.comstudy21.model.Dto;

public class Search implements View {
	
	@Override
	public void display() {
		System.out.println(searchTitle);
		
		data.dto = new Dto();
		System.out.print("�˻� �� �̸� �Է� : ");
		data.dto.setName(scan.next());
	}
	
	
	public void display(Dto[] arr) {
		System.out.println("---------- �˻� ��� ----------");
		if(arr.length == 0) {
			System.out.println("�˻� ����� �����ϴ�!");
			return;
		}
		for(Dto dto : arr) {
			System.out.println(dto);
		}
	}
	
	
}
