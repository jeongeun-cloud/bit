package org.comstudy21.view;

import org.comstudy21.model.Dto;

public class Input implements View {
	
	@Override
	public void display() {
		System.out.println(inputTitle);
		Dto dto = new Dto();
		System.out.print("���� �Է� : ");
		dto.setName(scan.next());
		System.out.print("��ȭ ��ȣ : ");
		dto.setPhone(scan.next());
		// idx�� ������ ������� �� ó�� 
		
		data.dto = dto;
		System.out.println("---------- ���� �Է� �Ϸ� ! ----------");
		
	}

}