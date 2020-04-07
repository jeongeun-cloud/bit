package org.comstudy21.controller;

import static org.comstudy21.resource.R.*;

import org.comstudy21.model.People;


public class PhonebookController {
	
	// 3�� �޴� �Լ�ȭ
	public void search() {
		// �˻��� �Է�
		search.display();
		// �˻�� �̿��ؼ� dao���� �˻�
		data.pArr = dao.select(data.people);
		// �˻������ resource�� ��Ƶΰ� �ٽ� ��� �̵�
		search.display(data.pArr);
	}
	
	public void service() {
		
		if(data.no == 0) {
			menu.display();
		}
		
		switch(data.no) {
		case 1 :
			input.display(); 
			// ���ҽ��� �ִ� �����͸� �𵨷� �ѱ��.
			People dto = data.people;
			dao.insert(dto);
			break;
		case 2 : 
			// ��� ���� ���ҽ����� �����͸� �����´�.
			data.pArr = dao.select();
			output.display(); 
			break;
		case 3 :
			search();
			break;
		case 4 :
			// 3�� �޴� ��Ȱ��
			search();
			// modify���� idx(People)�� �Է� �޾Ƽ� resource�� ��Ƶΰ� 
			modify.display();
			// controller������ resource�� idx(People)�� �޾Ƽ� dao�� ���� ������� ����.
			dao.modify(data.people);
			break;
		case 5 :
			search();
			delete.display();
			// null or not
			if(data.people == null) {
				System.out.println("���� ����� �����ϴ�.");
				return;
			}
			dao.delete(data.people);
			break;
		case 6 : 
			System.out.println(">>> ���α׷� ����!");
			System.exit(0); 
			break;
		default : System.out.println("�ش� �޴��� �غ� ���� �ʾҽ��ϴ�.");
		}
		
		data.no = 0;
		service();
	}
}
