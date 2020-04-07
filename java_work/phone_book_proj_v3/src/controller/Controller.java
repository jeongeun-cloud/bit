package controller;

import static resource.R.*;

import view.Search;

public class Controller {
	
	public static void search() {
		viewArr[3].display();
		data.dtoArr = dao.select(data.dto);
		((Search)viewArr[3]).display(data.dtoArr);
	}

	public static void service() {
		
		try {
			viewArr[data.no].display();
			
			switch(data.no) {
			case 1 : 
				viewArr[data.no].display();
				dao.insert(data.dto);
				break;
			case 2 : 
				data.dtoArr = dao.show();
				viewArr[data.no].display();
				break;
			case 3 : 
				search();
				break;
			case 4 : 
				search();
				viewArr[data.no].display();
				if(data.dto.getIdx() != 0) {
					dao.update(data.dto);
				}
				break;
			case 5 : 
				search();
				viewArr[data.no].display();
				if(data.dto.getIdx() != 0) {
					dao.remove(data.dto);
				}
				break;
			case 6 : 
				System.out.println("---------- ���α׷� ����! ----------");
				System.exit(0);
				break;
			default : 
				System.out.println("�ش���� �����ϴ�.");
				break;
			}
		} catch (NullPointerException e) {
			System.out.println("�ش� �޴��� �غ���� �ʾҽ��ϴ�.");
		}
		
		// no�� 0���� �ʱ�ȭ �� �� service ���ȣ��
		data.no = 0;
		service();
	}
	
}
